package org.example.organic;

import java.util.HashMap;
import java.util.Map;


public class Organic {
    String name;

    public Organic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    static class Animal extends Organic {
        public Animal(String name) {
            super(name);
        }
    }

    static class Cow extends Animal {
        public Cow() {
            super("Cow");
        }
    }

    static class Rabbit extends Animal {
        public Rabbit() {
            super("Rabbit");
        }
    }

    static class Fox extends Animal {
        public Fox() {
            super("Fox");
        }
    }


    static class Bird extends Organic {
        public Bird(String name) {
            super(name);
        }
    }

    static class Eagle extends Bird {
        public Eagle() {
            super("Eagle");
        }
    }

    static class Sparrow extends Bird {
        public Sparrow() {
            super("Sparrow");
        }
    }

    static class Owl extends Bird {
        public Owl() {
            super("Owl");
        }
    }


    static class Plant extends Organic {
        public Plant(String name) {
            super(name);
        }
    }

    static class Grass extends Plant {
        public Grass() {
            super("Grass");
        }
    }

    static class Wheat extends Plant {
        public Wheat() {
            super("Wheat");
        }
    }

    static class Tree extends Plant {
        public Tree() {
            super("Tree");
        }
    }

    public static class FoodChain {
        public void main(String[] args) {

            Organic cow = new Cow();
            Organic rabbit = new Rabbit();
            Organic fox = new Fox();

            Organic eagle = new Eagle();
            Organic sparrow = new Sparrow();
            Organic owl = new Owl();

            Organic grass = new Grass();
            Organic wheat = new Wheat();
            Organic tree = new Tree();


            Map<Organic, Organic> foodChain = new HashMap<>();

            foodChain.put(cow, grass);
            foodChain.put(rabbit, wheat);
            foodChain.put(fox, rabbit);

            foodChain.put(eagle, rabbit);
            foodChain.put(sparrow, wheat);
            foodChain.put(owl, sparrow);


            for (Map.Entry<Organic, Organic> entry : foodChain.entrySet()) {
                System.out.println(STR."\{entry.getKey()} eats \{entry.getValue()}");
            }
        }
    }
}