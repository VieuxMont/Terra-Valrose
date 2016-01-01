package projecht.terra_valrose;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

public class Engine {

    private MainActivity mainActivity;
    private double COTE_CASE = mainActivity.SCREEN_LARGEUR / 6;

    public Engine(MainActivity mainActivity){
        //Log.d("moi", mainActivity.SCREEN_LARGEUR + " " + mainActivity.SCREEN_HAUTEUR);
        Log.d("moi", "" + COTE_CASE);
    }



}
