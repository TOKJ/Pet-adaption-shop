package PetShop;

import java.util.Scanner;

public class ScannerHelperClass {


    //Metode til hvor mange kæledyr
    public Pet[] askAmountOfPets() {
        Scanner scanner = new Scanner(System.in);

        int antalPets = 0;
        int maxAmountOfPets = 25;


        while (antalPets <= 0 || antalPets > maxAmountOfPets) {
            System.out.print("Please write the amount of pets for registering: ");

            if (scanner.hasNextInt()) {
                antalPets = scanner.nextInt();
                scanner.nextLine();

                if (antalPets <= 0) {
                    System.out.println("Please only input a number above 0.");
                } else if (antalPets > maxAmountOfPets) {
                    System.out.println("Please only input a max of " + maxAmountOfPets + " pets!");
                }
            } else {
                System.out.println("Error: please input a whole number!");
                //scanner.next sletter forkert indput!
                scanner.nextLine();
            }
        }



        Pet[] petsRegister = new Pet[antalPets];

        for (int i = 0; i < antalPets; i++) {
            System.out.println("\n\nEnter name of pet: ");
            System.out.print("Pet: " + (i + 1) + "\t  -\t" + "Enter name: ");
            String name = scanner.nextLine();
            System.out.println();

//honest to god jeg ved ikke hvorfor det virker men nu er varriablen intialiseret :)
            String type = "string";

            boolean validType = false;

            while (!validType) {
                System.out.println("The following pet types are allowed: cat, dog, lizzard!");
                System.out.print("Input pet type for " + name + ": ");
                type = scanner.nextLine();
                System.out.println();

                if (type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat") ||type.equalsIgnoreCase("lizzard")) {
                    validType = true;
                } else{
                    System.out.println("Error: please only input one of the following types: cat, dog, lizzard!");
                }
            }

            //  petsRegister[i] = new Pet(name, type);

            if (type.equalsIgnoreCase("cat")) {
                petsRegister[i] = new Cat(name, "Cat");

            } else if (type.equalsIgnoreCase("dog")) {
                petsRegister[i] = new Dog(name, "Dog");

            } else if (type.equalsIgnoreCase("Lizzard")) {
                petsRegister[i] = new Lizzard(name, "Lizzard");
            }


        }

        return petsRegister;


    }
}
