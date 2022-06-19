public class practice_7 {
    public static void main(String[] args) {
        try {
            for(int i=0;i<=9;i++){
                System.out.println(i);
                if(i==2){
                    throw new Exception("出现了2");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for(int i=0;i<=9;i++){
            System.out.println(i);
            try {
                if(i==2){
                    throw new Exception("出现了2");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
