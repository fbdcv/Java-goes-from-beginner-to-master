import java.util.Calendar;

class Test<T1 ,T2,T3>{
    T1 year;
    T2 month;
    T3 day;
    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
  
} 

public class practice_5_3 {
    public static void main(String[] args) {
        Test<Integer,Integer,Integer> date  = new Test<Integer,Integer,Integer>();
        Calendar c = Calendar.getInstance();
        date.year = c.get(Calendar.YEAR);
        date.month = c.get(Calendar.MONTH);
        date.day= c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }
}
