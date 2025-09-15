package PetShop;

import java.util.Scanner;

public class ScannerHelperClass {


    //Metode til hvor mange kæledyr
    public int askAmountOfPets() {
        Scanner scanner = new Scanner(System.in);

        int antalPets = 0;

        while (antalPets <= 0) {
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
                scanner.next();
            }
        }



        Pet[] petsRegister = new Pet[antalPets];

        for (int i = 0; i < antalPets; i++) {
            System.out.println("Kæledyr: " + (i+1) + "\t-\t" + "Indtast navn: ");
            String name = scanner.nextLine();


            System.out.println("Indtast type for " + name + ":");
            String type = scanner.nextLine();



            petsRegister[i] = new Pet(name, type);

        }
        return petsRegister;





    }
}
