package SingleObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * SingletonPatternDemo is a class that demonstrates the Factory design pattern in action.
 * @author sid
 * @version 1.0
 */
public class SingletonPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleObject object = SingleObject.getInstance();

      object.showMessage();
    }
    
}
