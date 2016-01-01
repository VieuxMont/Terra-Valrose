package projecht.terra_valrose;

public class Position {

    private int xlarg;      //numero de la case en largeur
    private int yhaut;      //                  en hauteur

    public Position(int xlarg, int yhaut) {
        this.xlarg = xlarg;
        this.yhaut = yhaut;
    }

    public int getXlarg() {
        return xlarg;
    }

    public void setXlarg(int xlarg) {
        this.xlarg = xlarg;
    }

    public int getYhaut() {
        return yhaut;
    }

    public void setYhaut(int yhaut) {
        this.yhaut = yhaut;
    }
}
