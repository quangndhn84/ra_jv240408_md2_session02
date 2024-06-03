package ra.jump;

public class Jump_Demo {
    public static void main(String[] args) {
        System.out.println("CÂU LỆNH CONTINUE: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");

        System.out.println("CÂU LỆNH BREAK: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");

        System.out.println("CÂU LỆNH RETURN: ");
        int total = addTwoNumber(10, 20);
        System.out.println("Tổng 2 số là: " + total);
    }

    public static int addTwoNumber(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        //return: Kết thúc phương thức và trả về nơi gọi nó
        return sum;
    }
}
