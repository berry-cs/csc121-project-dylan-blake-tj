import processing.core.PApplet;
import processing.event.KeyEvent;
import processing.event.MouseEvent;

public class EndWorld implements IWorld{
	private String endGameText;
	
	public EndWorld(String endGameText) {
		this.endGameText = endGameText;
	}
	
	@Override
	public IWorld update() {
		return this;
	}

	@Override
	public PApplet draw(PApplet c) {
		c.background(0);
		c.textSize(40);
		c.fill(255);
		c.text(endGameText, 70, 150);
		c.textSize(20);
		c.text("Press 'r' to restart", 75, 200);
		return c;
	}

	@Override
	public IWorld keyPressed(KeyEvent kev) {
		if (kev.getKey() == 'r') {
			return new StartWorld();
		} else {
			return this;
		}
	}

		@Override
		public IWorld mousePressed(MouseEvent mev) {
			return this;
		}

	}
