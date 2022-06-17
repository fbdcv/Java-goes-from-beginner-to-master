abstract class Shape1{
    //抽象类改为Shape1,若不重名会让该抽象类与其他java文件的Shape抽象类冲突
    abstract double Getgirth();
}

class Triangle extends Shape1 {
    double edge1;
    double edge2;
    double edge3;

    @Override
    double Getgirth() {
        return edge1 + edge2 + edge3;
    }

    Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    boolean istriangle() {
        return edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2;
    }

    @Override
    public String toString() {
        if (istriangle())
            return String.format("长为%.1f,%.1f,%.1f的3条边能构成三角形,这个三角形的周长为%.1f", edge1, edge2, edge3, Getgirth());
        else
            return String.format("长为%.1f,%.1f,%.1f的3条边不能构成三角形,因为三角形的两边之和必须大于第三边", edge1, edge2, edge3);
    }

}

public class practice_6 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println(t1);
        Triangle t2 = new Triangle(1.0, 4.0, 5.0);
        System.out.println(t2);
    }

}
