import java.util.Scanner;

public class practice_7 {
    public static void main(String[] args) {
        String lib[][]={{"《Java》","《JavaWeb》","《C语言》","《C++》","《Linux C》"},
        {"《论语》","《资治通鉴》","《四十二章经》","《史记》","《隋唐史》"}};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要搜索的书名或关键词：");//搜索词条C++时会出错，原因是“+”被正则表达式解析成正整数次
        String regex = sc.nextLine();                        //除了用正则表达式外还可以用字符串的contains方法
        regex = ".*(?i)"+regex+".*";
        System.out.println("________________搜索结果__________________");
        for(int i=0;i<lib.length;i++){
            for(int j=0;j<lib[i].length;j++){
                if(lib[i][j].matches(regex)){
                    System.out.printf("%s: 第%d个书柜里的第%d本书\n",lib[i][j],i+1,j+1);
                }
            }
        }
        sc.close();
    }
}
