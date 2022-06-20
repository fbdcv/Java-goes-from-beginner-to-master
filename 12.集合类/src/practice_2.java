import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CountInf{
    String time;
    int income;
    int speed;
    int balance;
    CountInf(String time,int income,int speed,int balance){
        this.time = time;
        this.income = income;
        this.speed = speed;
        this.balance = balance;
    }
    void printInf(){
        System.out.printf("%s\t%d\t%d\t%d\n",time,income,speed,balance);
    }
}



public class practice_2 {

    public static void main(String[] args) {
        List <CountInf> count = new ArrayList<>();
        count.add(new CountInf("2015-05-06", 2000, 0, 2000));
        count.add(new CountInf("2015-05-18", 0, 1000, 1000));
        count.add(new CountInf("2015-06-08", 5000, 0, 6000));
        count.add(new CountInf("2015-06-23", 0, 1500, 4500));
        count.add(new CountInf("2015-07-03", 3000, 0, 7500));
        count.add(new CountInf("2015-07-19", 0, 1000, 6500));
        count.add(new CountInf("2015-08-01", 1000, 0, 7500));
        count.add(new CountInf("2015-08-10", 0, 1000, 6500));
        System.out.printf("存取、款时间\t存入\t支出\t余额\n");
        Iterator<CountInf> it = count.iterator();
        while(it.hasNext()){
            it.next().printInf();
        }
    }
}
