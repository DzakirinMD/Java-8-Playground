package interfaces.impl;

import interfaces.AnimalInterface;

public class AnimalImpl  implements AnimalInterface {

    @Override
    public void animalSound() {
        System.out.println(" Implementation of animalSound() method from Animal interface . Cat say meow ");
    }

    @Override
    public void actionSleep() {
        System.out.println(" Implementation of actionSleep() method from Animal interface . Cat is sleeping Zzz.. ");
    }
}
