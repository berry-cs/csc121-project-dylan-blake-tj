import processing.core.PApplet;
import processing.event.KeyEvent;
import processing.event.MouseEvent;

public class StartWorld implements IWorld{
	Button start = new Button(300/2 - 50, 300/2, 100, 50, 255);

	@Override
	public IWorld update() {
		return this;
	}

	@Override
	public PApplet draw(PApplet c) {
		c.background(42);
		c.textSize(40);
		c.fill(255);
		c.text("121 Game", 80, 100);
		this.start.Draw(c);
		this.start.checkButton(c);
		c.textSize(20);
		c.fill(42);
		c.text("Start Game", 104, 184);
		return c;
		
	}

	@Override
	public IWorld keyPressed(KeyEvent kev) {
		return this;
	}

	@Override
	public IWorld mousePressed(MouseEvent mev) {
		if (this.start.isPressed(mev.getX(), mev.getY())) {
            return new PlayWorld(
				new BasketBall(new Posn(150,260), new Posn(4, -2), 10),
				new Hoop(new Posn(250,230),new Pole(100,10),new Board(50,10),20),
				new Player(150,260,20,10,15),
				3600,
				0,
				new Posn(120,300));
              } else {
              return this;
              }
	
		}
}
