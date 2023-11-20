package ru.pflb.animals;

import ru.pflb.obstacles.Pool;

public class Humster extends Animal {
    public Humster(String name) {
        super(30,  name);
        mapName("Хомяк");
    }
    @Override
    public void swim(Pool pool) {
        System.out.printf("%s не умеет плавать\n", getName());
    }
}
