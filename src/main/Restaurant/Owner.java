package Restaurant;

public class Owner {
    private String name;
    private Location location;
    private staff currentStaff;

    public Owner(String name, Location location, staff currentStaff) {
        this.name = name;
        this.location = location;
        this.currentStaff = currentStaff;
    }

    static class Location {
        private String name;
        private address Address;

        public Location(String name, address address) {
            this.name = name;
            Address = address;
        }

    static class address{
             private String city;
             private String street;

             public address(String city, String street) {
                 this.city = city;
                 this.street = street;
             }
         }
    }


    static class staff{
        private int age;
        private int salary;
        private String name;

        public staff(int age, int salary, String name) {
            this.age = age;
            this.salary = salary;
            this.name = name;
        }
    }
}
