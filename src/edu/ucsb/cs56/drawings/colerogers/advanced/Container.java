package edu.ucsb.cs56.drawings.colerogers.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Container that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Cole Rogers
*/
public class Container extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of the container
       @param y y coord of lower left corner of the container
       @param width width of the container
       @param height of container
    */
    public Container(double x, double y, double width, double height)
    {
        double containerHeight = .95 * height;
        double opening = height - containerHeight;

        double containerULY = y + opening;

        // Make the container rectangle

        Rectangle2D.Double containerRect =
            new Rectangle2D.Double(x, containerULY , width, containerHeight);


        //makes top half cricle of the container
        double arcHeight = .1 * height;

        Arc2D.Double cArc = new Arc2D.Double(x, y, width, arcHeight, 0, 180, Arc2D.OPEN);

        // put the whole container together
        GeneralPath wholeContainer = this.get();
        wholeContainer.append(containerRect, false);
        wholeContainer.append(cArc, false);
    }
}
