package PetShop;

//Subclass cat
class Cat extends Pet {

        public Cat(String name,String type) {
            super(name, type);
        }


        @Override
        public String toString() {
            return "Pet: " + name + "\nType: " + type + "\nThe cat says: " + meow() + " \n";
        }

    public void meow() {
        System.out.println(name + "katten siger meow: meow meow meow!");


    }
}
