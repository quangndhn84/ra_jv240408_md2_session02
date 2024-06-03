package ra.loop;

public class For_Demo {
    public static void main(String[] args) {
        //1. In ra các số chẵn từ 1-10
        System.out.println("Các số chẵn từ 1-10 là:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.printf("\n");
        //2. Tìm điểm trung bình trong khoảng 0-10 sử dụng vòng for
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {

        }
        System.out.println("Giá trị trung bình trong khoảng 0-10 là: " + i);
    }
}
