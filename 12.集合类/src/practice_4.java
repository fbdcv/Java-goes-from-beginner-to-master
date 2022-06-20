import java.util.HashMap;
import java.util.Scanner;

public class practice_4 {
    public static void main(String[] args) {
        HashMap <String,String> h = new HashMap<>();
        h.put("呼保义", "宋江");
        h.put("玉麒麟", "卢俊义");
        h.put("智多星", "吴用");
        h.put("入云龙", "公孙胜");
        h.put("大刀", "关胜");
        h.put("豹子头", "林冲");
        h.put("霹雳火", "秦明");
        h.put("双鞭", "呼延灼");
        h.put("小李广", "花荣");
        h.put("小旋风", "柴进");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入绰号：");
        String nickname =sc.nextLine();
        System.out.println(h.get(nickname));
        sc.close();
    }
}
