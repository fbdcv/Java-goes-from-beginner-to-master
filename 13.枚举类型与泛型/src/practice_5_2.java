class Test<A,B,C>{
    A a;
    B b;
    C c;
    Test(A a, B b,C c){
        this.a = a;
        this.b = b;
        this .c =c;
        System.out.println(a+" "+b+" "+c);
    }
    
}


public class practice_5_2 {
    public static void main(String[] args) {
        Test<String ,Integer ,Double> t = new Test("123", 4, 5.0);
    }
}
