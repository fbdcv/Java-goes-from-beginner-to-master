enum Man{
    Guest,Worker
}
class Passage{
    Man man;
    Passage(Man man){
        this.man =man;
    }
    void comein(Man man){
        if(man.equals(this.man)){
            if(this.man.equals(Man.Guest)){
                System.out.println("顾客您好，小心地滑");
            }else{
                System.out.println("可以进入");
            }
        }else{
            System.out.println("不能进入");
        }
    }
}

public class practice_3 {
    public static void main(String[] args) {
        Passage p1 =new Passage(Man.Guest);
        p1.comein(Man.Guest);
        p1.comein(Man.Worker);     
        Passage p2 =new Passage(Man.Worker);
        p2.comein(Man.Guest);
        p2.comein(Man.Worker);

    }
}
