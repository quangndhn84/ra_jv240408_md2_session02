package ra.loop;

public class ForEach_Demo {
    public static void main(String[] args) {
        int[] arrInt = {2, 4, 6, 8, 10};
        //In ra giá trị các phần tử trong mảng
        System.out.println("Các phần tử trong mảng là:");
        for (int element : arrInt) {
            System.out.printf("%d\t", element);
        }
        System.out.printf("\n");
    }
}
