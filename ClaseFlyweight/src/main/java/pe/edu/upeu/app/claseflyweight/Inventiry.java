/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.claseflyweight;

/**
 *
 * @author ADMIN
 */
public class Inventiry {

    public static void main(String[] args) {
        // flyweight -> Roomba, Bose Headphones, Samsung TV

        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Samsung TV", 432);
        inventorySystem.takeOrder("Samsung TV", 323);
        inventorySystem.takeOrder("Roomba", 563);
        inventorySystem.takeOrder("Bose Headphones", 321);
        inventorySystem.takeOrder("Roomba", 234);
        inventorySystem.takeOrder("Samsung TV", 54);
        inventorySystem.takeOrder("Roomba", 34);
        inventorySystem.takeOrder("Bose Headphones", 365);
        inventorySystem.takeOrder("Samsung TV", 332);
        inventorySystem.takeOrder("Roomba", 456);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
