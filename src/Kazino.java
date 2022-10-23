
public class Kazino {
    private Kladionicar[] kladionicari;

    public Kazino(Kladionicar[] kladionicari) {
        this.kladionicari = kladionicari;
    }

    @Override
    public String toString() {
        String toString = "";
        for(int i = 0; i < kladionicari.length; i++) {
            toString += kladionicari[i].toString() + "\n";
        }
        return toString;
    }

    String najprofitabilnijaIgra() {
        int ajnc = 0;
        int poker = 0;
        int rulet = 0;
        for (int i = 0; i < kladionicari.length; i++) {
            if (kladionicari[i].getVrstaIgre().equals("ajnc") && kladionicari[i].getStanje() < 0) {
                ajnc++;
            } else if (kladionicari[i].getVrstaIgre().equals("poker") && kladionicari[i].getStanje() < 0) {
                poker++;
            } else if (kladionicari[i].getVrstaIgre().equals("rulet") && kladionicari[i].getStanje() < 0) {
                rulet++;
            }
        }
        if (ajnc >= poker && ajnc >= rulet) {
            return "ajnc";
        }
        if (poker >= ajnc && poker >= rulet) {
            return "poker";
        }
        else return "rulet";
    }
}
