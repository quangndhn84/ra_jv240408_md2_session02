package ra.loop;

import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        //Nhập từ bàn phím các số nguyên, kết thúc nhập khi nhập 0, tính tổng các số vừa nhập
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Nhập vào 1 số:");
            number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println("Tổng các số vừa nhập là: " + sum);
    }
}
