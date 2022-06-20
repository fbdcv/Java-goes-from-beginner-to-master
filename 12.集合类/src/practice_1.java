import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class practice_1 {
    public static void main(String[] args){
        char []word = new char[26];
        List <Character>l = new ArrayList<>(); 
        for(int i=0;i<26;i++){
            word[i]=(char)('A'+i);
        }
        for(int i=25;i>=0;i--){
            l.add((char)(word[i]+32));
        }
        for(int i=0;i<26;i++){
            System.out.print(word[i]+" ");
        }
        System.out.println();
        Iterator <Character> it =l.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
