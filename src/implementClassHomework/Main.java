package implementClassHomework;

import implementClassHomework.model.House;
import implementClassHomework.model.Summerhouse;
import implementClassHomework.model.Villa;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("House class");
//        System.out.println(house.getPrice());
//        System.out.println(house.getLivingRoomCount());
//        System.out.println(house.getRoomCount());
//        System.out.println(house.getSquareMeters());
        System.out.println(house.toString());

        System.out.println("Villa class");
        Villa villa = new Villa();
//        System.out.println(villa.getPrice());
//        System.out.println(villa.getLivingRoomCount());
//        System.out.println(villa.getRoomCount());
//        System.out.println(villa.getSquareMeters());
        System.out.println(villa.toString());

        System.out.println("Summerhouse class");
        Summerhouse summerhouse = new Summerhouse();
//        System.out.println(summerhouse.getPrice());
//        System.out.println(summerhouse.getLivingRoomCount());
//        System.out.println(summerhouse.getRoomCount());
//        System.out.println(summerhouse.getSquareMeters());
        System.out.println(summerhouse.toString());
    }
}
