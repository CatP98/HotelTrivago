public class Extra{
    private String name;
    private double price;

    public Extra(String name, double price) {
        this.name = name;
        this.price = price;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice(String name) {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void checkExtra(String name){
            System.out.println("Extra\'s name: " + name +". Price: " + price + "$.");
        }
        // toString method to display amenity details
        public String toString() {
            return "Amenity: " + name + ", Price: $" + price;
        }
}

