

public class practice_1 {
    public static void main(String[] args){
        System.out.printf("4.4加上7.11的结果：%f\n",add(4.4,7.11));
        System.out.printf("8.9减去2.28的结果：%f\n",sub(8.9,2.28));
        System.out.printf("5.2乘以13.14的结果：%f\n",mul(5.2,13.14));
        System.out.printf("92除以89的结果：%f\n",div(92,89));


    }

    static double add(double x,double y){
        return x+y;
    }

    static double sub(double x,double y){
        return x-y;
    }

    static double mul(double x,double y){
        return x*y;
    }

    static double div(double x,double y){
        return x/y;
    }

}