/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author JairoDev
 */
public class MovimientoCar extends Thread {

   private JLabel car;
   private int tiempo=3000;
   private JLabel carV;
   private int pos;
   private JButton btnIniciar;


    public MovimientoCar(JLabel carro,JLabel carV,int pos,JButton btnIniciar) {
        this.car = carro;
        this.carV = carV;
        this.pos = pos;
        this.btnIniciar = btnIniciar;
    }

    @Override
    public void run() {
        int x = car.getLocation().x;
        int y = car.getLocation().y;
        for (int i = 0; i <= tiempo; i++) {
            x=x-2;
            System.out.println("x:"+x);
            if(x==pos){
                break;
            }
            car.setLocation(x, y);
            try {
                Thread.sleep(numeroRandom(10, 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        car.setVisible(true);
        carV.setVisible(true);
        btnIniciar.setEnabled(true);
       
    }

    private static int numeroRandom(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
