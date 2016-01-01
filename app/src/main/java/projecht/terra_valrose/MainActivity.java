package projecht.terra_valrose;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends Activity {

    public static float SCREEN_LARGEUR;
    public static float SCREEN_HAUTEUR;
    private Engine engine;
    private BoardView boardView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        SCREEN_LARGEUR = metrics.widthPixels;
        SCREEN_HAUTEUR = metrics.heightPixels;

        engine = new Engine(this);
        boardView = new BoardView(this);

        List<Frame> listFrame = engine.buildListFrame();
        boardView.setListFrame(listFrame);

        setContentView(boardView);

        Log.d("moi", "Larg " + SCREEN_LARGEUR);     //les -10 pour etre sur d'etre dans la case (sinon on est pile au bord exterieur)
        Log.d("moi", "Haut " + SCREEN_HAUTEUR);
        //Frame f = new Frame(SCREEN_LARGEUR - 10 - (1 * SCREEN_LARGEUR / 6),SCREEN_HAUTEUR - 10 -(1 * SCREEN_HAUTEUR / 8),0);//case 5, 7
       // Log.d("moi", "pos " + f.getP());
        //Frame f1 = new Frame(SCREEN_LARGEUR - 10 - (3 * SCREEN_LARGEUR / 6 - 1),SCREEN_HAUTEUR - 10 - (3 * SCREEN_HAUTEUR / 8),0); //3,5
        //Log.d("moi", "pos " + f1.getP());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
