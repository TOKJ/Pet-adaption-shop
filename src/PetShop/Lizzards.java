package PetShop;

//Subclass lizzards
class Lizzards extends Pets {

        public Lizzards(String name,String type) {
            super(name, type);
        }

        @Override
        public String toString() {
            return "Pet: " + name + "Type: " + type;
        }

        public void hiss() {
            System.out.println(name + "Lizzards says: Hizz hizz hizz");
        }
    }
}