public class practice_8 {
    public static void main(String[] args) {
        int cock=0,hen=0,chick=0;
        boolean f1=false,f2=false;
        for(cock=0;cock<=20;cock++){
            for(hen=0;hen<=33;hen++){
                for(chick=0;chick<=300;chick+=3){
                    if(cock+hen+chick==100&&(5*cock+3*hen+chick/3==100)){
                        f2=true;
                        break;
                    }   
                } 
                if(f2){
                    f1=true;
                    break;
                }
            }
            if(f1)
                break;
        }

        System.out.printf("cock:%d\nhen:%d\nchick:%d\n",cock,hen,chick);

          
          
            
        
    }
}
