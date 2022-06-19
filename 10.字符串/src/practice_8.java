import java.util.Scanner;

import javax.swing.SpringLayout;

import javafx.scene.SnapshotParameters;

public class practice_8 {
    public static void main(String[] args) {
        String username[] ={"mrsoft","mr","miss","Admin"};
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要注册的用户名:");
        String user=sc.nextLine();
        int i;
        for(i=0;i<username.length;i++){
            if(username[i].equals(user)){
                System.out.println("注册失败，该用户名已被注册");
                break;
            }
        }
        if(i==username.length){
            System.out.println("注册成功！！！");
        }
        sc.close();
    }
}
