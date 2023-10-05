package Task3;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Room> rooms = new ArrayList<>();
        Room a = new Room(2, 3, 5);
        Room b = new Room(6, 8, 10);
        Room c = new Room(10, 50, 30);
        rooms.add(a);
        rooms.add(b);
        rooms.add(c);

        Building i = new Building(rooms, 4, 5, true);

        int totalLamps = countLampsInBulding(i);
        System.out.println("Total number of lamps is: " + totalLamps);
        isNormal(i);
    }

    public static int countLampsInBulding(Building building)
    {
        int totalLamps = 0;
        for (Room room: building.getRooms())
        {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static boolean isNormal(Building building)
    {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();

        if(numberOfFloors > numberOfRooms)
        {
            System.out.println("This is a 'kinda' normal building");
            return true;
        } else {
            System.out.print("This is an odd building");
            return false;
        }
    }
}
