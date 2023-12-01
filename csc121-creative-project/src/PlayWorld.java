
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import processing.core.*;
import processing.event.*;

public class PlayWorld implements IWorld {
	BasketBall ball;
	Hoop hoop;
	Player p;
	int time;
	int score;
	Posn shotVertex;
	IBackground[] bkgs = {new BlueSkyCloudBackground(), 
			new MoonBackground(), new secondBackground(), new thirdBackground(), 
			new fourthBackground(), new fifthBackground(), new PlutoBackground(), 
			new seventhBackground(), new SpaceBackground()
				};

	public PlayWorld(BasketBall ball, Hoop hoop, Player p, int time, int score, Posn shotVertex) {
		this.ball = ball;
		this.hoop = hoop;
		this.p = p;
		this.time = time;
		this.score = score;
		this.shotVertex = shotVertex;
	}

	/**
	 * Renders a picture of the drop on the window
	 */

	public PApplet draw(PApplet c) {
		//int move = 40;
		
		if (score <= 8) {
		this.bkgs[score].draw(c);
		c.fill(this.bkgs[score].textColor());
		c.textSize(15);
		c.text(score,10,10);
		c.text(time/60, 280,10);
		
		
		this.ball.draw(c);
		this.p.draw(c);
		this.hoop.draw(c);
			/*
			this.saveScore();
			this.copyScores();
			this.orderScores();
			*/
		}
		

/*
		switch(score) {
		case -1:
			c.background(42);
			c.textSize(40);
			c.fill(255);
			c.text("121 Game", 80, 100);
			this.start.Draw(c);
			c.textSize(20);
			c.fill(42);
			c.text("Start Game", 104, 184);
			this.start.checkButton(c);
			if (start.isPressed(c)) {
				score++;
			}
			break;
		case 0:
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




			c.fill(0);
			c.textSize(15);
			c.text(score,10,10);
			c.text(time/60, 280,10);
			
			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 1:
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

			c.fill(255, 255, 255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 2:
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

			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

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


			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 3:
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



			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;

		case 4:
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


			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 5:
			c.background(0);
			c.fill(204,153,102);
			c.circle(100, 100, 150);

			c.noFill();
			c.stroke(150,75,0);
			//c.ellipse(100,100,200,10);

			c.noFill();
			c.arc(100, 100, 200, 10, (float) 0.0 , (float) 3.14159 );
			c.line(5, 105, 195, 110);
			c.line(5, 110, 195, 105);

			c.noStroke();

			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 6:
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

			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 7:
			c.background(0);
			c.fill(255,153,204);
			c.circle(100, 100, 150);
			c.fill(0);
			//c.circle(50, 75, 3);
			c.circle(150, 125, 150);
			c.fill(255, 174, 66);
			c.circle(200, 100, 40);
			c.fill(173, 216, 230);
			c.circle(160, 165, 30);
			
			
			
			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			break;
		case 8:
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
			
			//c.fill(255);
			
			c.circle(240,70,4);
			
			//c.fill(255);
			
			c.circle(150,30,4);
			
			//c.fill(255);
			
			c.circle(200,95,4);
			
			
			//c.fill(255);
			
			c.circle(260,30,4);
			
			//c.fill(255);
			
			c.circle(20,180,4);
			
			//c.fill(255);
			
			c.circle(120,200,4);
			
			//c.fill(255);
			
			c.circle(60,20,4);
			
			//c.fill(255);
			
			c.circle(20,20,4);
			
			//c.fill(255);
			
			c.circle(85,230,4);
			
			//c.fill(255);
			
			c.circle(170,225,4);
			
			//c.fill(255);
			
			c.circle(185,190,4);
			
			c.fill(255);
			c.text(score,10,10);
			c.text(time/60, 280,10);

			this.ball.draw(c);
			this.p.draw(c);
			this.hoop.draw(c);
			if(time <= 0) {
				c.background(0);
				c.textSize(40);
				c.fill(255);
				c.text("Times Up!", 70, 150);
				this.saveScore();
				this.copyScores();
				this.orderScores();
			}
			this.saveScore();
			this.copyScores();
			this.orderScores();
			break;
		case 9:
			c.background(0);
			c.textSize(40);
			c.text("You Win!", 80, 150);

		} 
*/

		return c;


	}

	/**
	 * Produces an updated world
	 */

	public IWorld update() {
		int increment = 1;
		IWorld state = this;

		if (score > -1) {
		if(ball.loc.y >= shotVertex.y) {
			state = new PlayWorld(this.ball.move(), hoop, p, time - increment, score, shotVertex);
		} else {
			state = new PlayWorld(this.ball.move(), hoop, p, time - increment, score, shotVertex);
		}
		}

		if(
				( (ball.loc.y <= hoop.loc.y & ball.loc.y >= hoop.loc.y - hoop.b.getHeight()) & 
						(ball.loc.x >= hoop.loc.x - hoop.b.getWidth()/2 )

				)) {
			//this.ball.vel = new Posn(-this.ball.vel.x, this.ball.vel.y);
			state = new PlayWorld(this.ball.hit(), hoop, p, time - increment, score, shotVertex);
		} 

		if(this.hoop.shotIn(this.ball.loc)) {
			Random rand = new Random();
			p.x = rand.nextInt(0, 200);
			state = new PlayWorld(this.ball.move(), hoop, p, time - increment,  score + increment, shotVertex);
		}
		
		if(score > 8) {
			this.saveScore();
			this.copyScores();
			this.orderScores();
			state = new EndWorld("You Won!");
		}
		
		if(time <= 0) {
			this.saveScore();
			this.copyScores();
			this.orderScores();
			state = new EndWorld("Time's Up!");
		}




		return state;
	}

	public PlayWorld keyPressed(KeyEvent key) {
		char k = key.getKey();

		// int positionChange = 5;

		/*if (k == 'a') {
			return new World(ball, hoop,
					p.move(-positionChange,0), time,score,shotVertex);

		} else if (k == 'd') {
			return new World(ball, hoop,
					this.p.move(positionChange,0), time,score,shotVertex);
		} */  
		if (k=='e') {
			this.saveScore();
			this.copyScores();
			this.orderScores();
			System.exit(0);
		} 

		return this;
	}

	/**
	 * Produces an updated world with the position of the drop updated to the
	 * location of the mouse press.
	 */
	public PlayWorld mousePressed(MouseEvent mev) { 
		
		
		int reducePower = 15;

		Posn vertex = new Posn(mev.getX(),mev.getY()); 

		return new PlayWorld(
				new BasketBall(
						new Posn(p.returnX(), p.returnY()), 
						new Posn( (vertex.x - p.returnX()) / reducePower, (vertex.y - p.returnY()) / reducePower), 
						ball.radius),
				hoop,p,time,score, vertex); 
	}

	public void saveScore() {
		try {
			PrintWriter pw = new PrintWriter(new File("scores.txt"));
			pw.print(this.score);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copyScores() {

		try {

			// open file with scores
			File f = new File("output.txt");

			// found on internet to add text to existing files
			FileWriter fw = new FileWriter("output.txt",true); 
			BufferedWriter bw = new BufferedWriter(fw); 
			PrintWriter pw = new PrintWriter(bw);

			// open file with score of game
			Scanner sc = new Scanner(new File("scores.txt"));

			if (f.length() == 0) {

				System.out.println("file empty");

				// open file with score of game
				while(sc.hasNextInt()) {
					int s = sc.nextInt();
					pw.println(s);
				}

				System.out.println("added score");


				bw.close();
				fw.close();
				pw.close();

			} else if (f.length() > 0) {

				Scanner df = new Scanner(new File("output.txt"));

				/** copies score from current game to the output.txt file **/

				while ( sc.hasNextInt()) {
					int s = sc.nextInt();
					pw.println(s);
				}


				/** sorts the current entries in the output file **/
				/*
				// create an empty array
				ArrayList<Integer> al = new ArrayList<Integer>();

				// add all the current integers into an ArrayList
				while (df.hasNextInt()) {
					int s = df.nextInt();
					al.add(s);
				}
				// sort the array list
				Collections.sort(al);


				for(int s : al) {
					pw.println(s);
				}

				sc.close();				


			}*/

				bw.close();
				fw.close();
				pw.close();


			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	public void orderScores() {
		try {
			File scores = new File("output.txt");

			Scanner sc = new Scanner(new File("output.txt"));
			PrintWriter pw = new PrintWriter(new File("leaderboard.txt"));

			/** sorts the current entries in the output file **/

			// create an empty array
			ArrayList<Integer> al = new ArrayList<Integer>();

			// add all the current integers into an ArrayList
			while (sc.hasNextInt()) {
				int s = sc.nextInt();
				al.add(s);
			}

			// sort the array list
			Collections.sort(al, Collections.reverseOrder());

			if (al.size() < 5) {
				for(int i = 0 ; i < al.size() ; i++) {
					pw.println(i+1 + ") " + al.get(i));
				}
			} else {
				for(int i = 0 ; i < 5 ; i++) {
					pw.println(i+1 + ") " + al.get(i));
				}
			}

			sc.close();
			pw.close();

		} catch (IOException e) {
			System.out.print("err");
		}
	}


}
