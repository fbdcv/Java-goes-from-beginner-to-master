class Human{
    Human(){
        new Heart().beat();
    }
    class Heart{
        void beat(){
            System.out.println("心脏跳动");
        }
    }
}


public class practice_2 {
    public static void main(String[] args) {
        Human human = new Human();
    }
}
