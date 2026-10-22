public class OopDemo {
    public static void main(String[] args){
        TransportVehicle truck=new Truck("T-998");
        TransportVehicle drone=new Drone("D-007");

        System.out.println(truck+"当前位置："+((GPSLocatable)truck).getLocation()
                +"| 配送10kg货物费用："+truck.calculateCost(10)+"元");
        System.out.println(drone + " 当前位置：" + ((GPSLocatable) drone).getLocation()
                + " | 配送10kg货物费用：" + drone.calculateCost(10) + "元");

    }
}
