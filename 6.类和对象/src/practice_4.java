public class practice_4 {
    double cm;
    double inc;
    practice_4(double cm){
        this.cm = cm;
        this.inc = cm/0.39370;
    }
    public static void main(String[] args) {
        // 1厘米等于0.39370 英寸
        practice_4 p =new practice_4(3);
        System.out.println("cm:"+p.cm);
        System.out.println("inc:"+p.inc);
    }
}
