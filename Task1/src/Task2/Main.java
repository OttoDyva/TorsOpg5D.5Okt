package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        for(int i = 0; i < cafe.coffeeMenu.size(); i++)
        {
            System.out.println(cafe.coffeeMenu.get(i));
        }
    }
}
