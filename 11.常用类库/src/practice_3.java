public class practice_3 {
    public static void main(String[] args) {
        int x=15;
        int y=4;
        int dx=(int) (-100*Math.cos(Math.PI/6));
        int dy=(int) (100*Math.sin(Math.PI/6));
        x+=dx;
        y+=dy;
        System.out.println("x:"+x+" "+"y:"+y);
    }
}
