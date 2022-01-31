package ru.samsung.itschool.mdev;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
Collections

List-ы (List - интерфейс)
Реализации (классы): ArrayList, LinkedList, Stack, Queue
                                   LIFO    FIFO
Set-ы (Set - интерфейс)
Реализации (классы): TreeSet, HashSet

Map-ы (Словарь ключ-значение)
Реализации (классы): Hashtable, HashMap, LinkedHashMap, TreeMap

 */
      //   Collection - interface
      //  Collections

        // Collections.

        Collection arrayList = new ArrayList();
        List<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();

        // CRUD

        ArrayList<Integer> al1 = new ArrayList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0; i<100000; i++) {
            al1.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add to begin:  "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<100000; i++) {
            ll1.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to begin: "+(end-start));


        start = System.nanoTime();
        for(int i=30000; i<60000; i++) {
            al1.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get middle:  "+(end-start));

        start = System.nanoTime();
        for(int i=30000; i<60000; i++) {
            ll1.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get middle: "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<30000; i++) {
            al1.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add to the end:  "+(end-start));

        start = System.nanoTime();
        for(int i=0; i<30000; i++) {
            ll1.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the end: "+(end-start));

        // Stack
        // LIFO - Last in First out
        // Queue
        // FIFO - First in First out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // кладем в стек
            queue.offer(s);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop() + " "); // удаляет с конца и возращает
        }
        while(!queue.isEmpty()) {
            System.out.println(queue.poll() + " "); // удаляет сначала и возращает
        }

        int intArr[] = {30,40,481,6,-900,2};

        Arrays.sort(intArr);
        // -900,2,6,30,40,481
        Arrays.binarySearch(intArr,40); // - not found
        Collections.binarySearch(al1,50000);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Maria");
        names.add("Alex");

        Collections.sort(names);

        class City {
            private String name;
            private int population;

            public City(String name, int population) {
                this.name = name;
                this.population = population;
            }
        }

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Moscow",2358939));
        cities.add(new City("Berlin",1237237));
        cities.add(new City("New York",79494929));

        Comparator<City> sort_by = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.name.compareTo(o2.name);
                //return o1.population-o2.population;
            }
        };


        Collections.sort(cities,sort_by);
        for(City c: cities) {
            System.out.println(c.population + " - "+c.name);
        }

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Barsik",10));
        animals.add(new Animal("Rex",3));
        animals.add(new Animal("Bobik",1));

        Collections.sort(animals);

        
    }
}
