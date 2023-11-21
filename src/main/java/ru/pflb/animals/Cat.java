package ru.pflb.animals;

import ru.pflb.obstacles.Pool;
import ru.pflb.obstacles.Road;

import static java.lang.System.out;

public class Cat extends Animal {
    public Cat(String name){
        super(200, name);
        mapName("Кот");
    }
    @Override
    public void run(Road road) {
        if(hasObstacles()){
            return;
        }
        if(road.getLength() > getMaxRunDistance()) {
            makeHindered();
            out.printf("%s не смог пробежать %d м \n", getName(), road.getLength());
            return;
        }
        out.printf("%s преодолел дистанцию в %d м кошачьей походкой \n", getName(), road.getLength());

    }
    @Override
    public void swim(Pool pool) {
        System.out.printf("%s не умеет плавать\n", getName());
    }
}
