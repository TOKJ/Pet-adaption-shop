package PetShop;

import java.util.Scanner;

public class PetShopTest {

    public static void main(String[] args) {
        ScannerHelperClass helperClass = new ScannerHelperClass();

        System.out.println("\nWelcome to PetShop! etc. TESTESTTEST!\n\n");

        Pet[] pets = helperClass.askAmountOfPets();

        System.out.println("Følgende kæledyr er nu registreret: ");
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}