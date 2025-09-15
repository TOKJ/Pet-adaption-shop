package PetShop;

//Superclass
class Pet {

        protected String name;
        protected String type;

        public Pet(String name, String type) {
            this.name = name;
            this.type = type;
        }


        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }


        @Override
        public String toString() {
            return "Pet: " + name + "Type: " + type;
        }
    }

}