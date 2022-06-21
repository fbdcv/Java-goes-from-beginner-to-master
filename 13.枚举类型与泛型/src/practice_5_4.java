enum Sex {
    man, woman
}

class Test<T1, T2, T3> {
    T1 a;
    T2 b;
    T3 c;

    @Override
    public String toString() {
        return a + "-" + b + "-" + c;
    }

    Test(T1 a, T2 b, T3 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

}

public class practice_5_4 {
    public static void main(String[] args) {

        Test<String, Integer, Sex> tom = new Test<String, Integer, Sex>("汤姆", 22, Sex.man);
        System.out.println(tom);
    }

}