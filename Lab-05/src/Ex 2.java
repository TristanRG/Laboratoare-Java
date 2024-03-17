import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        moto();
        eventDetails A = new eventDetails();
        System.out.println(A.pretul);
        System.out.println(A.evenimentMare);
        A.pretTotal(A.numarInvitati);
        System.out.println("Numarul evenimentului este: " + A.numarEveniment);
    }

    public static void moto() {
        JOptionPane.showMessageDialog(null, "*************************************************" +
                "\n * Carly’s makes the food that makes it a party. *" + "\n \"*************************************************\"");
    }
    }
