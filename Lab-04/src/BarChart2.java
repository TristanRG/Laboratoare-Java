import java.util.Scanner;
public class BarChart2 {
    public static void main (String[] args) {
        Scanner scor = new Scanner(System.in);
        int artPoints;
        int bobPoints;
        int calPoints;
        int danPoints;
        int eliPoints;
        final int asterisk = 10;
        System.out.println("Introdu punctele fiecarui jucator: ");
        System.out.print("    Art >> ");
        artPoints = scor.nextInt();
        System.out.print("    Bob >> ");
        bobPoints = scor.nextInt();
        System.out.print("    Cal >> ");
        calPoints = scor.nextInt();
        System.out.print("    Dan >> ");
        danPoints = scor.nextInt();
        System.out.print("    Eli >> ");
        eliPoints = scor.nextInt();
        System.out.println("\nPunctele castigate in acest sezon: " +
                asterisk +"\n");

        drawChart("Art", artPoints, asterisk);
        drawChart("Bob", bobPoints, asterisk);
        drawChart("Cal", calPoints, asterisk);
        drawChart("Dan", danPoints, asterisk);
        drawChart("Eli", eliPoints, asterisk);
    }
    public static void drawChart(String name, int points, int amt_each) {
        System.out.print(name + ":  ");
        int numAsterisks = points / amt_each;
        for(int i= 0; i < numAsterisks; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}