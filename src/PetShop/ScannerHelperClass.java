package PetShop;

import java.util.Scanner;

public class ScannerHelperClass {


    //Metode til hvor mange kæledyr
    public Pet[] askAmountOfPets() {
        Scanner scanner = new Scanner(System.in);

        int antalPets = 0;


        while (antalPets <= 0 || antalPets > 25) {
            System.out.print("Indtast antallet af kæledyr til registrering: ");

            if (scanner.hasNextInt()) {
                antalPets = scanner.nextInt();
                scanner.nextLine();

                if (antalPets <= 0) {
                    System.out.println("Indtast venligst et helt tal over nul.");
                }
            } else {
                System.out.println("Fejl: du skal indtaste et heltal!");
                //scanner.next sletter forkert indput!
                scanner.nextLine();
            }
        }



        Pet[] petsRegister = new Pet[antalPets];

        for (int i = 0; i < antalPets; i++) {
            System.out.println("\n\nIndtast navn til kæledyr: ");
            System.out.print("Kæledyr: " + (i + 1) + "\t-\t" + "Indtast navn: ");
            String name = scanner.nextLine();
            System.out.println();

//honest to god jeg ved ikke hvorfor det virker men nu er varriablen intialiseret :)
            String type = "string";

            boolean validType = false;

            while (!validType) {
                System.out.println("Følgende typer kan indtastes: cat, dog, lizzard!");
                System.out.print("Indtast type for \t" + name + ": ");
                type = scanner.nextLine();
                System.out.println();

                if (type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat") ||type.equalsIgnoreCase("lizzard")) {
                    validType = true;
                } else{
                    System.out.println("Fejl: indtast en af føglende typer: cat, dog, lizzard!");
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
