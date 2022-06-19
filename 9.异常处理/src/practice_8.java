class Computer{
    int x;
    int y;
    Computer(int x,int y){
        this.x=x;
        this.y=y;
    }
    int count() throws Exception{
        return count(this.x,this.y);
    }
    int count(int x,int y) throws Exception{
        if(x<0||y<0){
            throw new Exception("出现了负数参数");
        }
        if(y==0)
            return x;
        return count(y, x%y);
    }
} 


public class practice_8 {
    public static void main(String[] args){
        try {
            Computer computer = new Computer(25, -10);
            System.out.println(computer.count());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
