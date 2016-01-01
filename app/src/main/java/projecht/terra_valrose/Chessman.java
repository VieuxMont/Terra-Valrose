package projecht.terra_valrose;

public class Chessman {

    public Frame getFrame() {
        return frame;
    }

    private Frame frame;
    private Position position;

    Chessman(Frame f){
        this.frame = f;
        this.position = calculPos();
    }

    public Position getPosition() {
        return position;
    }

    private Position calculPos(){       //determine une position par rapport aux coordonnées de la case
        int x = 0;
        int y = 0;
        double posX = frame.getPosX();
        double posY = frame.getPosY();

        x = (int)(6 * (posX / MainActivity.SCREEN_LARGEUR));
        y = (int)(8 * (posY / MainActivity.SCREEN_HAUTEUR));
        return new Position(x, y);
    }
}
