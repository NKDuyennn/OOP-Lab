import java.util.Scanner;
public class Bai225{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị thứ nhất: ");
        double value1 = input.nextDouble();
        System.out.print("Nhập giá trị thứ hai: ");
        double value2 = input.nextDouble();
        System.out.printf("Tổng của hai giá trị: %.2f\n", value1 + value2);
        System.out.printf("Hiệu của hai giá trị: %.2f\n", value1 - value2);
        System.out.printf("Tích của hai giá trị: %.2f\n", value1 * value2);
        System.out.printf("Thương của hai giá trị: %.2f", value1 / value2);
        input.close();
    }
}
