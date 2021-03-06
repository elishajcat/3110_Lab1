public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Howard";
        this.address = "2468 Ottawa Road";
        this.phoneNumber = "123-456-7890";
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static void main(String[] args) {

        BuddyInfo newBuddy = new BuddyInfo("Homer", "1234 Carleton Street", "613-123-4567");

        System.out.println("Hello " + newBuddy.getName());
    }
}