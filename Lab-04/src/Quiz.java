import java.util.Scanner;
public class Quiz {

    public static void main(String[] args) {


        int nrCorrect = 0;
        int nrGresit = 0;
        Scanner raspuns = new Scanner(System.in);
        System.out.println("Care a fost primul album oficial al trupei AC/DC?\n"
                + "(a)High Voltage\n" + "(b)'74 Jailbreak\n" + "(c)Back in Black\n" + "(d)Let There Be Rock\n");
        System.out.println("Alege o varianta >>> ");
        String response = raspuns.nextLine();
        if (response.equals("b")) {
            System.out.println("Raspuns correct!");
            nrCorrect += 1;
        } else {
            System.out.println("Raspuns gresit!\nRaspunsul correct era b");
            nrGresit += 1;
        }

        System.out.println("Care a fost cel mai ascultat single al lui Eminem? \n"
                + "(a)Not Afraid\n" + "(b)Rap God\n" + "(c)Lose Yourself\n" + "(d)The Real Slim Shady\n");
        System.out.println("Alege o varianta >>> ");
        String response2 = raspuns.nextLine();
        if (response2.equals("a")) {
            System.out.println("Raspuns correct!");
            nrCorrect += 1;
        } else {
            System.out.println("Raspuns gresit!\nRaspunsul correct era a" );
            nrGresit += 1;
        }

        System.out.println("In ce an sa format trupa rock Linkin Park? \n"
                + "(a)2000\n" + "(b)1998\n" + "(c)1996\n" + "(d)2005\n");
        System.out.println("Alege o varianta >>> ");
        String response3 = raspuns.nextLine();
        if (response3.equals("c")) {
            System.out.println("Raspuns correct!");
            nrCorrect += 1;
        } else {
            System.out.println("Raspuns gresit!\nRaspunsul correct era c");
            nrGresit += 1;
        }

        System.out.println("Cu care melodie si a dat debutul 50 Cent? \n"
                + "(a)Candy Shop\n" + "(b)Just A Lil Bit\n" + "(c)In Da Club\n" + "(d)Many Men\n");
        System.out.println("Alege o varianta >>> ");
        String response4 = raspuns.nextLine();
        if (response4.equals("c")) {
            System.out.println("Raspuns correct!");
            nrCorrect += 1;
        } else {
            System.out.println("Raspuns gresit!\nRaspunsul correct era c");
            nrGresit += 1;
        }

        System.out.println("Care este cea mai populara piesa B.U.G. Mafia? \n"
                + "(a)Viata Noastra\n" + "(b)Cine E Cu Noi\n" + "(c)8 Zile Din 7\n" + "(d)Strazile\n");
        System.out.println("Alege o varianta >>> ");
        String response5 = raspuns.nextLine();
        if (response5.equals("d")) {
            System.out.println("Raspuns correct!");
            nrCorrect += 1;
        } else {
            System.out.println("Raspuns gresit!\nRaspunsul correct era d");
            nrGresit += 1;
        }
        
        String correct = "Ati raspuns correct la " + nrCorrect + " intrebari!";
        String gresit = "Ati raspuns gresit la " + nrGresit + " intrebari!";
        System.out.println(correct);
        System.out.println(gresit);
        double totalCorrect = nrCorrect * 100 / 5;
        double totalGresit = nrGresit * 100 / 5;
        System.out.println("Ati raspuns correct la " + totalCorrect + "% din intrebari");
        System.out.println("Ati raspuns gresit la " + totalGresit + "% din intrebari");
    }
}


















