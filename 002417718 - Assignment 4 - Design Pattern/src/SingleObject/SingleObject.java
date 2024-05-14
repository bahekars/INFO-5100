/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleObject;

/**
 * The Singleton Design Pattern is a creational pattern that ensures a class has
 * only one instance and provides a global point of access to that instance.
 * This pattern is particularly useful when exactly one object is needed to
 * coordinate actions across the system, such as a configuration manager,
 * logging service, or a database connection.
 *
 *
 * @author sid
 * @version 1.0
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

   private SingleObject(){}

    /**
     * Static method to create and return the singleton instance of this class.
     *
     * @return the singleton instance of this class
     */
   public static SingleObject getInstance(){
      return instance;
   }
    /**
     * Method to display a message on the console.
     */
   public void showMessage(){
      System.out.println("Hello World!");
   }
}
