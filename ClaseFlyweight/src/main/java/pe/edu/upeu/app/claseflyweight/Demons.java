/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.claseflyweight;

/**
 *
 * @author ADMIN
 */
public class Demons {

    public static void main(String[] args) {
        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }

}
