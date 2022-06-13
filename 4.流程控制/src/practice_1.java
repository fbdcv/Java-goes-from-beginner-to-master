import java.util.Scanner;

public class practice_1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个正整数: ");
        int val = sc.nextInt();
        sc.close();
        boolean isodd = val==(val|1)?true:false;
        System.out.println("这个数是否为奇数: "+isodd);

    }
}