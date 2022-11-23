/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.claseflyweight;

/**
 *
 * @author ADMIN
 */
public class Order {

    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
