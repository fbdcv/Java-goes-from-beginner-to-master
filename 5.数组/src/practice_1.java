public class practice_1 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int r1, r2, r3, c1, c2, c3, d1, d2;
        r1 = a[0][0] + a[0][1] + a[0][2];
        r2 = a[1][0] + a[1][1] + a[1][2];
        r3 = a[2][0] + a[2][1] + a[2][2];
        c1 = a[0][0] + a[1][0] + a[2][0];
        c2 = a[0][1] + a[1][1] + a[2][1];
        c3 = a[0][2] + a[1][2] + a[2][2];
        d1 = a[0][0] + a[1][1] + a[2][2];
        d2 = a[0][2] + a[1][1] + a[2][0];

        System.out.println("r1: "+r1);
        System.out.println("r2: "+r2);
        System.out.println("r3: "+r3);
        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);
        System.out.println("c3: "+c3);
        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
    }
}