import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

int r = (int)(Math.random()*255);
int g = (int)(Math.random()*255);
int b = (int)(Math.random()*255);
int r2 = (int)(Math.random()*255);
int g2 = (int)(Math.random()*255);
int b2 = (int)(Math.random()*255);
int r3 = (int)(Math.random()*255);
int g3 = (int)(Math.random()*255);
int b3 = (int)(Math.random()*255);
public void setup()
{
	background(0);
	size(1000, 900, OPENGL);
}
public void draw()
{
	background(0);
	// stroke(r,g,b);
	sierpinski(mouseX-(mouseY/2), mouseY, mouseY);
	// sierpinski(width - height, height-100, height - 100);
}
public void mouseDragged()//optional
{
}
public void sierpinski(float x, float y, float len) 
{
	if(len > 20)
	{
		sierpinski(x, y, len/2);
		sierpinski(x + len/2, y, len/2);
		sierpinski(x + len/4, y - (len * (sqrt(3))/4), len/2);
	}
	else
	{
		stroke(r,g,b);
		// triangle(x, y, x + len, y, 450 + len/2, 450 - len);
		stroke(r2,g2,b2);
		fill(r3,g3,b3);
		triangle(x, y, x + len, y, x + len/2, y - len);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
