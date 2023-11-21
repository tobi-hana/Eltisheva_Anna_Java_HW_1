package ru.pflb.animals;

import ru.pflb.obstacles.Pool;

import static java.lang.System.out;

public class Dog extends Animal {
    public Dog(String name){
        super(500, 10, name);
        mapName("Пес");
    }
    public void swim(Pool pool) {
        if(hasObstacles()){
            return;
        }
        if(pool.getLength() > getMaxSwimDistance()) {
            makeHindered();
            out.printf("%s не смог проплыть по-собачьи %d м \n", getName(), pool.getLength());
            return;
        }
        out.printf("%s проплыл по-собачьи %d м \n", getName(), pool.getLength());
    }
}
