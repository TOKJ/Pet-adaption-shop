package PetShop;

//Subclass cats
class Cats extends Pets {

        public Cats(String name,String type) {
            super(name, type);
        }

        @Override
        public String toString() {
            return "Pet: " + name + "Type: " + type;
        }

        public void meow() {
            System.out.println(name + "katten siger meow: meow meow meow!");
        }
    }
}
