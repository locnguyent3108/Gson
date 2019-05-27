package G2_MapNestedObjects;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
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

    private static void deserialize() throws FileNotFoundException {
        String json = "{'age':12,'email':'abc@gmail.com','name':'locnt','userAddress':{'city':'HN','houseAddress':'Le Duan','street':'NDC'}}";

        //call json file to deserial
        String jsonPATH = "/Users/macmall/Desktop/javaConner/draft/src/main/G2_MapNestedObjects/UserNested.json";
        BufferedReader reader = new BufferedReader(new FileReader(jsonPATH));
        Gson gson = new Gson();
        UserNested userExample = gson.fromJson(reader,UserNested.class);
    }
}
