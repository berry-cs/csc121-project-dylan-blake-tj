import processing.core.PApplet;
import processing.event.KeyEvent;
import processing.event.MouseEvent;

public interface IWorld {
	
    public IWorld update();
    
    PApplet draw(PApplet p);
    
    IWorld keyPressed(KeyEvent kev);
    
	IWorld mousePressed(MouseEvent mev);
}