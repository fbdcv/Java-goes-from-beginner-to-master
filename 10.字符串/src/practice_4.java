public class practice_4 {
    public static void main(String[] args) {
        String str[]={"张三","李四","王五","赵六","周七","王哲","白浩","贾蓉","慕容阿三","黄蓉"};
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].endsWith(str[j].charAt(str[j].length()-1)+"")){
                    System.out.printf("%s与%s后缀相同\n",str[i],str[j]);
                }
            }
            
        }
    }
}
