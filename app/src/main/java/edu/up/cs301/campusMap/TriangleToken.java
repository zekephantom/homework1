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
    public TriangleToken(float xCoord, float yCoord) {
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

    /**
     * this token can paint itself on a given canvas
     */
    public void drawTriangle (Canvas canvas, Paint paint, float x, float y, float width){
        float halfWidth = 17.5;
        Random something = new Random();
        int blue, green, red;
        blue = (r.nextInt(256 - 0) + 1 + 0);
        green = (r.nextInt(256 - 0) + 1 + 0);
        red = (r.nextInt(256 - 0) + 1 + 0);

        paint = new Paint();
        paint.setColor(Color.rgb(red, green, blue));

        Path way = new Path();
        way.lineTo(x - halfWidth, y + halfWidth);
        way.lineTo(x + halfWidth, y + halfWidth);
        way.lineTo(x, y - halfWidth);
        way.close();

        canvas.drawPath(way, paint);
    }

    public void drawOn(Canvas canvas){
        drawTriangle(canvas, paint, x, y, -x);
    }

    //drawOn

}//class TriangleToken
