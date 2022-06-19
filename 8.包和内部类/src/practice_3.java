abstract class Fruit{
    abstract String getFruitName();
}

class Human {
    void eat(Fruit...fruits){
        for(Fruit f:fruits){
            System.out.println(f.getFruitName());
        }
    }
}



public class practice_3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat(new Fruit(){
            String getFruitName() {
                return "苹果";
            }
        },
        new Fruit() {
            String getFruitName() {
                return "香蕉";
            };
        }
        );
    }
}
