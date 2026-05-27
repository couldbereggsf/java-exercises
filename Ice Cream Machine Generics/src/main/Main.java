package main;

import flavors.*;
import machine.IceCreamMachine;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Factory Startup ---");

        // 1. Test Pineapple Line
        IceCreamMachine<Pineapple> pineappleMachine = new IceCreamMachine<>();
        Pineapple pineapple = pineappleMachine.produceIceCream(new Pineapple());
        System.out.println("Output: " + pineapple);

        // 2. Test Strawberry Line
        IceCreamMachine<Strawberry> strawberryMachine = new IceCreamMachine<>();
        Strawberry strawberry = strawberryMachine.produceIceCream(new Strawberry());
        System.out.println("Output: " + strawberry);

        // 3. Test Vanilla Line
        IceCreamMachine<Vanilla> vanillaMachine = new IceCreamMachine<>();
        Vanilla vanilla = vanillaMachine.produceIceCream(new Vanilla());
        System.out.println("Output: " + vanilla);
    }
}