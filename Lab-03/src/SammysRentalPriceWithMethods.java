import java.util.Scanner;
public class SammysRentalPriceWithMethods {

    public static void main(String[] args) {

        int numarMinute = nrMinute();
        motto();
        convertor(numarMinute);

    }
    public static int nrMinute() {
            Scanner inputDevice = new Scanner(System.in);
            System.out.println("Introdu numarul de minute pe care doresti sa-l inchiriezi: ");
            return inputDevice.nextInt();
        }
    public static void motto() {
        String sammysMoto2 = "S Sammy’s makes it fun in the sun S";
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println(sammysMoto2);
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }

    public static void convertor(int numarMinute) {
        int numarOre = numarMinute / 60;
        int nrMinutee = numarMinute % 60;
        int pretTotal = numarOre * 40 + nrMinutee * 1;
        System.out.println("Ati inchiriat umbrelele pentru: " + numarOre + " ore si " + nrMinutee + " minute ");
        System.out.println("Pentru pretul de: " + pretTotal + " USD ");

    }
}
