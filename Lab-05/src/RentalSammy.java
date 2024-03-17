import java.util.Scanner;

public class RentalSammy {

    public static String numarContract = String.valueOf(setContractNumber());
    private static int numarulDeOreInchiriat;
    private static int numarulDeMinutePeOra;
    private static int pret = 40;

    public static String getNumarContract() {
        return numarContract;
    }

    public static void setNumarContract(String numarContract) {
        RentalSammy.numarContract = numarContract;
    }

    public static int getNumarulDeOreInchiriat() {
        return numarulDeOreInchiriat;
    }

    public static void setNumarulDeOreInchiriat(int numarulDeOreInchiriat) {
        RentalSammy.numarulDeOreInchiriat = numarulDeOreInchiriat;
    }

    public static int getNumarulDeMinutePeOra() {
        return numarulDeMinutePeOra;
    }

    public static void setNumarulDeMinutePeOra(int numarulDeMinutePeOra) {
        RentalSammy.numarulDeMinutePeOra = numarulDeMinutePeOra;
    }

    public static int getPret() {
        return pret;
    }

    public static void setPret(int pret) {
        RentalSammy.pret = pret;
    }

    public static int HoursAndMinutes() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Introdu numarul de minute pe care doresti sa-l inchiriezi: ");
        numarulDeMinutePeOra = inputDevice.nextInt();
        numarulDeOreInchiriat = numarulDeMinutePeOra / 60;
        int nrMinutee = numarulDeMinutePeOra % 60;
        int pretTotal = numarulDeOreInchiriat * pret + nrMinutee * 1;
        System.out.println("Ati inchiriat umbrelele pentru: " + numarulDeOreInchiriat + " ore si " + nrMinutee + " minute ");
        System.out.println("Pentru pretul de: " + pretTotal + " USD ");
        return numarulDeMinutePeOra;
    }

    public static String setContractNumber() {
        Scanner contract = new Scanner(System.in);
        System.out.println("Introdu numarul contractului: ");
        return contract.nextLine();
    }

}
