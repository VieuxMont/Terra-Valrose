package projecht.terra_valrose;

public class Chessman {

    public Frame getFrame() {
        return frame;
    }

    private Frame frame;
    private Position position;

    Chessman(Frame f){
        this.frame = f;
    }

    public Position getPosition() {
        return position;
    }


}
