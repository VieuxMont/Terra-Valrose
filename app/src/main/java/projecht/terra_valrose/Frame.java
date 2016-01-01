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

    private Position calculPos(float posX, float posY){       //determine une position par rapport aux coordonnees de la case
        int x = 0;
        int y = 0;
        x = 1 + (int)(6 * (posX / MainActivity.SCREEN_LARGEUR));
        y = 1 + (int)(8 * (posY / MainActivity.SCREEN_HAUTEUR));
        return new Position(x, y);
    }

    public Frame(float x, float y, float cote){
        rect = new RectF(x, y, cote, cote);
        this.cote = cote;
        this.p = calculPos(x,y);
        //Log.d("moi", "pos " + p);

    }

}
