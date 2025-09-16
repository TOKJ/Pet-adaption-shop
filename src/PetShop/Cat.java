package PetShop;

//Subclass cat
class Cat extends Pet {

        public Cat(String name,String type) {
            super(name, type);
        }


        @Override
        public String toString() {
            return "Pet: " + name + "\nType: " + type + "\n" + meow() + "\n";
        }

    public String meow() {
        return name + " says: meow meow meow!";

    }
}
