/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author JairoDev
 */
public class Bomba1 extends Thread{
    private final JLabel lprecio1;
    private final JLabel carB1;
    private final JProgressBar var;
    private final int posBomba;
    private final int cant;
   
    
    

    public Bomba1(JLabel lprecio1, JProgressBar var, int cant,JLabel carb1,int posBomba) {
        this.lprecio1 = lprecio1;
        this.var = var;
        this.cant = cant;
        this.carB1 = carb1;
        this.posBomba = posBomba;
        var.setMaximum(cant);
       
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= cant; i++) {
            var.setValue(i);
            System.out.println("cant " + i);
            this.lprecio1.setText(i+".0");
            try {
                Thread.sleep(numeroRandom(100, 400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carB1.setVisible(false);
        
    }
    
    private static int numeroRandom(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
