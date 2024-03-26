public class Guest {
    private int pax;
    private String roomTypePreference;
    private boolean checkedIn;
    private String checkInDate;
    private String checkOutDate;
    private int roomNumber;
    private Bank moneyAmount;
    private Profile profile;

    public Guest(Profile profile, int pax, String roomTypePreference, boolean checkedIn, String checkInDate, String checkOutDate, int roomNumber, Bank moneyAmount) {
        this.pax = pax;
        this.roomTypePreference = roomTypePreference;
        this.checkedIn = checkedIn;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomNumber = roomNumber;
        this.moneyAmount = moneyAmount;
        this.profile = profile;
    }

    public void printGuestInfo(){
        System.out.println("Guest\'s name: " + profile.getName());
        System.out.println("Guest\'s Key: " + profile.getHotelKey());
        System.out.println("Guest\'s Contact Number: " + profile.getContactNumber());
    }
    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public String getRoomTypePreference() {
        return roomTypePreference;
    }

    public void setRoomTypePreference(String roomTypePreference) {
        this.roomTypePreference = roomTypePreference;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBankAccountInfo() {
        return moneyAmount.checkBalance();
    }


    // Method to add a new profile to the guest
    public void addProfile(String name, String contactNumber) {
        // Assuming hotel key is incremented for each new profile
        int newHotelKey = profile.getHotelKey() + 1;
        Profile newProfile = new Profile(name, contactNumber, newHotelKey);
        this.profile = newProfile;
    }
    public void removeProfileWithName(String name, String contactNumber){
        System.out.println("Successfully Unsubscribed.");
        this.profile = null;
    }
    public String getName(){
        return profile.getName();
    }
    public Bank checkOutRefund(){
        return moneyAmount;
    }

}
