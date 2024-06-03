package ra.decisionMarking;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        //1. Xây dựng ứng dụng xem phim 18+, nếu lớn hơn 18 tuổi thì thông báo cho phép xem phim, nếu nhỏ hơn 18 thì chặn ko cho xem phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        if (age >= 18) {
            System.out.println("Mời bạn xem phim");
        } else {
            System.out.println("Bạn cần ăn thêm để đủ tuổi xem phim");
        }
        //2. Nhập vào 1 số nguyên, in ra số dư trong phép chia 3 - 3 trường hợp - 1 if - 1 else-if - 1 else
        System.out.println("Nhập vào 1 số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 3 == 0) {
            System.out.printf("%d chia hết cho 3\n", number);
        } else if (number % 3 == 1) {
            System.out.printf("%d chia 3 dư 1\n", number);
        } else {
            System.out.printf("%d chia 3 dư 2\n", number);
        }
        //3. Nhập vào 1 số nguyên, in ra số dư trong phép chia 5 (sử dụng if else)
        /*
         * input: number
         * process: 5 trường hợp -> if với 5 mệnh đề: 1 if, 1 else, 3 else-if
         * output: số dư
         * */
        int surplus = number % 5;
        if (surplus == 0) {
            System.out.printf("%d chia hết cho 5\n", number);
        } else if (surplus == 1) {
            System.out.printf("%d chia 5 dư 1\n", number);
        } else if (surplus == 2) {
            System.out.printf("%d chia 5 dư 2\n", number);
        } else if (surplus == 3) {
            System.out.printf("%d chia 5 dư 3\n", number);
        } else {
            System.out.printf("%d chia 5 dư 4\n", number);
        }

        //4. Nhập vào 1 số nguyên, kiểm tra số đó có chia hết cho 3 và 5 không
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("%d chia hết cho cả 3 và 5\n", number);
        } else {
            if (number % 3 == 0) {
                System.out.printf("%d chia hết cho 3 mà không chia hết cho 5\n", number);
            } else if (number % 5 == 0) {
                System.out.printf("%d chia hết cho 5 mà không chia hết cho 3\n", number);
            } else {
                System.out.printf("%d không chia hết cho 3 và 5\n", number);
            }
        }

    }
}
