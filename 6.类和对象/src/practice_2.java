public class practice_2 {

    String name;
    int age;
    int ticket;

    public practice_2(String name,int age){
        this.name = name;
        this.age = age;
        this.ticket = age>=18?40:20;
    }
    
    public void showInfo(){
        System.out.printf("%s\t%d\t%d\n",this.name,this.age,this.ticket);
    }

    public static void main(String[] args) {
        System.out.println("姓名\t年龄\t票价（元）");
        practice_2 p1 = new practice_2("李明", 20);
        p1.showInfo();
        practice_2 p2 = new practice_2("钱丽", 16);
        p2.showInfo();
        practice_2 p3 = new practice_2("周刚", 8);
        p3.showInfo();
        practice_2 p4 = new practice_2("吴红", 32);
        p4.showInfo();
    }
}
