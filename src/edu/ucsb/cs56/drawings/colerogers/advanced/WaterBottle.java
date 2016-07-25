package edu.ucsb.cs56.drawings.colerogers.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Arc2D;

/**
   A Water Bottle

   @author Cole Rogers

*/
public class WaterBottle extends Container implements Shape {
  /**
   * Constructor for objects of class WaterBottle
   */
   public WaterBottle(double x, double y, double width, double height) {
     super(x,y,width,height);

     //make a handle on the side of the water Bottle
     double handleOuterXPos = x - .1 * width;
     double handleOuterYPos = y + .25* height;
     double handleOuterWidth = .2 * width;
     double handleOuterHeight = .5 * height;

     Arc2D.Double outerHandle =
      new Arc2D.Double(handleOuterXPos, handleOuterYPos, handleOuterWidth, handleOuterHeight, 90, 180, Arc2D.OPEN);

     double handleInnerXPos = handleOuterXPos + .03*width;
     double handleInnerYPos = handleOuterYPos + .03*height;
     double handleInnerWidth = handleOuterWidth - .1*width;
     double handleInnerHeight = handleOuterHeight - .1*height;

     Arc2D.Double innerHandle =
      new Arc2D.Double(handleInnerXPos, handleInnerYPos, handleInnerWidth, handleInnerHeight, 90, 180, Arc2D.OPEN);

     //make a cap on the top of the water Bottle
     double capXPos = x + .4*width;
     double capYPos = y - .1*height;
     double capWidth = .2*width;
     double capHeight = .1*height;

     Container cap = new Container(capXPos, capYPos, capWidth, capHeight);

     GeneralPath waterBottle = this.get();
     waterBottle.append(outerHandle, false);
     waterBottle.append(innerHandle, false);
     waterBottle.append(cap, false);
   }

}
