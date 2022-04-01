package com.syntax.class23;


    public class Dog {
        String name;
        String color;
        String breed;
        int age;
        double weight;

        //overloading the constructors
        Dog() {
            System.out.println("No Argument constructor");
        }

        Dog(String name) {
            this.name = name;
        }

        public Dog(String name, String color, String breed, int age, double weight) {
            this.name = name;
            this.color = color;
            this.breed = breed;
            this.age = age;
            this.weight = weight;
        }

        void changeInfo(String name) {
            this.name = name;
        }

        void changeInfo(String name, String color) {
            this.name = name;
            this.color = color;
        }

        void changeInfo(String name, String color, String breed) {
            this.name = name;
            this.color = color;
            this.breed = breed;
        }


        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", breed='" + breed + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }


        public static void main(String[] args) {
            Dog dog = new Dog();
            System.out.println(dog);
            Dog dog2 = new Dog("Tommy",
                    "Green", "RedBull", 12, 25.5);
            dog2.changeInfo("Rocky", "Black", "BullDog");
            System.out.println(dog2);


        }
    }