package projecht.terra_valrose;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Engine {

    private MainActivity mainActivity;
    private float COTE_CASE = mainActivity.SCREEN_LARGEUR / 6;
    private List<Frame> listFrame;

    public Engine(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public List<Frame> buildListFrame(){
        listFrame = new ArrayList<>();

        for(int i =0; i <= 6; i++){
            for(int j = 0; j <= 8; j++){
                Position position = new Position(i,j);
                Frame frame = new Frame(i * COTE_CASE, j * COTE_CASE, COTE_CASE, position);
                listFrame.add(frame);
            }
        }

        return listFrame;
    }

    public Position calculPos(float posX, float posY){       //determine une position par rapport aux coordonnees de la case
        int x = 0;
        int y = 0;
        x = 1 + (int)(6 * (posX / MainActivity.SCREEN_LARGEUR));
        y = 1 + (int)(8 * (posY / MainActivity.SCREEN_HAUTEUR));
        return new Position(x, y);
    }

    public Frame getFrameByPosition(Position position) {
        for(Frame f : listFrame){
            if(f.getP().equals(position)){
                return f;
            }
        }
        return null;
    }



}
