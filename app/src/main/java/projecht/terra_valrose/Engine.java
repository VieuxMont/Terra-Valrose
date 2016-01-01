package projecht.terra_valrose;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Engine {

    private MainActivity mainActivity;
    private float COTE_CASE = mainActivity.SCREEN_LARGEUR / 6;

    public List<Frame> getListFrame() {
        return listFrame;
    }

    private List<Frame> listFrame;

    public Engine(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public List<Frame> buildListFrame(){
        listFrame = new ArrayList<>();

        for(int i =0; i <= 5; i++){
            for(int j = 0; j <= 7; j++){
                Position position = new Position(i + 1,j + 1);
                Frame frame = new Frame((i * COTE_CASE) , (j * COTE_CASE)  , COTE_CASE, position);
                listFrame.add(frame);
            }
        }

        return listFrame;
    }

    public Frame getFrameByPosition(Position position) {
        for(Frame f : listFrame){
            if(f.getP().getXlarg() == position.getXlarg() && f.getP().getYhaut() == position.getYhaut()){
                return f;
            }
        }
        return null;
    }



}
