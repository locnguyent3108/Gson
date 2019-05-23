package G1_GettingStarted;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("G1- Getting started");
      //  serializeUserSimple();
        deserializeUserSimple();
    }

    private static void serializeUserSimple(){
        userSimple userSimple1 = new userSimple("loc"
                ,"abc@gmail.com",
                12);
        Gson gson = new Gson();
        String json = gson.toJson(userSimple1);
    }

    private static void deserializeUserSimple() throws FileNotFoundException {
        String userA = "{'name':'loc','email':'abc@gmail.com','age':12,'a':12}";

        Gson gson = new Gson();
        userSimple userSimpleA = gson.fromJson(userA, userSimple.class);

        //Read from json file
        String jsonPATH = "/Users/macmall/Desktop/javaConner/draft/src/main/G1_GettingStarted/userSimple.json";
        BufferedReader bufferedReader = new BufferedReader(new  FileReader(jsonPATH));

        userSimple userSimpleB = gson.fromJson(bufferedReader,userSimple.class);

        System.out.println(userSimpleB.getClass());

        System.out.println(userSimpleB.toString());
    }
}
