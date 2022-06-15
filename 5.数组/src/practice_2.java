public class practice_2 {
    public static void main(String[] args) {
        int[][] array = { { 91, 25, 8 }, { 56, 14, 2 }, { 47, 3, 67 } };
        int tmp;
        System.out.println("变换前：");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                tmp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=tmp;
            }
        }
        System.out.println("变换后：");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }


    }
}
