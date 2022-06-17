abstract class Shape{
    String color;
    Shape(String color){
        this.color=color;
    }
    abstract double getArea();
}

class  Rectangle extends Shape{
    double length;
    double width;
    Rectangle(String color,double length,double width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    double getArea() {
        return length*width;
    }
    @Override
    public String toString() {
        return String.format("长为%.1f,宽为%.1f的%s长方形的面积是%.1f", length,width,color,getArea());
    }

}


public class practice_5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("黄色", 6.0, 2.0);
        System.out.println(rectangle);
    }
}
