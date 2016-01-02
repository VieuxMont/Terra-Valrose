package projecht.terra_valrose;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

import java.util.List;

public class MainActivity extends Activity {

    public static float SCREEN_LARGEUR;
    public static float SCREEN_HAUTEUR;


    private Engine engine;

    public BoardView getBoardView() {
        return boardView;
    }

    private BoardView boardView;

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        int mx = (int)e.getX();
        int my = (int)e.getY();
        Frame f;

        if (e.getAction() == MotionEvent.ACTION_DOWN) {

            f = engine.getFrameByPosition(new Position(mx, my));
            Log.d("moi", "touch : " + f);
        }

        return true;
    }

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
//
//        Log.d("moi", "frame (1,5) : " + engine.getFrameByPosition(new Position(1,5)));//existent
//        Log.d("moi", "frame (1,8) : " + engine.getFrameByPosition(new Position(1, 8)));
//        Log.d("moi", "frame (6,1) : " + engine.getFrameByPosition(new Position(6,1)));
//        Log.d("moi", "frame (6,8) : " + engine.getFrameByPosition(new Position(6,8)));
//        Log.d("moi", "frame (1,1) : " + engine.getFrameByPosition(new Position(1,1)));
//
//        Log.d("moi", "frame (0,1) : " + engine.getFrameByPosition(new Position(0,1)));//n'existent pas
//        Log.d("moi", "frame (1,0) : " + engine.getFrameByPosition(new Position(1,0)));
//        Log.d("moi", "frame (1,9) : " + engine.getFrameByPosition(new Position(1,9)));
//        Log.d("moi", "frame (7,1) : " + engine.getFrameByPosition(new Position(7,1)));
//
//        Log.d("moi", "nb list des frames : " + listFrame.size());

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
