class Color{}

class Red extends Color{}

class Green extends Color{}

class Yellow extends Color{}


public class practice_4 {
    public static void main(String[] args) {
        Color color[] = {new Red(),new Green(),new Yellow()};
        for(int i=0;i<3;i++){
            judge(color[(int)(Math.random()*3)]);
        }        
    }

    public static void judge(Color x){
        if(x instanceof Red){
            System.out.print("红");
        }else if(x instanceof Green){
            System.out.print("绿");
        }else if(x instanceof Yellow){
            System.out.print("蓝");
        }
    }
}
