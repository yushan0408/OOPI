import java.util.*;
public class A1103333_0317_1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入n值: ");
        int n = scanner.nextInt();
        System.out.print("請輸入m值: ");
        int m = scanner.nextInt();
        int[][] values = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                values[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("結果：");
        for (int[] row : values) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}