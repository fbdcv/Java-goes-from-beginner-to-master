public class practice_3 {
    public static void main(String[] args) {
        double sum =0;
        long tmp =1;
        for(int i=1;i<=20;i++){
            tmp*=i;
            sum+=1.0/tmp;
        }
        System.out.println("sum: "+sum);
    }
}
