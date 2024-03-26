public class Rooms {

    private int roomNumber;
    private RoomType roomType;
    private boolean isAvailable;
    private Extra extras;

    public Rooms(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
        this.extras = extras;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // toString method to display room details

    public String toString() {
        return "Room Number: " + roomNumber +
                ", Room Type: " + roomType +
                ", Availability: " + (isAvailable ? "Available" : "Occupied");
    }
}
