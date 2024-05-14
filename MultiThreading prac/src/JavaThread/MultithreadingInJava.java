/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaThread;

/**
 *
 * @author sid
 */
public class MultithreadingInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       System.out.println("Hello");
       new Thread1().start();
       new Thread2().start();
    }
    
}
