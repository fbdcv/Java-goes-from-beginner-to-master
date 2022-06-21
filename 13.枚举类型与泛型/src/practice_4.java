public class practice_4 {
    enum Man{
        Visitor("观看部分视频、浏览所有课程、注册、登录"),
        Member("免费观看所有视频、部分配套习题、收藏课程、实时提问、个人设置"),
        VIP("免费观看所有视频、浏览所有习题及答案、源码下载、定期在线互动交流"),
        Manager("后台所有管理模块、前台所有功能模块");
        String remake;
        Man(String remake ){
            this.remake =remake;
        }
        String getPower(){
            return this.toString()+":"+remake;
        }
    
    }
    public static void main(String[] args) {
        Man m[] = Man.values();
        for(int i=0;i<m.length;i++){
            System.out.println(m[i].getPower());
        }
    }
}
