import java.util.Scanner;
public class CarlysEventPriceWithMethods {

    public static void main(String[] args) {

        int numarInvitati =  nrInvitati();
        System.out.println("Numarul invitatiilor este de: " + numarInvitati);
        moto();
        pretTotal(numarInvitati);

    }
    public static int nrInvitati() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de invitati >>>");
        return inputDevice.nextInt();
    }
    public static void moto() {
        String carlissMoto2 = "* Carly’s makes the food that makes it a party. *";
        System.out.println("*************************************************");
        System.out.println(carlissMoto2);
        System.out.println("*************************************************");
    }

    public static void pretTotal(int numarInvitati) {
        int pretulEvenimentului = numarInvitati * 35;
        boolean evenimentMare = numarInvitati >= 50;
        System.out.println("Pretul evenimentului este de: " + pretulEvenimentului);
        System.out.println("Lucrarea este clasificata ca un eveniment mare? " + evenimentMare);
    }
}