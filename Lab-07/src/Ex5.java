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
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("a[" + i + "][ " + j + "]= ");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Matricea citita este >>> ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.println(" " + A[i][j]);
        }
        int maxim = 0, linie = 0;
        for(i=1;i<=n;i++)
        {
            for(j = 1;j <= m; j++) {
                if(A[i][j] == 1)
                    linie++;
            }
            if (maxim < linie)
                maxim = linie;
            System.out.println("Numarul maxim de cate ori poate sa apara este de >>> " + maxim);
        }
    }
}