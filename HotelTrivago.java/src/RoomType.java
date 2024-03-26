public class RoomType{
    public class RoomTypo{

        private String typeName;
        private double price;
        private int capacity;

        //constructor
        public RoomType(String typeName, double price, int capacity) {
            this.typeName = typeName;
            this.price = price;
            this.capacity = capacity;
        }
     public enum RoomTypes{
         SINGLE(new RoomType("Single Room", 100, 1)),
         DOUBLE(new RoomType("Double Room", 180, 2)),
         SUITE(new RoomType("Suite Room", 300, 4))
     }
        private RoomType roomType;

        public void RoomTypes(RoomType roomType) {
            this.roomType = roomType;
        }

        // Getter for RoomType
        public RoomType getRoomType() {
            return roomType;
        }
    }
}

