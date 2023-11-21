package ru.pflb;

import ru.pflb.animals.*;
import ru.pflb.obstacles.Pool;
import ru.pflb.obstacles.Road;

import java.lang.reflect.InvocationTargetException;
import java.util.*;
/*
 * Чтобы добвавить любое количество других видов животных
 * вписать в массив species
 * 28 строка
 *
 * Я подумала животное в гонке вначале должно добежать до бассейна
 * и потом плыть
 * поэтому если оно не добежало, то точно не плывет
 * если в любом случае по 2 вывода на животное должно быть
 * закоменитить строку 49
 * все мои животные плавают меньше чем бегают
* */

public class Main {
    public static void main(String[] args) {
        int distance = 1 + random.nextInt(1000);
        Road road = new Road( distance);
        Pool pool = new Pool(distance);
//        Сюда можно вставить любое количество дргуих животных
        Class[] species = {Cat.class, Dog.class, Humster.class, Rat.class, Tiger.class, Wolf.class};
//        В задании написали создать МАССИВ животных
        Animal[] animals = new Animal[0];
        for(Class cl : species) {
            int counter = 1 + random.nextInt(3);
            animals = Arrays.copyOf(animals, animals.length + counter);
            for(int i = 0; i < counter; i++) {
                try {
                    animals[animals.length - 1 - i] = (Animal) cl.getConstructor(String.class)
                            .newInstance(names.get(random.nextInt(names.size())));
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
        shuffleArray(animals);

        for (Animal racer : animals){
            System.out.println();
            road.getRacer(racer);
//            Убрать следующую строку если у каждого должно быть по 2 сообщения
            if(racer.hasObstacles()) continue;
            pool.getRacer(racer);
        }
    }
    private static Random random = new Random();

    public static <E> void shuffleArray(E[] array) {
        for(int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length - i);
            E temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    private static List<String> names = new ArrayList<>();
    static {
        names.add("Барсик");
        names.add("Борис");
        names.add("Кузя");
        names.add("Леопольд");
        names.add("Том");
        names.add("Джерри");
        names.add("Салем");
        names.add("Живоглот");
        names.add("Бегемот");
        names.add("Бетховен");
        names.add("Мухтар");
        names.add("Шарик");
        names.add("Геркулес");
        names.add("Майло");
        names.add("Хатико");
        names.add("Артемон");
        names.add("Джек");
        names.add("Тузик");
        names.add("Бим");
        names.add("Бобик");
    }
}