package PetShop;

//Subclass
class Dog extends Pet {

    public Dog(String name,String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Pet: " + name + "\nType: " + type + "\nThe dog says: " + bark() + " \n";
    }

    public void bark() {
        System.out.println(name + "hunden gør: Bark bark bark!");
    }
}

