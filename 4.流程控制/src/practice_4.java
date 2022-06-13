public class practice_4 {
    public static void main(String[] args) {
        int[] ele={4,5,6,7};
        int count=0;
        for(int i=0;i<4;i++)
        for(int j=0;j<4;j++)
        for(int k=0;k<4;k++){
            if(i!=j&&i!=k&&j!=k){
                System.out.println(""+ele[i]+ele[j]+ele[k]);
                count++;
            }
        }
        System.out.printf("组合数量：%d\n",count);
    }
}
