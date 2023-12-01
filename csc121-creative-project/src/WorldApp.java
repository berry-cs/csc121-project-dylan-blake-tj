import processing.core.PApplet;
import processing.event.*;
import java.util.*;
import java.io.*;



/**
 * Provides the scaffolding to launch a Processing application
 */
public class WorldApp extends PApplet {
	IWorld w;
	IWorld s;

	public void settings() {
		this.size(300, 300);
	}

	public void setup() {
		s = new StartWorld();
		/*
		  move the Button from PLayWorld into STartWorld 
		 
		     the draw method of StartWorld --- the -1 case of the draw() in PlayWorld currently
		     mousePressed of StartWorld --- check if the button is pressed 
		                  if (this.button.isPressed(mev.getX(), mev.getY()) {
		                    return new PlayWorld(
								new BasketBall(new Posn(150,260), new Posn(4, -2), 10),
								new Hoop(new Posn(250,230),new Pole(100,10),new Board(50,10),20),
								new Player(150,260,20,10,15),
								3600,
								-1,
								new Posn(120,300), new Button(width/2 - 50, height/2, 100, 50, 255)
								);
			                  } else {
			                  return this;
			                  }
		     update and keyPressed will just be empty ---  `return this;`
		 */
		/*
		w = new PlayWorld(
				new BasketBall(new Posn(150,260), new Posn(4, -2), 10),
				new Hoop(new Posn(250,230),new Pole(100,10),new Board(50,10),20),
				new Player(150,260,20,10,15),
				3600,
				0,
				new Posn(120,300));
		
		}
		*/
	}

	public void draw() {
		
		s = s.update();
		s.draw(this);
		//w = w.update();
		//w.draw(this);

	}


	public void mousePressed(MouseEvent mev) { s = s.mousePressed(mev); }


	public void keyPressed(KeyEvent kev) {  s = s.keyPressed(kev); }


	public static void main(String[] args) {
		PApplet.runSketch(new String[] { "CircleApp" }, new WorldApp());
	}
}