/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

//Ejemplo 3
class HiloA extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("A: " + i);
        }
    }
}
class HiloB extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("B: " + i);
        }
    }
}
public class Principal2 {
    public static void main(String[] args) {
        HiloA h1 = new HiloA();
        HiloB h2 = new HiloB();
        h1.start();
        h2.start();
    }
}
