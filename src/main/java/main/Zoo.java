package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> animalList = new ArrayList<>();

    public Zoo(String name){
        this.name = name;
    }

    public void addAnimals(Animal animal){
        animalList.add(animal);
    }

    public void run(int laps){        
        for(Animal i : this.animalList){
            for(int j = 0; j < laps; j++){
                System.out.println(i.name + " runs really fast!");
            }
        }  
    }

    public void listAnimals(){
        for(Animal i : this.animalList){
            System.out.println(i.species + " : " + i.name + ", " + i.age + " years");
        }
    }
}
