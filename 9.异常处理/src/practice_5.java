public class practice_5 {
    static int x=0;
    static int y=0;
    practice_5(int x,int y){
        this.x=x;
        this.y=y;
    }
    static int div() throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException();
        }
        return x/y;
    }
    public static void main(String[] args) {
        try {
            practice_5 p=new practice_5(25, 0);
            System.out.println(p.div());
        }catch(ArithmeticException e){
            System.out.println("小学生都笑哭了：除数不能是0！！！");
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}
