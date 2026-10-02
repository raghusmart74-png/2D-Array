import java.util.*;

public class Array2D_03_CheckIfMatrixIsXMatrixLC2319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (a[i][j] == 0) { System.out.println("false"); return; }
                } else {
                    if (a[i][j] != 0) { System.out.println("false"); return; }
                }
            }
        }
        System.out.println("true");
    }
}
