/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrover;

/**
 * State class - the description of this class
 * @author sid
 * @version 1.0
 */
public class State {
    protected String name = "NULL";
    protected String subState = "NULL";
   
    /**
     * Default constructor for State.
     */
    State() {}
    
    /** 
     * Press right pedal 
     * @param numOfTimesPressed Use to get how many times pressed
     * @return boolean
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }
    
    protected void pressRightPedalForTime(int numOfSecondsPressed) {}

    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}

}