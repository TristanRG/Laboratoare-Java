import java.util.Scanner;
public class Rental {

    private String numarContract;
    private int numarOre;
    private int numarMinute;
    private int pretTotal;

    public static final int pretPerOra() {
        int pretOra = 40;
        return pretOra;
    }

    public static final int pretPerMinut() {
        int pretMinut = 1;
        return pretMinut;
    }

    public Rental(String nrContract, int nrOre, int nrMinute) {
        numarContract = nrContract;
        numarOre = nrOre;
        numarMinute = nrMinute;
    }

    public void setNumarContract(String x) {
        x = numarContract;
    }

    public String getNumarContract() {
        return numarContract;
    }

    public void setNumarMinute(int y) {
        y = numarMinute;
    }

    public int getNumarMinute() {
        return numarMinute;
    }

    public void setNumarOreInchiriere(int z) {
        z = numarOre;
    }

    public int getNumarOreInchiriere() {
        return numarOre;
    }
    public int getPretTotal() {
        int numarulDeOre = numarMinute / 60;
        int nrMinutee = numarMinute % 60;
        pretTotal = numarOre * pretPerOra() + numarulDeOre * pretPerOra() + nrMinutee * pretPerMinut();
        return pretTotal;
    }
}
