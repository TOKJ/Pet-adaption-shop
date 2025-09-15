package PetShop;

//Subclass lizzard
class Lizzard extends Pet {

        public Lizzard(String name,String type) {
            super(name, type);
        }

        @Override
        public String toString() {
            return "Pet: " + name + "\nType: " + type + "\nThe lizzard says: " + hiss() + " \n";
        }

        public String hiss() {
            return name + " Lizzard says: Hizz hizz hizz";
        }
    }
