import java.util.Scanner;
public class Perfect {
    static int NumarPerfect;
    public static void main(String[] args) {

        meniu();
        int choice = alegere();
        if(choice == 1) {
            System.out.println("Introdu un numar de la 1 la 1000 si verifica daca este perfect >>> ");
            Scanner inputNumar = new Scanner(System.in);
            NumarPerfect=inputNumar.nextInt();
            if(NumarPerfect==6)
                System.out.println("Numarul introdus este perfect.");
            if(NumarPerfect==28)
                System.out.println("Numarul introdus este perfect.");
            if(NumarPerfect==496)
                System.out.println("Numarul introdus este perfect.");
            else
                System.out.println("Numarul introdus nu este perfect.");
        }
        else if (choice==2){
        System.out.println("Numerele perfecte sunt 6, 28, 496. ");
        }
        else if (choice > 2) {
        System.out.println("Optiune invalida!");
        }
    }
    public static void meniu() {
        System.out.println("1. Verifica daca un numar este perfect.");
        System.out.println("2. Arata numerele perfecte de la 1 la 1000.");
    }
    public static int alegere() {
        System.out.println("Alege o varianta >>> ");
        Scanner inputDevice = new Scanner(System.in);
        return inputDevice.nextInt();
    }
    }

