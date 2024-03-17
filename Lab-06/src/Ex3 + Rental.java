import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Rental achizitie1 =  new Rental("M312",2, 100);
        Rental achizitie2 =  new Rental(nrContracttt(), nrOreee(), nrMinuteee());
        achizitie1 = getData(achizitie1);
        achizitie2 = getData(achizitie2);
        System.out.println("Info achizitie1: ");
        System.out.print("\nNumarul contractului: " + achizitie1.getNumarContract() + "\nNumarul orelor: " + achizitie1.getNumarOreInchiriere() +
                "\nNumarul minutelor: " + achizitie1.getNumarMinute() + "\nPret total: " + achizitie1.getPretTotal());

        System.out.println("\n\nInfo achizitie1: ");
        System.out.print("\nNumarul contractului: " + achizitie2.getNumarContract() + "\nNumarul orelor: " + achizitie2.getNumarOreInchiriere() +
                "\nNumarul minutelor: " + achizitie2.getNumarMinute() + "\nPret total: " + achizitie2.getPretTotal());
    }
    public static Rental getData(Rental detalii)
    {
        String nrContract = "";
        int nrOre = 0;
        int nrMinute= 0;
        detalii.setNumarContract(nrContract);
        detalii.setNumarOreInchiriere(nrOre);
        detalii.setNumarMinute(nrMinute);
        detalii.getPretTotal();
        return detalii;
    }

    public static int nrMinuteee() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de minute pentru achizitia numarul 2 >>> ");
        return inputDevice.nextInt();
    }

    public static int nrOreee() {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introdu numarul de ore pentru achizitia numarul 2 >>> ");
        return inputDevice.nextInt();
    }

    public static String nrContracttt() {
        Scanner numarCtr = new Scanner(System.in);
        System.out.println("Introdu numarul contractului pentru achizitia numarul 2 >>> ");
        return numarCtr.nextLine();
    }
}
