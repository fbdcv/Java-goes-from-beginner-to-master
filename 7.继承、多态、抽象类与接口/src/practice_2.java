interface Flyable{
    public String fly();
}

abstract class Insect{
    int legs;
    Insect(int legs){
        this.legs=legs;
    }
    abstract String reproduce();
}

class Flying extends Insect implements Flyable{

    Flying(int legs) {
        super(legs);
    }

    @Override
    String reproduce() {
        return "苍蝇的繁殖方式是产卵\n";
    }

    @Override
    public String fly() {
        return "苍蝇可以在空中飞行\n";
    }

    @Override
    public String toString() {
        return String.format("苍蝇有%d条腿\n"+fly()+reproduce(), legs);
    }
    
}

public class practice_2{
    public static void main(String[] args) {
        Flying flying = new Flying(6);
        System.out.println(flying);
    }
}
