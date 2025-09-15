package PetShop;

//Subclass
class Dogs extends Pets {

    public Dogs(String name,String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Pet: " + name + "Type: " + type;
    }

    public void bark() {
        System.out.println(name + "hunden gør: Bark bark bark!");
    }
}

