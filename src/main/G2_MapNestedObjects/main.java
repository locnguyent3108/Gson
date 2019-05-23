package G2_MapNestedObjects;

import com.google.gson.Gson;

public class main {
    public static void main(String[] args) {
        System.out.println("G2 ---- Mapping of nessted Objects");
        serialize();
    }

    private static void serialize(){
        Gson gson = new Gson();

        UserAddress AddressUserA = new UserAddress(
          "HN",
          "Le Duan",
          "NDC"
        );

        UserNested exampleUser = new UserNested(
          12,
          "abc@gmail.com",
          "locnt",
          AddressUserA
        );

        String userJson = gson.toJson(exampleUser);
    }

    private static void deserialize(){
        String json = "{'age':12,'email':'abc@gmail.com','name':'locnt','userAddress':{'city':'HN','houseAddress':'Le Duan','street':'NDC'}}";

        Gson gson = new Gson();
        UserNested userExample = gson.fromJson(json,UserNested.class);
    }
}
