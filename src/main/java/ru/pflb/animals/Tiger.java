package ru.pflb.animals;

import ru.pflb.obstacles.Road;

import static java.lang.System.out;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(1200, 400, name);
        mapName("Тигр");
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
        out.printf("%s может пробежать до 1200 м\n", getName());

    }
}
