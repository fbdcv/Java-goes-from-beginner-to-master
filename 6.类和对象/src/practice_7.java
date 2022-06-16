public class practice_7 {
    public static void main(String[] args) {
        int length =args.length;
        if(length==0){
            System.out.println(" 无运行参数");
        }
        else{
            for(String st:args){
                System.out.println(st);
            }
        }
    }
}
