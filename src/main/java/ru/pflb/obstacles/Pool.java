package ru.pflb.obstacles;

import ru.pflb.animals.Animal;

public class Pool implements Obstacle{
    private int length;
    public Pool(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    @Override
    public void getRacer(Animal animal) {
        animal.swim(this);

    }
}
