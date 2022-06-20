import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class practice_3 {
    public static void main(String[] args) {
        int a[] = new int [10];
        Set <Integer>s =  new TreeSet<>();
        while(s.size()!=10){
            Integer data = new  Integer((int)(Math.random()*100));
            s.add(data);
        }
        Iterator<Integer> l = s.iterator();
        int num=0;
        while(l.hasNext()){
            a[num++]=l.next().intValue();
        }
        System.out.println("生成无重复元素且升序排列的随机数组如下：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
