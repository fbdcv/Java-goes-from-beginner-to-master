interface Moveable{
    void run();
}


public class practice_4 {
    public static void main(String[] args) {
        new Moveable() {
            public void run(){
                System.out.println("小狗向前跑");
            }
        }.run();
    }
}