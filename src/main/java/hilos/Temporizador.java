/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

class Temporizador extends Thread {
    @Override
    public void run() {
        try {
            for(int i=5;i>=1;i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Despegue");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
