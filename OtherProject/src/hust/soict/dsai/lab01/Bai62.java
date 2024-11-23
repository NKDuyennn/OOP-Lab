package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class Bai62 {
    public static void main(String[] args) {
        Scanner nhapLieu = new Scanner(System.in);

        System.out.print("Vui lòng nhập tên của bạn: ");
        String ten = nhapLieu.nextLine();

        System.out.print("Vui lòng nhập tuổi của bạn: ");
        int tuoi = nhapLieu.nextInt();

        System.out.print("Vui lòng cho biết chiều cao của bạn: ");
        double chieuCao = nhapLieu.nextDouble();

        System.out.println("Xin chào, " + ten + "! Bạn " + tuoi + " tuổi và có chiều cao là " + chieuCao + " mét.");

        nhapLieu.close();
    }
}
