class Number{
    int count(int x,int y) throws ArithmeticException{
        if (x>=0&&y>=0&&x*y<0){
            throw new ArithmeticException();
        } 
        return x*y;
    }
}

public class practice_4 {
    public static void main(String[] args) {
        try {
            Number number =new Number();
            System.out.println(number.count(12315, 57876876));
        }catch(ArithmeticException e){
            System.out.println("int数值溢出");
        } 
        catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("完毕");
        }
 
    }
}
