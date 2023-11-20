package ru.pflb.animals;

import ru.pflb.obstacles.Pool;

public class Cat extends Animal {
    public Cat(String name){
        super(200, name);
        mapName("Кот");
    }
    @Override
    public void swim(Pool pool) {
        System.out.printf("%s не умеет плавать\n", getName());
    }
}
