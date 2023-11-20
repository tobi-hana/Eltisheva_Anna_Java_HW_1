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
        if(isHindered){
            return;
        }
        isHindered = true;
        if(road.getLength() > maxRunDistance) {
            out.printf("%s не смог пробежать %d м \n", name, road.getLength());
            return;
        }
        isHindered = false;
        out.printf("%s пробежал %d м \n", name, road.getLength());

    }
    public void swim(Pool pool) {
        if(isHindered){
            return;
        }
        isHindered = true;
        if(pool.getLength() > maxSwimDistance) {
            out.printf("%s не смог проплыть %d м \n", name, pool.getLength());
            return;
        }
        isHindered = false;
        out.printf("%s проплыл %d м \n", name, pool.getLength());
    }
    public boolean hasObstacles() {
        return isHindered;
    }
}
