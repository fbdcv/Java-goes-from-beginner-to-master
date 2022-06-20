import java.util.ArrayList;
import java.util.HashMap;

public class practice_5 {

    public static void main(String[] args) {
        String name[] ={"张三","李四","王五","赵六"};
        ArrayList <Integer>a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        HashMap <String ,Integer > h = new HashMap<>();
        int j=0;
        while(h.size()!=4){
            Integer i =a.get((int)(Math.random()*6));
            if(!h.containsValue(i)){
                h.put(name[j++], i);
            }
        }
        int max=0;
        for(int i=0;i<3;i++){
            if(h.get(name[i+1])>h.get(name[i])){
                max=i+1;
            }
        }
        System.out.println(h.keySet());
        System.out.println(h.values());
        System.out.println(name[max]+":"+h.get(name[max]));

        
    }
}
