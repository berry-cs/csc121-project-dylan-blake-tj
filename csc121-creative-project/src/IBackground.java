import java.util.Random;

import processing.core.PApplet;

public interface IBackground {
	public void draw(PApplet c);
	public int textColor(); // produces the color value that text should be drawn on top of the background
}

class BlueSkyCloudBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		int move = 40;
		c.background(102, 102, 255);

		// first cloud
		c.fill(255);
		c.rect(100 - move, 50,70,20);

		c.fill(255);
		c.stroke(255);
		c.circle(100 - move,50,40);

		c.fill(255);
		c.stroke(255);
		c.circle(110 - move,53,40);

		c.fill(255);
		c.stroke(255);
		c.circle(120 - move,30,40);

		c.fill(255);
		c.stroke(255);
		c.circle(130 - move,50,40);

		c.fill(255);
		c.stroke(255);
		c.circle(140 - move,30,40);

		c.fill(255);
		c.stroke(255);
		c.circle(145 - move,57,40);

		c.fill(255);
		c.stroke(255);
		c.circle(155 - move,45,40);

		c.fill(255);
		c.stroke(255);
		c.circle(160 - move,55,40);

		// second cloud
		c.fill(255);
		c.rect(100 + move*2, 50 + move,70,20);

		c.fill(255);
		c.stroke(255);
		c.circle(100 + move*2,50 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(110 + move*2,53 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(120 + move*2,30 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(130 + move*2,50 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(140 + move*2,30 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(145 + move*2,57 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(155 + move*2,45 + move,40);

		c.fill(255);
		c.stroke(255);
		c.circle(160 + move*2 ,55 + move,40);



		c.noStroke();		
	}

	@Override
	public int textColor() {
		return 255;
	}
}
	
class MoonBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(224,224,224);
		c.circle(100, 100, 50);

		c.fill(47,79,79);
		c.stroke(169);
		c.circle(100, 115, 10);
		c.noStroke();

		c.fill(47,79,79);
		c.stroke(169);
		c.circle(90, 95, 15);
		c.noStroke();

		c.fill(47,79,79);
		c.stroke(169);
		c.circle(115, 100, 10);
		c.noStroke();
		}
	
	@Override
	public int textColor() {
		return 255;
	}
}

class secondBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(170, 74, 68);
		c.circle(100, 100, 100);

		c.fill(255);
		c.stroke(47,79,79);
		c.ellipse(100, 55, 35,10);
		c.noStroke();

		c.fill(255);
		c.stroke(47,79,79);
		c.ellipse(100, 145, 30,10);
		c.noStroke();

		c.fill(136, 8, 8);
		c.stroke(136,0,0);
		c.circle(120, 100, 12);
		c.noStroke();

		c.fill(136, 8, 8);
		c.stroke(136,0,0);
		c.circle(80, 80, 25);
		c.noStroke();

		c.fill(136, 8, 8);
		c.stroke(136,0,0);
		c.circle(95, 120, 18);
		c.noStroke();
		
	}

	@Override
	public int textColor() {
		return 255;
	}
	
}

class thirdBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(152, 251, 152);
		c.circle(100, 100, 150);


		// stars
		c.fill(255);
		c.circle(215,150,4);
		c.fill(255);
		c.circle(240,70,4);
		c.fill(255);
		c.circle(150,30,4);
		c.fill(255);
		c.circle(200,95,4);
		c.fill(255);
		c.circle(260,30,4);
		c.fill(255);
		c.circle(20,180,4);
		c.fill(255);
		c.circle(120,200,4);
		c.fill(255);
		c.circle(60,20,4);
		c.fill(255);
		c.circle(20,20,4);
		c.fill(255);
		c.circle(85,230,4);
		c.fill(255);
		c.circle(170,225,4);
		c.fill(255);
		c.circle(185,190,4);

	}

	@Override
	public int textColor() {
		return 255;
	}
	
}

class fourthBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(0,0,255);
		c.circle(100, 100, 150);

		c.fill(255);
		c.stroke(255);
		c.ellipse(75, 75, 60, 2);

		c.fill(255);
		c.stroke(255);
		c.ellipse(125, 125, 60, 2);
		c.noStroke();
	}

	@Override
	public int textColor() {
		return 255;
	}
	
}

class fifthBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(204,153,102);
		c.circle(100, 100, 150);

		c.noFill();
		c.stroke(150,75,0);

		c.noFill();
		c.arc(100, 100, 200, 10, (float) 0.0 , (float) 3.14159 );
		c.line(5, 105, 195, 110);
		c.line(5, 110, 195, 105);

		c.noStroke();		
	}

	@Override
	public int textColor() {
		return 255;
	}
	
}

class PlutoBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		
		
		c.fill(128,0,0);
		c.circle(100, 100, 150);
		c.fill(255);
		c.noStroke();
		
		// snow on pluto
		c.circle(125, 80, 85);
		c.circle(135, 100, 80);
		c.circle(150, 85, 45);
		c.circle(100, 70, 45);
		c.circle(100, 60, 50);
		c.circle(115, 55, 60);
		c.circle(140, 120, 45);
		c.circle(135, 120, 60);
		c.circle(145, 125, 20);
		c.circle(150, 130, 30);
		c.circle(100, 50, 50);
		c.circle(150, 140, 20);
		c.circle(140, 140, 40);
		c.circle(100, 50, 20);		
	}

	@Override
	public int textColor() {
		return 255;
	}
	
}

class seventhBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(255,153,204);
		c.circle(100, 100, 150);
		c.fill(0);
		c.circle(150, 125, 150);
		c.fill(255, 174, 66);
		c.circle(200, 100, 40);
		c.fill(173, 216, 230);
		c.circle(160, 165, 30);		
	}

	@Override
	public int textColor() {
		return 255;
	}
	
}

class SpaceBackground implements IBackground {

	@Override
	public void draw(PApplet c) {
		c.background(0);
		c.fill(104,71,141);		
		
		c.circle(100, 100, 150);
		
		c.fill(255, 255, 0);
		c.circle(215, 60, 30);
		
		c.stroke(255, 255, 0);
		c.line(171, 80, 200,70);
		c.line(163, 60, 200,63);
		c.line(174, 105, 205,73);
		c.noStroke();
		
		Random rand = new Random();
		int rand_int1 = rand.nextInt(0,255);
        int rand_int2 = rand.nextInt(0,255);
        int rand_int3 = rand.nextInt(0,255);
		
		c.fill(rand_int1,rand_int2,rand_int3);
		
		// stars
		c.circle(215,150,4);
				
		c.circle(240,70,4);
				
		c.circle(150,30,4);
				
		c.circle(200,95,4);
				
		c.circle(260,30,4);
				
		c.circle(20,180,4);
				
		c.circle(120,200,4);
				
		c.circle(60,20,4);
				
		c.circle(20,20,4);
		
		c.circle(85,230,4);
				
		c.circle(170,225,4);
				
		c.circle(185,190,4);
		
	}

	@Override
	public int textColor() {
		return 255;
	}
	
}
