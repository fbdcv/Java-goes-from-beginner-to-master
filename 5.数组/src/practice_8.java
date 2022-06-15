import java.util.Scanner;

public class practice_8 {
    public static void main(String[] args) {
        char stu [][]={
            {'A','A','A','A','B','A','A','A','A','B'},
            {'B','A','D','B','A','B','C','A','C','B'},
            {'A','A','A','A','B','A','A','A','A','B'},
            {'A','A','A','A','B','A','A','A','A','B'},
            {'A','A','A','A','B','A','A','A','A','B'},
            {'A','A','A','A','B','A','A','A','A','B'},
            {'A','A','A','A','B','A','A','A','A','B'},
            {'A','A','A','A','B','A','A','A','A','B'}
        };
        char ans[] ={'B','A','D','C','C','B','C','A','D','B'};
        Scanner sc = new Scanner(System.in);
        System.out.println("你想调取第几位学生的答题结果（有效数字为1~8）：");
        int pos = sc.nextInt();
        char tmp[] =stu[pos-1];
        int count =0;
        for(int i=0;i<10;i++){
            if(tmp[i]==ans[i])
                count++;
        }
        System.out.printf("第%d位同学的全部答案为：\n",pos);
        for(int i=0;i<tmp.length;i++)
            System.out.print(tmp[i]+" ");
        System.out.println();
        System.out.printf("第%d位同学一共答对了%d道题\n",pos,count);
    }
}
