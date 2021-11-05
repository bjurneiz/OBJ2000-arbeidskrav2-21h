package arbeidskrav2;

public class GjenfangstHare extends Gjenfangst {
    private final char fargen;

    public GjenfangstHare(String dato, String sted, double lengde, double vekt, char farge) {
        super(dato, sted, lengde, vekt);
        fargen = farge;
    }
    public String toString() {
        return super.toString()  + "Fargen:" + fargen;
    }

}
