
public class Kladionicar {
    private String ime;
    private String vrstaIgre;
    private int stanje;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getVrstaIgre() {
        return vrstaIgre;
    }

    public void setVrstaIgre(String vrstaIgre) {
        if (vrstaIgre == "poker" || vrstaIgre == "ajnc" ||
                vrstaIgre == "rulet") {
            this.vrstaIgre = vrstaIgre;
        }
        else {
            vrstaIgre = "poker";
        }
    }

    public int getStanje() {
        return stanje;
    }

    public void setStanje(int stanje) {
        this.stanje = stanje;
    }

    public Kladionicar(String ime, String vrstaIger, int stanje) {
        this.ime = ime;
        this.vrstaIgre = vrstaIgre;
        this.stanje = stanje;
    }

    public String toString() {
        return "Kladionicar" + ime + "igra igru" + vrstaIgre + "i ima stanje na racunu od" + stanje + "dinara";
    }
}
