import java.util.Arrays;
import java.util.Scanner;

public class Bai65 {
    public static void main(String[] args) {
        Scanner nhapLieu = new Scanner(System.in);
        
        System.out.print("Vui lòng nhập số lượng phần tử: ");
        int soPhanTu = nhapLieu.nextInt();
        
        int[] mangSoNguyen = new int[soPhanTu];
        int tong = 0;

        System.out.println("Vui lòng nhập " + soPhanTu + " số nguyên:");
        for (int i = 0; i < soPhanTu; i++) {
            mangSoNguyen[i] = nhapLieu.nextInt();
            tong += mangSoNguyen[i]; 
        }

        Arrays.sort(mangSoNguyen);

        double trungBinh = (double) tong / soPhanTu;

        System.out.printf("Tổng: %d\nTrung bình: %.2f\n", tong, trungBinh);
        System.out.print("Mảng đã được sắp xếp: ");
        for (int giaTri : mangSoNguyen) {
            System.out.print(giaTri + " ");
        }
        
        nhapLieu.close();
    }
}
