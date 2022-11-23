/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.claseflyweight;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class Catalogo {

    private Map<String, Item> items = new HashMap<String, Item>();

    // factory method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMode() {
        return items.size();
    }

}
