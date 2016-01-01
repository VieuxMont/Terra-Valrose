package projecht.terra_valrose;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

//le commentaire de test
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

        SCREEN_HAUTEUR = metrics.heightPixels;
        SCREEN_LARGEUR = metrics.widthPixels;

        engine = new Engine(this);
        boardView = new BoardView(this);

        List<Frame> listFrame = engine.buildListFrame();
        boardView.setListFrame(listFrame);

        setContentView(boardView);

       // Log.d("moi", SCREEN_LARGEUR + " " + SCREEN_HAUTEUR);
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
