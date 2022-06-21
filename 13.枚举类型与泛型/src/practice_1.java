enum  Rainbow{
    red,orange,yellow,green,blue, indigo, purple
}

public class practice_1 {
    public static void main(String[] args){
        Rainbow r[] = Rainbow.values();
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+"\t");
        }
        System.out.println();
    }
}
