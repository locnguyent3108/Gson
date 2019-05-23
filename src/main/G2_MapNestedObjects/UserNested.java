package G2_MapNestedObjects;

public class UserNested {
    private int age;
    private String email;
    private String name;

    private UserAddress userAddress;

    public UserNested(int age, String email, String name, UserAddress userAddress) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.userAddress = userAddress;
    }
}
