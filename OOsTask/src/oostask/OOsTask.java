/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oostask;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author ersd7
 */
public class OOsTask {

    /**
     * @param args the command line arguments
     */
    static   ArrayList<MenuItem> menu = new ArrayList<>();
    public static void main(String[] args) {
        
        MenuItem m1 = new MenuItem("Orange","drink",20);
        MenuItem m2 = new MenuItem("Mango","drink",80);
        MenuItem m3 = new MenuItem("Banana","drink",15);
        MenuItem m4 = new MenuItem("Strawberry","drink",22);
        MenuItem m5 = new MenuItem("Apple","drink",25);


        MenuItem f1 = new MenuItem("Orange2","food",18);
        MenuItem f2 = new MenuItem("Mango2","food",80);
        MenuItem f3 = new MenuItem("Banana2","food",15);
        MenuItem f4 = new MenuItem("Strawberry2","food",22);
        MenuItem f5 = new MenuItem("Apple2","food",25);
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        menu.add(m5);
        menu.add(f2);
        menu.add(f1);
        menu.add(f3);
        menu.add(f5);
        menu.add(f4);
        CoffeShop coffeeShop = new CoffeShop("CoffeShop1",menu,new ArrayList<>());
        System.out.println("Cheapest Item");

        System.out.println(coffeeShop.cheapestItem());
        System.out.println("==========");

        System.out.println("Drink Menu");

        coffeeShop.drinks_only().forEach((item)->System.out.println(item));
        System.out.println("==========");
        System.out.println("Food Menu");

        coffeeShop.food_only().forEach((item)->System.out.println(item));
        System.out.println("==========");
        System.out.println("Orders");
        coffeeShop.listOrders().forEach((item)->System.out.println(item.name));
        System.out.println(coffeeShop.add_order("Orange"));
        System.out.println(coffeeShop.fulfillOrder());
        
    }
    
}
