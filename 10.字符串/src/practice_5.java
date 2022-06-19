import java.util.Scanner;

public class practice_5 {
    public static void main(String[] args) {
        System.out.print("输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(new StringBuilder(str).reverse());
        sc.close();
    }
}
