import javax.swing.*;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {

        int numarAlegeri = 0;
        Scanner guess = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Introdu un numar de la 1 la 10  " + (1 + (int) (Math.random() * 10)));
        boolean win = false;
        while (win == false) {
            int alegere = guess.nextInt();
            numarAlegeri++;
            System.out.println("Numarul este " + (1 + (int) (Math.random() * 10)));
            if (alegere == (Math.random())) {
                win = true;
                System.out.println("Ati ghicit numarul!");
            }
            if (alegere < Math.random()) {
                System.out.println("Numarul random este mai mic!");
            }
            if (alegere > Math.random()) {
                System.out.println("Numarul random este mai mare!");
            }
        }
        System.out.println("Numarul de incercari este egal cu" + numarAlegeri);
    }
}

