package Task3;

import java.util.ArrayList;

public class Building
{
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
    ArrayList<Room> getRooms()
    {
        return rooms;
    }
    int getNumberOfBathrooms()
    {
        return numberOfBathrooms;
    }
    int getNumberOfFloors()
    {
        return numberOfFloors;
    }
    boolean getIsOfficeBuilding()
    {
        return isOfficeBuilding;
    }
}
