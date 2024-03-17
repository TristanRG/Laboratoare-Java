import java.util.Scanner;

class QuizScoreStatistics{

    public static void main(String[] args)  {

        Scanner scor = new Scanner(System.in);
        int numar, count = 0, suma = 0, max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        float average = 0;

        do {

            System.out.print("Introdu un scor: ");
            numar = scor.nextInt();
            if (numar < 0){
                System.out.println("Input invalid");
            }
            if (numar > 10){
                System.out.println("Input invalid");
            }
            else{
                count++;

                suma+=numar;

                if(numar > max){

                    max = numar;

                }

                if(numar < min){

                    min = numar;

                }
            }
        }

        while(numar != 99);

        average= suma/count;

        System.out.println("Au fost introduse " + count + " scoruri!");

        System.out.println("Cel mai mare scor este: " + max);

        System.out.println("Cel mai mic scor este: " + min);

        System.out.println("Scorul average este de: " + average);

    }
}