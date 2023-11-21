package ru.pflb.animals;

import ru.pflb.obstacles.Pool;
import ru.pflb.obstacles.Road;
import static java.lang.System.out;
// просто показать существование статического импорта

public abstract class Animal {
    private int maxRunDistance;
    private int maxSwimDistance;

    private String name;

    private Boolean isHindered = false;
    public Animal(int maxRunDistance, int maxSwimDistance, String name){
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.name = name;
    }

    public Animal(int maxRunDistance, String name){
        this.maxRunDistance = maxRunDistance;
        this.name = name;
    }
    public int getMaxRunDistance(){
        return maxRunDistance;
    }
    public int getMaxSwimDistance(){
        return maxSwimDistance;
    }


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void mapName(String species) {
        setName(species.concat(" ").concat(name));
    }

    public void run(Road road) {
        if(hasObstacles()){
            return;
        }
        if(road.getLength() > getMaxRunDistance()) {
            makeHindered();
            out.printf("%s не смог пробежать %d м \n", getName(), road.getLength());
            return;
        }
        out.printf("%s пробежал %d м \n", getName(), road.getLength());

    }
    public void swim(Pool pool) {
        if(hasObstacles()){
            return;
        }
        if(pool.getLength() > getMaxSwimDistance()) {
            makeHindered();
            out.printf("%s не смог проплыть %d м \n", getName(), pool.getLength());
            return;
        }
        out.printf("%s проплыл %d м \n", getName(), pool.getLength());
    }
    public boolean hasObstacles() {
        return isHindered;
    }
    public void makeHindered() {
        isHindered = true;
    }
}
