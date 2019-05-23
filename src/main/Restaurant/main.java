package Restaurant;

import com.google.gson.Gson;

public class main {

    public static void main(String[] args) {
        System.out.println("G2_MapNestedObjects_Complex_example");
        serialize();
        //deserialize();
    }

    private  static void serialize() {
       Owner.staff currentStaff = new Owner.staff(
               12,
               1000,
               "abc"
       );

       Owner.Location.address currentAddress = new Owner.Location.address(
               "hcm",
               "sugar"
       );

       Owner.Location currentLocation = new Owner.Location(
               "cua Hang A",
               currentAddress
       );
       Owner currentOwner = new Owner(
               "Locbde",
               currentLocation,
               currentStaff
       );


        Gson gson = new Gson();
        String json = gson.toJson(currentOwner);
    }

}

