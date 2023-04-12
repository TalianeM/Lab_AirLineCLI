public class Passenger {

    private String name;
    private long contactNumber;
    private int id;

    public Passenger(String name, long contactNumber, int id){
        this.name = name;
        this.contactNumber = contactNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
