package projecht.terra_valrose;

import android.graphics.Color;
import android.graphics.RectF;
import android.util.Log;

public class Frame {

    public Position getP() {
        return p;
    }

    Position p;

    public RectF getRect() {
        return rect;
    }

    private RectF rect;
    private double cote;

    public int getColor() {
        return color;
    }

    private int color = Color.BLACK;



    public Frame(float x, float y, float cote, Position p){
        rect = new RectF(x, y, x + cote, y + cote);
        this.cote = cote;
        this.p = p;
        //Log.d("moi", "pos " + p);

    }

}
