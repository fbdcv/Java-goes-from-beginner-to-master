import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        //2020年是鼠年
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份: ");
        int year = sc.nextInt();
        sc.close();

        int y = (12+(year-2020)%12)%12;
        char zodiac='无';
        switch(y){
            case 0:zodiac='鼠';break;
            case 1:zodiac='牛';break;
            case 2:zodiac='虎';break;
            case 3:zodiac='兔';break;
            case 4:zodiac='龙';break;
            case 5:zodiac='蛇';break;
            case 6:zodiac='马';break;
            case 7:zodiac='羊';break;
            case 8:zodiac='猴';break;
            case 9:zodiac='鸡';break;
            case 10:zodiac='狗';break;
            case 11:zodiac='猪';break;
        }
        
        System.out.println("对应生肖: "+zodiac);
    }
}
