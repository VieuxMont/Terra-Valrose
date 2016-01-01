package projecht.terra_valrose;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;

public class Frame {

    public RectF getRect() {
        return rect;
    }

    private RectF rect;
    private double cote;

    public int getColor() {
        return color;
    }

    private int color = Color.BLACK;

    public Frame(float x, float y, float cote){
        rect = new RectF(x, y, cote, cote);
        this.cote = cote;
    }

}
