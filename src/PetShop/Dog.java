package PetShop;

//Subclass
class Dog extends Pet {

    public Dog(String name,String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Pet: " + name + "\nType: " + type +  "\n"+ bark() + "\n";
    }

    public String bark() {
        return name + " says: Bark bark bark!";
    }
}

