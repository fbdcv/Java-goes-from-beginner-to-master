enum Sex{
    man,woman
}
class Toilet {
    String mantoilet = "男厕所";
    String womantoilet ="女厕所";
    String comein(Sex s){
        if(s.equals(Sex.man)){
            return mantoilet;
        }else{
            return womantoilet;
        }
    }
}


public class practice_2 {
    public static void main(String[] args) {
        Toilet t =new Toilet();
        System.out.println(t.comein(Sex.man));
        System.out.println(t.comein(Sex.woman));
    }
}
