package edu.ucsb.cs56.drawings.colerogers.advanced;

import javax.swing.JFrame;

/** A viewer class to see a picture I drew with
 *  Rectangle2D and Arc2D.
 *
 * @author Cole Rogers
 */

public class MultiPictureViewer
{
   public static void main(String[] args)
   {
       int whichPicture = 1;

       if (args.length== 1) {
	   whichPicture = Integer.parseInt(args[0]);
       }

       JFrame frame = new JFrame();

       frame.setSize(640,480);

       frame.setTitle("Cole's Drawings");

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       MultiPictureComponent component =
	   new MultiPictureComponent(whichPicture);

      frame.add(component);
      frame.setVisible(true);
   }
}
