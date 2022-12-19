package Excersise250;
import java.util.Scanner;
public class Add_matrix {
    public static void main(String[] args) {
        int a, b, i, j;
        Scanner Obj = new Scanner(System.in);
        System.out.println("enter the number of rows of matrix");
        a = Obj.nextInt();
        System.out.println("enter the number of columns of matrix");
        b = Obj.nextInt();

        int[][] m1 = new int[a][b];
        int[][] m2 = new int[a][b];
        int[][] sum = new int[a][b];

        System.out.println("Enter the first matrix:");
        for (i = 0; i < a; i++)
            for (j = 0; j < b; j++)
                m1[i][j] = Obj.nextInt();

        System.out.println("enter the second matrix:");
        for (i = 0; i < a; i++)
            for (j = 0; j < b; j++)
                m2[i][j] = Obj.nextInt();

        System.out.println("sum of matrix:");
        for (i = 0; i < a; i++)
            for (j = 0; j < b; j++)
                sum[i][j] = m1[i][j] + m2[i][j];

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++)
             System.out.print(sum[i][j]+"\t");

            System.out.println();

        }
    }
}
