import javafx.scene.paint.StopBuilder;

public class practice_2 {
    public static void main(String[] args) {
        for(int i =1;i<=9;i++){
            for(int k=9;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =8;i>=1;i--){
            for(int k=9;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
