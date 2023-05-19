/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oostask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author ersd7
 */
public class CoffeShop {
    public String name;
    public ArrayList<MenuItem> menu=new ArrayList<MenuItem>();
    public ArrayList<MenuItem> orders=new ArrayList<MenuItem>();
    
     public CoffeShop(String name, ArrayList<MenuItem> menuItems, ArrayList<MenuItem> orders) {
        this.name = name;
        this.menu = menuItems;
        this.orders = orders;
    }
     
    public String add_order(String name){
        for (MenuItem item: menu) {
            if(name.equals(item.name)) {
                orders.add(item);
               return item.name + " Added to orders";
            }
        }
        return "This Item Is Currently unavailable";
    }
    public String fulfillOrder(){
        if(!orders.isEmpty()) return "The "+orders.get(0).name + "is ready";
        else return "All orders have been fullfilled";
    }
    public List<MenuItem> listOrders() {
        return orders;
    }
    
    public double dueAmount(){
        double price=0;
        for(MenuItem order:orders){
            price+=order.price;
        }
        return price;
    }
    
    public String cheapestItem(){
        MenuItem minimum = menu.get(0);
        for (MenuItem i : menu) {
            if(i.price< minimum.price){
                minimum=i;
            }
        }
        return  minimum.name;
    }
    
    public List<String> drinks_only(){
        ArrayList<String>drinks=new ArrayList<>();
        menu.forEach((MenuItem item) -> {
            if(item.type.equals("drink")){
                drinks.add(item.name);
            }
        });
        return drinks;
    }
    
     public List<String> food_only(){
        ArrayList<String>food=new ArrayList<String>();
        for(MenuItem item:menu){
            if(item.type.equals("food")){
                food.add(item.name);
            }
        }
        return food;
    }
}
