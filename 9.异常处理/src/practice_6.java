import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try {
                System.out.print("请输入用户姓名:");
                String name = sc.nextLine();
                System.out.print("请输入用户年龄：");
                int age=Integer.parseInt(sc.nextLine());
                System.out.println("姓名："+name+" " +"年龄："+age);
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }finally{
                sc.reset();
            }
        }  
            
    }
}
