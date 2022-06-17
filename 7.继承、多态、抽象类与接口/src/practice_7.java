interface USBRechargeable{
    void charge();
}
interface TypeRechargeable{
    void charge();
}

class Car implements USBRechargeable,TypeRechargeable{

    @Override
    public void charge() {
        System.out.println("汽车上的USB接口和TypeC接口都能用于给手机充电");
    }
    
}





public class practice_7 {
    public static void main(String[] args) {
        Car car =new Car();
        car.charge();
    }
}
