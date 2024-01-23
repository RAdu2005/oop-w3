package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, name the zoo:");
        String zooName = sc.nextLine();
        Zoo myZoo = new Zoo(zooName);

        while(true){
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
            String optionInput = sc.nextLine();
            
            int option;
            try{
                option = Integer.parseInt(optionInput);
            }catch(Exception e){
                option = -1;
            }

            switch(option){
                case 1:
                    System.out.println("What species?");
                    String species = sc.nextLine();

                    System.out.println("Enter the name of the animal:");
                    String name = sc.nextLine();

                    System.out.println("Enter the age of the animal:");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Animal animal = new Animal(species, name, age);
                    myZoo.addAnimals(animal);
                    break;
                
                case 2:
                    System.out.println(myZoo.name + " contains the following animals:");
                    myZoo.listAnimals();
                    break;

                case 3:
                    System.out.println("How many laps?");
                    int laps = sc.nextInt();
                    sc.nextLine();

                    myZoo.run(laps);                  
                    break;

                case 0:
                    System.out.println("Thank you for using the program.");
                    sc.close();
                    System.exit(0);
                    return;

                default:
                    System.out.println("Wrong input value");
                    break;
            }
        }
    }
}
