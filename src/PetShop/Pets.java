package PetShop;

//Superclass
class Pets {

        protected String name;
        protected String type;

        public Pets(String name, String type) {
            this.name = name;
            this.type = type;
        }

        //Måske lav getters og setters hvis noget ikke virker!


        @Override
        public String toString() {
            return "Pet: " + name + "Type: " + type;
        }
    }

}