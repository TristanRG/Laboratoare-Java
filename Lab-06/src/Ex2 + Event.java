import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main
{


    public static void main(String[] args)
    {

        moto();
        Event botezSergiu =  new Event("M312",53);
        Event majoratTristan = new Event(nrEvenimenttt(), nrInvitatiii());
        botezSergiu = getData(botezSergiu);
        majoratTristan = getData(majoratTristan);

        System.out.println("Info botez Sergiu: ");
        System.out.print("\nNumarul evenimentului: " + botezSergiu.getNumarEveniment() + "\nNumarul invitatilor: " + botezSergiu.getNumarInvitati()+"\nPret total: " + botezSergiu.getPretEveniment());
        if(botezSergiu.isLargeEvent() == true)
            System.out.println("\nEvenimentul este unul mare");
        if(botezSergiu.isLargeEvent() == false)
            System.out.println("\nEvenimentul este unul mic");
        System.out.println("\n\nInfo majorat Tristan: ");
        System.out.print("\nNumarul evenimentului: " + majoratTristan.getNumarEveniment() + "\nNumarul invitatilor: " + majoratTristan.getNumarInvitati()+"\nPret totaL: " + majoratTristan.getPretEveniment());
        if(majoratTristan.isLargeEvent() == true)
            System.out.println("\nEvenimentul este unul mare");
        if(majoratTristan.isLargeEvent() == false)
            System.out.println("\nEvenimentul este unul mic");
    }

    public static void moto() {
        JOptionPane.showMessageDialog(null, "*************************************************" +
                "\n * Carly’s makes the food that makes it a party. *" + "\n \"*************************************************\"");
    }

    public static int nrInvitatiii() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de invitati pentru majoratul lui Tristan >>> ");
        return inputDevice.nextInt();
    }

    public static String nrEvenimenttt() {
        Scanner numarEv = new Scanner(System.in);
        System.out.println("Introdu numarul evenimentului pentru majoratul lui Tristan >>> ");
        return numarEv.nextLine();
    }

    public static Event getData(Event detalii)
    {
        String nrEvent = "";
        int numarInvitati = 0;
        detalii.setNumarEveniment(nrEvent);
        detalii.setNumarInvitati(numarInvitati);
        detalii.getPretEveniment();
        return detalii;
    }
}
