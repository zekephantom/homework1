package edu.up.cs301.campusMap;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * <!-- class SimpleMapToken -->
 *
 * This class represents a single map token that can be drawn on a canvas
 *
 * @author Andrew M. Nuxoll
 * @author Steven R. Vegdahl
 * @author Ezekiel Rafanan
 * @version August 2015, modified on 22 January 2020
 */
public class SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color

    /**
     * Constructor
     */
    public SimpleMapToken(float xCoord, float yCoord) {
        // initialize the instance variables

        Random something = new Random();

        int blue, green, red;
        blue = (r.nextInt(256 - 0) + 1 + 0);
        green = (r.nextInt(256 - 0) + 1 + 0);
        red = (r.nextInt(256 - 0) + 1 + 0);

        x = xCoord;
        y = yCoord;
        radius = 15;
        paint = new Paint();
        paint.setColor(Color.rgb(red, green, blue));
    }//ctor

    public SimpleMapToken(){}
    /**
     * this token can paint itself on a given canvas
     */
    public void drawOn (Canvas canvas){
        canvas.drawCircle(x, y, radius, paint);
    }//drawOn

}//class SimpleMapToken
