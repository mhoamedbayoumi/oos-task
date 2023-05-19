/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oostask;

/**
 *
 * @author ersd7
 */
public class MenuItem {
    public String name;
    public String type;
    public double price;
    public MenuItem(String n,String t,double p){
        name=n;
        t=type;
        price=p;
    }
    public String getItemName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItemName(String itemName) {
        this.name = itemName;
    }
}
