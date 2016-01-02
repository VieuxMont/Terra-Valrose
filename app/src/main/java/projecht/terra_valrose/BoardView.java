package projecht.terra_valrose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.List;

public class BoardView extends SurfaceView implements SurfaceHolder.Callback{

    private List<Frame> listFrame = null;

    public void setListFrame(List<Frame> listFrame) {
        this.listFrame = listFrame;
    }

    Paint paint;
    SurfaceHolder surfaceHolder;
    //DrawingThread thread;

    public BoardView(Context context) {
        super(context);

        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        //thread = new DrawingThread();

        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
    }



    @Override
    protected void onDraw(Canvas pCanvas) {

        if (listFrame != null) {
            for (Frame f : listFrame) {
                paint.setColor(f.getColor());
                pCanvas.drawRect(f.getRect(), paint);
            }
       }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
//        thread.keepDrawing = true;
//        thread.start();


        Canvas canvas = null;

        canvas = surfaceHolder.lockCanvas();
        canvas.drawColor(Color.WHITE);
        onDraw(canvas);
        surfaceHolder.unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
//        thread.keepDrawing = false;
//        boolean retry = true;
//        while (retry) {
//            try {
//                thread.join();
//                retry = false;
//            } catch (InterruptedException e) {}
//        }

    }

//    private class DrawingThread extends Thread {
//        boolean keepDrawing = true;
//
//        @Override
//        public void run() {
//            Canvas canvas;
//            while (keepDrawing) {
//                canvas = null;
//                try {
//                    canvas = surfaceHolder.lockCanvas();
//                    synchronized (surfaceHolder) {
//                        onDraw(canvas);
//                    }
//                } finally {
//                    if (canvas != null)
//                        surfaceHolder.unlockCanvasAndPost(canvas);
//                }
//
//                // Pour dessiner � 50 fps
//                try {
//                    Thread.sleep(20);
//                } catch (InterruptedException e) {}
//            }
//        }
//    }

}

