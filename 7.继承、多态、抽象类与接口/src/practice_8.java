import java.io.IOException;
import java.nio.CharBuffer;

interface Addable{
    void add(int x);
}
interface Reducible{
    void reduce(int x);
}
interface Changeable extends Addable,Reducible{
    static int UNITS=30;
}

class Number implements Changeable{
    int num=0;
    @Override
    public void add(int x) {
        num+=x*UNITS;
    }

    @Override
    public void reduce(int x) {
        num-=x*UNITS;
    }

}



public class practice_8 {
    public static void main(String[] args) {
        Number number = new Number();
        number.add(7);
        number.reduce(4);
        System.out.println(number.num);
        
    }
}
