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
 * @version August 2015, modified on 19 January, 20 Janurary, 21 January 2020
 */
public class SquareToken extends SimpleMapToken {

    // instance variables
    protected float x; // my x coordinate
    protected float y; // my y coordinate
    protected float radius; //my radius
    protected Paint paint;  //my color

    /**
     * Constructor
     */
    public SquareToken(float xCoord, float yCoord) {
        // initialize the instance variables
        super();
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
        canvas.drawRect(x, y, x + 30, y + 30, paint);
    }//drawOn

}//class SquareToken