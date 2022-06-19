import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        String a[] ={"《明史讲义》","《明代社会生活史》","《紫禁城的黄昏》","《中国的黄金时代》","《国史十六讲》","《停滞的帝国》","《唐朝定居指南》","《明史简述》","《明史十讲》","《大明风物志》","《西方眼中的中国》","《皇帝和秀才》"};
        Scanner sc = new Scanner(System.in);
        System.out.print("输入搜索词条：");
        String regex=sc.nextLine();
        regex=".*"+regex+".*";
        for(String i:a){
            if(i.matches(regex)){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
