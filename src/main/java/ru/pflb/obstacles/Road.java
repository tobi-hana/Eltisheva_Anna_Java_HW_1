package ru.pflb.obstacles;

import ru.pflb.animals.Animal;

public class Road implements Obstacle{
    private int length;
    public Road(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    @Override
    public void getRacer(Animal animal) {
        animal.run(this);

    }
}
