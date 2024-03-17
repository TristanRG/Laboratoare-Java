import java.util.Scanner;
public class Vector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu cate n numere = >>> ");
        int n = input.nextInt();
        int v[] = new int[n];
        int i;
        for(i = 0; i < n; i++) {
            System.out.println("V[" + i + "] = ");
            v[i] = input.nextInt();
        }

        int min;
        for(i = 0; i < n; i++) {
            min = 10000;
            if(min > v[i]) min = v[i];
            System.out.println("Minimul vectorului " + i + " este egal cu " + min);
        }
    }
}
