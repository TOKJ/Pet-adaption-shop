package PetShop;

//Subclass lizzard
class Lizzard extends Pet {

        public Lizzard(String name,String type) {
            super(name, type);
        }

        @Override
        public String toString() {
            return "Pet: " + name + "\nType: " + type + "\n" + hiss() + "\n";
        }

        public String hiss() {
            return name + " says: Hizz hizz hizz!";
        }
    }
