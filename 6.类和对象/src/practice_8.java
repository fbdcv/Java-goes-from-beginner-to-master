public class practice_8 {
    private static practice_8 instance = new practice_8();
    private practice_8(){}
    public static practice_8 getInstance(){
        return instance;
    }
    public void showmsg(){
        System.out.println("instance");
    }
    public static void main(String[] args) {
        practice_8 p = practice_8.getInstance();
        p.showmsg();  
    }

}
