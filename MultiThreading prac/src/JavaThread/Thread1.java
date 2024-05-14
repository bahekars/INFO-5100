/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaThread;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sid
 */
public class Thread1 extends Thread {
    static List <String> filepaths =new ArrayList(){
        {
            add("/Users/sid/Downloads/JavaThread/src/JavaThread/audios/do.wav");
            add("/Users/sid/Downloads/JavaThread/src/JavaThread/audios/mi.wav");
            add("/Users/sid/Downloads/JavaThread/src/JavaThread/audios/sol.wav");
            add("/Users/sid/Downloads/JavaThread/src/JavaThread/audios/si.wav");
            add("/Users/sid/Downloads/JavaThread/src/JavaThread/audios/do-octave.wav");
            }
            };

    @Override
    public void run() {
        
        try{
            Thread.sleep(1000);
             FilePlayer.play(filepaths.get(0));
             Thread.sleep(1000);
             Thread.sleep(1000);
             FilePlayer.play(filepaths.get(1));
             Thread.sleep(1000);
             Thread.sleep(1000);
             FilePlayer.play(filepaths.get(2));
             Thread.sleep(1000);
             Thread.sleep(1000);
             FilePlayer.play(filepaths.get(3));
             Thread.sleep(1000);
             Thread.sleep(1000);
             FilePlayer.play(filepaths.get(4));
             Thread.sleep(1000);             
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
    
}
