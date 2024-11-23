import java.util.Scanner;

public class Bai66 {
    public static void main(String[] args) {
        Scanner nhapLieu = new Scanner(System.in);

        System.out.println("Vui lòng nhập số hàng (n): ");
        int soHang = nhapLieu.nextInt();
        System.out.println("Vui lòng nhập số cột (m): ");
        int soCot = nhapLieu.nextInt();

        int[][] maTran1 = new int[soHang][soCot];
        int[][] maTran2 = new int[soHang][soCot];
        int[][] tongMaTran = new int[soHang][soCot];

        System.out.println("Vui lòng nhập các phần tử cho ma trận 1: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                maTran1[i][j] = nhapLieu.nextInt();
            }
        }

        System.out.println("Vui lòng nhập các phần tử cho ma trận 2: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                maTran2[i][j] = nhapLieu.nextInt();
            }
        }

        System.out.println("Tổng của hai ma trận: ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                tongMaTran[i][j] = maTran1[i][j] + maTran2[i][j];
                System.out.printf("%d ", tongMaTran[i][j]);
            }
            System.out.println(); 
        }

        nhapLieu.close(); 
    }
}
