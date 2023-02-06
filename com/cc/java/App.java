package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        // output(queen.doYourJob());
        // output(queen.fly());

        pollObj(queen);

        // output(worker.doYourJob());
        // output(worker.fly());
        pollObj(worker);

        // output(drone.doYourJob());
        // output(drone.fly());
        pollObj(drone);

    }

    // 1. Variante Overloading

    private static void pollObj(Queen bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }

    private static void pollObj(Worker bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }

    private static void pollObj(Drone bee) {
        output(bee.doYourJob());
        output(bee.fly());
    }



    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

