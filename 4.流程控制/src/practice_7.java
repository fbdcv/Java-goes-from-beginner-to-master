public class practice_7 {
    public static void main(String[] args) {
        int temp_s = -30;
        int temp_h = -22;
        do{
            System.out.printf("摄氏温度: %d℃\t华氏温度: %d℉\n",temp_s,temp_h);
            temp_s+=10;
            temp_h+=18;
        }while(temp_s<=50);
    }
}
