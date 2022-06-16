public class practice_6 {
    double length;
    double width;
    practice_6(double length,double width){
        this.length=length;
        this.width = width;
    }
    double area(){
        return length*width;
    }

    public static void main(String[] args) {
        practice_6 p =new practice_6(3,5);
        System.out.printf("p的面积是：%f\n",p.area());
    }
}
