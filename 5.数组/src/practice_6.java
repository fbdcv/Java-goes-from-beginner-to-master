import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        int id[]= new int [3];
        int mat[]= new int [3];
        int chi[]= new int [3];
        int eng[]= new int [3];
        int ave[]= new int [3];
        int sum[]= new int [3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.printf("请输入第%d个学生的编号：\n",i+1);
            id[i] = sc.nextInt();
            System.out.println("请输入语文成绩：");
            chi[i] = sc.nextInt();
            System.out.println("请输入数学成绩：");
            mat[i] = sc.nextInt();
            System.out.println("请输入英语成绩：");
            eng[i] = sc.nextInt();
            sum[i] = chi[i]+mat[i]+eng[i];
            ave[i] = sum[i]/3;
        }   
        System.out.println("________________________________________________________________________________________"); 
        System.out.println(" 学生编号\t语文成绩\t数学成绩\t英语成绩\t平均成绩\t总成绩");
        for(int i=0;i<3;i++){
            System.out.printf("\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n",id[i],chi[i],mat[i],eng[i],ave[i],sum[i]);
        }
        sc.close();
    }
}
