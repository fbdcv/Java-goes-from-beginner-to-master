import java.util.Scanner;

public class practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入上次文件的文件名：");
        String str=scanner.nextLine();
        if(str.endsWith(".mp4")){
            System.out.println("上传文件为mp4文件");
        }
        else{
            System.out.println("上传文件非mp4文件");
        }
        scanner.close();
    }
}
