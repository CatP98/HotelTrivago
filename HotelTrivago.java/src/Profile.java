public class Profile {
    private String name;
    private String contactNumber;
    private int hotelKey;

    public Profile(String name, String contactNumber, int hotelKey){
        this.name = name;
        this.contactNumber = contactNumber;
        this.hotelKey = hotelKey;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
    public int getHotelKey(){
        return hotelKey;
    }

    public String toString() {
        return "Name: " + name + ", Contact Number: " + contactNumber + ", ID: " + hotelKey;
    }



}
