package ra.decisionMarking;

import java.util.Scanner;

public class Switch_Case_Demo {
    public static void main(String[] args) {
        //Nhập vào các số từ 0-9, phiêm âm số đó
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên từ 0-9: ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number){
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            default:
                System.out.println("Chín");
        }
    }
}
