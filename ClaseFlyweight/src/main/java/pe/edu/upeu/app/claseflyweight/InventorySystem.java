/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.claseflyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import static javax.xml.catalog.CatalogManager.catalog;

/**
 *
 * @author ADMIN
 */
public class InventorySystem {

    private final Catalogo catalogo = new Catalogo();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    void takeOrder(String itemName, int orderNumber) {
        Item item = catalogo.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "\nTotal Item objects made: "
                + catalogo.totalItemsMode();
    }
}
