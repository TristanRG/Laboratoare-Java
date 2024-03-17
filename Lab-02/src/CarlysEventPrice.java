import java.util.Scanner;
public class CarlysEventPrice
{
    public static void main(String[] args)
    {
        int numarInvitati, pretTotal, pretPerOaspete;
        String carlissMoto2 = "* Carly’s makes the food that makes it a party. *";
        System.out.println("*************************************************");
        System.out.println(carlissMoto2);
        System.out.println("*************************************************");
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de invitati >>>");
        numarInvitati = inputDevice.nextInt();
        pretPerOaspete = 35;
        pretTotal = numarInvitati * pretPerOaspete;
        boolean evenimentMare = numarInvitati >= 50;
        System.out.println("Numarul invitatiilor este de: " + numarInvitati);
        System.out.println("Pretul per oaspete este de: " + pretPerOaspete);
        System.out.println("Pretul total este de: " + pretTotal);
        System.out.println("Lucrarea este clasificata ca un eveniment mare? " + evenimentMare);
    }
}