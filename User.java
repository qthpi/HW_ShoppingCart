public class User {
    String name, address, contact;

    User(String name, String address, String contact){
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    static User inputDetails(){
        System.out.println("REGISTRATION");
        System.out.println("What is your name?");
        String name = MyScanner.scan();
        System.out.println("Where is your delivery address?");
        String address = MyScanner.scan();
        System.out.println("What is your mobile number?");
        String contact = MyScanner.scan();
        User human = new User(name, address, contact);
        return human;
        }



}
