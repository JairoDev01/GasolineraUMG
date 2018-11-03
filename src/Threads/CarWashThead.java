/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 *
 * @author JairoDev
 */
public class CarWashThead extends Thread {

    private final JProgressBar var;
    private final int tiempo;
    private JButton btnWash;


    public CarWashThead(JProgressBar var, int tiempo,JButton btnWash) {
        this.var = var;
        this.tiempo=tiempo;
        this.btnWash = btnWash;
        var.setMaximum(tiempo);

    }

    @Override
    public void run() {
        for (int i = 0; i <= tiempo; i++) {
            var.setValue(i);
            System.out.println("cant " + i);
            try {
                Thread.sleep(numeroRandom(100, 400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        btnWash.setEnabled(true);
       
    }

    private static int numeroRandom(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
