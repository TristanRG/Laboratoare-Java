import java.util.Scanner;
public class Vector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu cate n numere = >>> ");
        int positiveCount = 0;
        int negativeCount = 0;
        int n = input.nextInt();
        int v[] = new int[n];
        int i;
        for(i = 0; i < n; i++) {
            System.out.println("V[" + i + "] = ");
            v[i] = input.nextInt();
        }
        for(i = 0; i < n; i++)
        {
            if(v[i] >= 0)
            {
                positiveCount++;
            }
            else
            {
                negativeCount++;
            }
            System.out.println("Totalul numerelor positive = " + positiveCount);
            System.out.println("Totalul numerelor negative = " + negativeCount);
        }
    }
}
