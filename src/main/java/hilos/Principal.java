/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

class MiProceso implements Runnable {
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Proceso: " + i);
        }
    }
}
public class Principal {
    public static void main(String[] args) {
        Thread hilo = new Thread(new MiProceso());
        hilo.start();
    }
}
