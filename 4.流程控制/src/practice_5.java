public class practice_5 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(isprime(i))
                System.out.println(i);
        }
    }

    public static boolean isprime(int x){
        if(x==1)
            return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}
