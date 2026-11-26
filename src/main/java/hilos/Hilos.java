/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hilos;

/**
 *
 * @author mariela
 */

class MiHilo extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
    }
}
public class Hilos {
    public static void main(String[] args) {
        System.out.println("Hello World, mis hilos son los mejores!");
        MiHilo hilo = new MiHilo();
        hilo.start();
    }
}
