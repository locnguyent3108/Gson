package G3_MappingArrayList;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("G3- Mapping array list ");
        //serialize();
        deserialize();
    }

    private static void serialize(){
        List<Restaurant.Menu> RestaurantFood = new ArrayList<Restaurant.Menu>();
        RestaurantFood.add(new Restaurant.Menu("steak",1000));
        RestaurantFood.add(new Restaurant.Menu("noodle",2000));

        Restaurant restaurant = new Restaurant(
                "restaurantNhau",
                RestaurantFood
        );
        Gson gson = new Gson();
        gson.toJson(restaurant);
    }

    private static void deserialize() {
        String menuJson = "[{'name':'lowCost','price':1200},{'name':'newFood','price':12000}]";

        Gson gson = new Gson();
        //Map vào Array
        Restaurant.Menu[] newFoodArray =  gson.fromJson(menuJson,Restaurant.Menu[].class);

        //Map vao List
        Type menuList = new TypeToken<ArrayList<Restaurant.Menu>>(){}.getType();

        List<Restaurant.Menu> menuA = gson.fromJson(menuJson,menuList);
    }
}
