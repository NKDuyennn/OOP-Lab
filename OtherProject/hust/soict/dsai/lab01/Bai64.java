import java.util.Scanner;

public class Bai64 {
    public static void main(String[] args) {
        Scanner nhapLieu = new Scanner(System.in);
        System.out.print("Vui lòng nhập tháng: ");
        String thangNhap = nhapLieu.nextLine().toLowerCase(); 

        int thang = laySoThang(thangNhap);
        if (thang == -1) {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
            nhapLieu.close();
            return;
        }

        if (thang == 2) { 
            System.out.print("Vui lòng nhập năm: ");
            int nam = nhapLieu.nextInt();
            System.out.println("Tháng này có " + (kiemTraNamNhuan(nam) ? "29" : "28") + " ngày.");
        } else if (co31Ngay(thang)) { 
            System.out.println("Tháng này có 31 ngày.");
        } else { 
            System.out.println("Tháng này có 30 ngày.");
        }

        nhapLieu.close();
    }

    private static int laySoThang(String str) {
        switch (str) {
            case "january": case "jan": case "jan.": case "1": return 1;
            case "february": case "feb": case "feb.": case "2": return 2;
            case "march": case "mar": case "mar.": case "3": return 3;
            case "april": case "apr": case "apr.": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "jun.": case "6": return 6;
            case "july": case "jul": case "jul.": case "7": return 7;
            case "august": case "aug": case "aug.": case "8": return 8;
            case "september": case "sep": case "sep.": case "9": return 9;
            case "october": case "oct": case "oct.": case "10": return 10;
            case "november": case "nov": case "nov.": case "11": return 11;
            case "december": case "dec": case "dec.": case "12": return 12;
            default: return -1; 
        }
    }

    private static boolean kiemTraNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
    }

    private static boolean co31Ngay(int thang) {
        return thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12;
    }
}
