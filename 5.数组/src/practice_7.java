import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class practice_7 {
    public static void main(String[] args) {
        int bus[][] = new int [9][4];
        for(int i=0;i<9;i++)
            Arrays.fill(bus[i],0,4,1);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\t简单客车售票系统");
            System.out.println("\t9排4列的大巴车开始售票");
            for(int i=0;i<9;i++){
                for(int j=0;j<4;j++){
                    System.out.printf("\t"+bus[i][j]);
                }
                System.out.println();
            }
            System.out.printf("请输入要预定的坐位行号：");
            int x=sc.nextInt();
            System.out.printf("请输入要预定的坐位列号：");
            int y=sc.nextInt();
            bus[x-1][y-1]=0;
        }
        


    }
}
