public class practice_2 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            for(int j=i;j<=100;j++){
                int res= i*i+j*j;
                int k=(int)Math.sqrt(res);
                if(res==k*k){
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }
}
