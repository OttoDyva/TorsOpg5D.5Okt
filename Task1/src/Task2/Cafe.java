package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{
    ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData()
    {
        File coffeeFile = new File("coffees.txt"); // FILE NOT FOUND ved ik hvorfor jeg ik kan finde den

        try {
            Scanner scanner = new Scanner(coffeeFile);
            while(scanner.hasNextLine())
            {
                coffeeMenu.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
