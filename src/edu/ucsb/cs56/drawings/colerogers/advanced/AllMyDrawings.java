package edu.ucsb.cs56.drawings.colerogers.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Cole Rogers
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses
     */

    public static void drawPicture1(Graphics2D g2) {
  Container c1 = new Container(100,250,50,75);
	g2.setColor(Color.CYAN);
  g2.draw(c1);

	// Make a black container that's half the size,
	// and moved over 150 pixels in x direction

	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK);
  g2.draw(c2);

	// Here's a container that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(c2);

	// Draw two houses with Windows

	WaterBottle wb1 = new WaterBottle(50,350,40,75);
	WaterBottle wb2 = new WaterBottle(200,100,100,160);

	g2.draw(wb1);
	g2.setColor(new Color(0x8F00FF));
  g2.draw(wb2);


	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few Containers and Water Bottles by Cole Rogers", 20,20);
}


    /** Draw a picture with a bunch of Water Bottles and a few Containers
     */
    public static void drawPicture2(Graphics2D g2) {

	WaterBottle large = new WaterBottle(100,50,225,150);
	WaterBottle smallWB = new WaterBottle(20,50,40,30);
	WaterBottle tallSkinny = new WaterBottle(20,150,20,40);
	WaterBottle shortFat = new WaterBottle(20,250,40,20);

	g2.setColor(Color.RED);
  g2.draw(large);

	g2.setColor(Color.GREEN);
  g2.draw(smallWB);

  g2.setColor(Color.BLUE);
  g2.draw(tallSkinny);

  g2.setColor(Color.MAGENTA);
  g2.draw(shortFat);

	Container c1 = new Container(100,250,50,75);
	g2.setColor(Color.CYAN);
  g2.draw(c1);


	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK);
  g2.draw(c2);

	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);


	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.BLUE);
	g2.draw(c2);


	WaterBottle wb1 = new WaterBottle(50,350,40,75);
	WaterBottle wb2 = new WaterBottle(200,350,200,100);

	g2.draw(wb1);
	g2.setColor(new Color(0x8F00FF));

	// Rotate the water bottle 45 degrees around its center.
	Shape wb3 = ShapeTransforms.rotatedCopyOf(wb2, Math.PI/4.0);

	g2.draw(wb3);


	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of Water Bottles and a few Containers by Cole Rogers", 20,20);
}

    /** Draw a different picture with a large and a small Water Bottle
     */
    public static void drawPicture3(Graphics2D g2) {
	g2.drawString("A couple Water Bottles by Cole Rogers", 20,20);

	// Draw a large and small water bottle.

	WaterBottle large = new WaterBottle(100,50,225,150);
	WaterBottle small = new WaterBottle(20,50,40,30);

	g2.setColor(Color.RED);
  g2.draw(large);

  g2.setColor(Color.GREEN);
  g2.draw(small);

    }
}
