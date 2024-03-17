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
        System.out.println("Elementele unidimensionale ale tabloului sunt: \n");
        for(i = 0; i < v.length; i++)
            System.out.println("v["+i+"]:"+v[i]);
    }
}

