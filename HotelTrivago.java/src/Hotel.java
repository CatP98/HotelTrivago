
import java.util.ArrayList;
import java.util.List;

    public class Hotel {
        private String hotelName;
        private List<Rooms> roomsList;
        private List<Guest> guestList;
        private List<Bank> bankList;


        public Hotel(String hotelName) {
            this.hotelName = hotelName;
            this.roomsList = new ArrayList<>();
            this.guestList = new ArrayList<>();
            this.bankList = new ArrayList<>();
        }

        // Method to add rooms to the hotel
        public void addRoom(Rooms room) {
            roomsList.add(room);
        }

        // Method to check if a room is available
        public boolean isRoomAvailable(int roomNumber) {
            for (Rooms room : roomsList) {
                if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                    return true;
                }
            }
            return false;
        }

        // Method to check in a guest
        public void checkInGuest(Guest guest) {
            guestList.add(guest);
            int roomNumber = guest.getRoomNumber();
            for (Rooms room : roomsList) {
                if (room.getRoomNumber() == roomNumber) {
                    room.setAvailable(false);
                    break;
                }
            }
        }

        // Method to check out a guest
        public void checkOutGuest(Guest guest) {
            guestList.remove(guest);
            int roomNumber = guest.getRoomNumber();
            for (Rooms room : roomsList) {
                if (room.getRoomNumber() == roomNumber) {
                    room.setAvailable(true);
                    guest.checkOutRefund();
                    break;
                }
            }
        }

        // Method to get guest list
        public List<Guest> getGuestList() {
            return guestList;
        }

        // Method to display available rooms
        public void displayAvailableRooms() {
            System.out.println("Available Rooms in " + hotelName + ":");
            for (Rooms room : roomsList) {
                if (room.isAvailable()) {
                    System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getRoomType().getRoomType().getTypeName());
                }
            }
        }

        // Method to display guest list
        public void displayGuestList() {
            System.out.println("Guests in " + hotelName + ":");
            for (Guest guest : guestList) {
                guest.printGuestInfo();
            }
        }

        public void listMatching(String searchName) {
            for (Guest guest : guestList) {
                if (guest.getName().contains(searchName)) {
                    System.out.println(guest);
                }
            }
        }
    }
