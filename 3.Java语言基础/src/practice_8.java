public class practice_8 {
    public static void main(String[] args) {
        //该算法实际上并不严谨，因为没考虑到西瓜空隙的情况
        int l = 400;
        int w = 160;
        int h = 30;
        int lcount = l/23;
        int wcount = w/23;
        int hcount = h/23;

        System.out.println("这辆车满载时能装的西瓜个数: "+ lcount*wcount*hcount);
        System.out.print("实际能装的西瓜个数: ");
        System.out.println((lcount*wcount*hcount)>=100?100:lcount*wcount*hcount);
    }
}
