package G1_GettingStarted;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class main {
    public static void main(String[] args) {
        System.out.println("G1- Getting started");
        serializeUserSimple();
        deserializeUserSimple();
    }

    private static void serializeUserSimple(){
        userSimple userSimple1 = new userSimple("loc"
                ,"abc@gmail.com",
                12);
        Gson gson = new Gson();
        String json = gson.toJson(userSimple1);
    }

    private static void deserializeUserSimple(){
        String userA = "{'name':'loc','email':'abc@gmail.com','age':12,'a':12}";

        Gson gson = new Gson();
        userSimple userSimpleA = gson.fromJson(userA, userSimple.class);

        //Read from json file
        JsonReader reader = new(JsonReader (new FileReader("userSimple.json")));
    }
}
