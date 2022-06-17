import java.awt.Color;
class Cat{
    int id;
    String name;
    int age;
    double weight;
    Color color;
    public String toString(){
        return String.format("猫咪%d号：姓名：%s\n年龄：%d\n重量：%.1f\n颜色：%s\n", id,name,age,weight,color);
    }
    Cat(int id,String name,int age,double weight,Color color){
        this.id=id;
        this.name=name;
        this.age=age;
        this.weight =weight;
        this.color=color;
    }
}

public class practice_1 {
    public static void main(String[] args){
        Cat c1= new Cat(1,"Java",12,21.0,new Color(0,0,0));
        System.out.println(c1); 
        Cat c2= new Cat(2,"C++",12,21.0,new Color(255,255,255));
        System.out.println(c2);
        Cat c3= new Cat(3,"Java",12,21.0,new Color(0,0,0));
        System.out.println(c3); 
    }
}
