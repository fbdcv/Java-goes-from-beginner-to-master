interface Light{
    void lighting();
}


public class practice_1 {
    public static void main(String[] args){

        new Light(){
            public void lighting(){
                System.out.println("点燃");
            }
        }.lighting();
    }
}
