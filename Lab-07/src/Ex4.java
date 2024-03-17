import java.util.Scanner;
public class Vector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        System.out.println("Introdu numarul de linii >>> ");
        n = input.nextInt();
        System.out.println("Introdu numarul de coloane >>> ");
        m = input.nextInt();

        int A[][] = new int[n][m];
        System.out.println("Introdu elementele matricei");
        int i, j;
        for(i = 1 ;i <= n; i++)
        {
            for(j = 1; j <=m ; j++) {
                System.out.print("a[" + i + "][ " + j + "]= ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Matricea citita este >>> ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.println(" " + A[i][j]);
        }
        int t = 0;
        for (i = 0; i < A[i].length; i++){
            for (j = i + 1; j < A[j].length; j++) {
                if (A[i] == A[j])  t++;
                System.out.println("Elementele duble ale matrici sunt >>> " + t);


            }
        }
    }
}


