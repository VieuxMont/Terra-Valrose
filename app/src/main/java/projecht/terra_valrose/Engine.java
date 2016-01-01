package projecht.terra_valrose;

import android.util.Log;

import java.util.ArrayList;
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
                listFrame.add(new Frame(i * COTE_CASE, j * COTE_CASE, COTE_CASE));
            }
        }

        return listFrame;
    }



}
