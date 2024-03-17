import java.util.Scanner;
public class eventDetails {

    public int numarInvitati = setGuests();
    private static int pret = 35;

    public final static String pretul = "Pretul per persoana este de 35 USD";
    public final static String evenimentMare = "Evenimentul este clasificat mare daca avem peste 50 de invitati";
    public static String numarEveniment = setEventNumber();


    public int getNumarInvitati() {
        return numarInvitati;
    }

    public void setNumarInvitati(int numarInvitati) {
        this.numarInvitati = numarInvitati;
    }

    public static int getPret() {
        return pret;
    }

    public static void setPret(int pret) {
        eventDetails.pret = pret;
    }

    public static String getNumarEveniment() {
        return numarEveniment;
    }

    public static void setNumarEveniment(String numarEveniment) {
        eventDetails.numarEveniment = numarEveniment;
    }

    public static int setGuests() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de invitati >>>");
        return inputDevice.nextInt();
    }

    public static String setEventNumber() {
        Scanner inputNumar = new Scanner(System.in);
        System.out.println("Introdu numarul evenimentului >>>");
        return inputNumar.nextLine();
    }

    public static void pretTotal(int numarInvitati) {
        int pretulEvenimentului = numarInvitati * pret;
        boolean evenimentMare = numarInvitati >= 50;
        System.out.println("Pretul evenimentului este de: " + pretulEvenimentului);
        System.out.println("Lucrarea este clasificata ca un eveniment mare? " + evenimentMare);
    }
}
