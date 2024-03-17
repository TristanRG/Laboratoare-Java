import java.util.Scanner;
public class TwoCharacters {

    public static void main(String[] args) {

        MyCharacter Tristan = new MyCharacter();
        MyCharacter Alin = new MyCharacter();

        Tristan = getData(Tristan,"Tristan");
        Alin = getData(Alin,"Alin");
        System.out.print("Datele lui " + MyCharacter.getNume() + " sunt : " + "\n Culoarea este " + MyCharacter.getCuloare()
        + " numarul de vieti este de: " + MyCharacter.getNumarVieti() + " si are " + MyCharacter.getNumarOchi() + " ochi.");
    }
    public static  MyCharacter  getData( MyCharacter MyCharacter, String nume) {
        String culoare;
        int ochi;
        int vieti;

        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Introdu culoarea lui " + nume + " >>> ");
        culoare = inputDevice.nextLine();
        System.out.print("Introdu numarul de ochi al lui " + nume + " >>> " );
        ochi = inputDevice.nextInt();
        System.out.print("Introdu numarul de vieti al lui " + nume + " >>> ");
        vieti = inputDevice.nextInt();

        MyCharacter.setNume(nume);
        MyCharacter.setCuloare(culoare);
        MyCharacter.setNumarVieti(vieti);
        MyCharacter.setNumarOchi(ochi);
        return MyCharacter;
    }
}

