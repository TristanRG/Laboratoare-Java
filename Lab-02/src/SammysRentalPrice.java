import java.util.Scanner;
public class SammysRentalPrice
{
    public static void main(String[] args)
    {
        int numarMinute, numarOre, pretTotal, costSuplimentar, costPeOra;
        String sammysMoto2 = "S Sammy’s makes it fun in the sun S";
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println(sammysMoto2);
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        Scanner inputOre = new Scanner(System.in);
        System.out.println("Introdu numarul de ore pe care doresti sa-l inchiriezi > ");
        numarOre = inputOre.nextInt();
        Scanner inputMinute = new Scanner(System.in);
        System.out.println("Introdu numarul de minute pe care doresti sa-l inchiriezi >");
        numarMinute = inputMinute.nextInt();
        costPeOra = numarOre * 40;
        costSuplimentar = numarMinute;
        pretTotal = costPeOra + costSuplimentar;
        System.out.println("Numarul de ore pe care doriti sa-l inchiriati este de: " + numarOre);
        System.out.println("Numarul de minute pe care doriti sa-l inchiriati este de: " + numarMinute);
        System.out.println("Pretul total pentru cele " + numarOre + " ore si cele " + numarMinute + " de minute este de: " + pretTotal + " USD");

    }
}
