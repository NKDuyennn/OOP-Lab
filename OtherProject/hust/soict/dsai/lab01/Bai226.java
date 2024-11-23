import java.util.Scanner;

public class Bai226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = getUserOption(input);
        switch (option) {
            case 1:
                solveLinearSystem(input);
                break;
            case 2:
                solveQuadraticEquation(input);
                break;
            case 3:
                solveLinearEquation(input);
                break;
            default:
                System.out.println("Tùy chọn không hợp lệ.");
        }
    }

    private static int getUserOption(Scanner input) {
        System.out.println("Lựa chọn:");
        System.out.println("1. Hệ phương trình tuyến tính hai ẩn số");
        System.out.println("2. Phương trình bậc hai");
        System.out.println("3. Phương trình bậc nhất");
        System.out.print("Vui lòng nhập lựa chọn của bạn: ");
        return input.nextInt();
    }

    private static void solveLinearEquation(Scanner input) {
        System.out.print("Nhập hệ số x: ");
        double xCoefficient = input.nextDouble();
        System.out.print("Nhập hệ số y: ");
        double yCoefficient = input.nextDouble();
        if (xCoefficient == 0 && yCoefficient != 0) {
            System.out.println("Phương trình không có nghiệm.");
        } else if (xCoefficient == 0 && yCoefficient == 0) {
            System.out.println("Phương trình có vô số nghiệm.");
        } else {
            System.out.printf("Phương trình có nghiệm là x = %.3f%n", -yCoefficient / xCoefficient);
        }
    }

    private static void solveLinearSystem(Scanner input) {
        System.out.print("Nhập hệ số a1: ");
        double coefficientA1 = input.nextDouble();
        System.out.print("Nhập hệ số b1: ");
        double coefficientB1 = input.nextDouble();
        System.out.print("Nhập hệ số c1: ");
        double coefficientC1 = input.nextDouble();
        System.out.print("Nhập hệ số a2: ");
        double coefficientA2 = input.nextDouble();
        System.out.print("Nhập hệ số b2: ");
        double coefficientB2 = input.nextDouble();
        System.out.print("Nhập hệ số c2: ");
        double coefficientC2 = input.nextDouble();

        double delta = coefficientA1 * coefficientB2 - coefficientA2 * coefficientB1;
        double deltaX = coefficientC1 * coefficientB2 - coefficientC2 * coefficientB1;
        double deltaY = coefficientA1 * coefficientC2 - coefficientA2 * coefficientC1;

        if (delta != 0) {
            System.out.printf("Nghiệm của hệ phương trình: (x, y) = (%.3f, %.3f)%n", deltaX / delta, deltaY / delta);
        } else if (deltaX == 0 && deltaY == 0) {
            System.out.println("Hệ phương trình có vô số nghiệm.");
        } else {
            System.out.println("Hệ phương trình vô nghiệm.");
        }
    }

    private static void solveQuadraticEquation(Scanner input) {
        System.out.print("Nhập hệ số a (khác 0): ");
        double a = input.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = input.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = input.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Phương trình không có nghiệm.");
        } else if (discriminant == 0) {
            System.out.printf("Phương trình có nghiệm kép: x1 = x2 = %.3f%n", -b / (2 * a));
        } else {
            System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %.3f và x2 = %.3f%n",
                    (-b - Math.sqrt(discriminant)) / (2 * a),
                    (-b + Math.sqrt(discriminant)) / (2 * a));
        }
    }
}
