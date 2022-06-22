import java.util.function.Function;

public class practice_1 {
    Function <Integer,Integer>func =(n)->{
        Integer res=1;
        for(int i=1;i<=n.intValue();i++){
            res*=i;
        }
        return res;
    };
    public static void main(String[] args){
        practice_1 p = new practice_1();
        System.out.println(p.func.apply(3));
    }
}
