import java.util.Calendar;
public class practice_1 {
    public static void main(String[] args) throws Exception {
        Calendar calendar  = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        int dayCount = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        int day =1;
        System.out.println("\t\t"+year+"-"+month);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for(int i=1;i<=7;i++){
            if(i<weekday){
                System.out.print("\t");
            }
            else{
                System.out.print(day+"\t");
                day++;
            }
        }
        System.out.println();
        int d = day-1;
        while(day<=dayCount){
            System.out.print(day+"\t");
            if(day==d+7){
                System.out.println();
                d=day;
            }
            day++;
        }
    }
}
