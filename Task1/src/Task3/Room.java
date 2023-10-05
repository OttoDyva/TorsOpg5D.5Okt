package Task3;

public class Room
{
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    int getNumberOfWindows()
    {
        return numberOfWindows;
    }
}
