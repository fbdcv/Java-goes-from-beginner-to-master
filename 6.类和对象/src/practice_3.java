public class practice_3 {
    int id;
    String name;
    double chi;
    double mat;
    double eng;
    double ave;
    practice_3(int id,String name,double chi,double mat,double eng){
        this.id =id;
        this.name =name;
        this.chi = chi;
        this.mat = mat;
        this.eng = eng;
        this.ave=(chi+mat+eng)/3;
    }
    void showInfo(){
        System.out.printf("%d\t%s\t%f\t%f\t%f\t%f\n",id,name,chi,mat,eng,ave);
    }
    public static void main(String[] args) {
        System.out.println("学号\t姓名\t语文\t数学\t英语\t平均分");
        System.out.println("————————————————————————————————————————————————————————————————————————————————");
        practice_3 p1 =new practice_3(1, "张三", 91.5, 98.0, 89.0);
        p1.showInfo();
        practice_3 p2 =new practice_3(2, "李四", 96.0, 98.5, 93.0);
        p2.showInfo();
        practice_3 p3 =new practice_3(3, "王五", 97.0, 100.0, 98.5);
        p3.showInfo();
        practice_3 p4 =new practice_3(4, "钱六", 77.0, 83.0, 81.0);
        p4.showInfo();

    }
}
