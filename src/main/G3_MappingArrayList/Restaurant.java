package G3_MappingArrayList;

import java.util.List;

public class Restaurant {
    private String restaurant;
    private List<Menu> menu;

    public Restaurant(String restaurant, List<Menu> menu) {
        this.restaurant = restaurant;
        this.menu = menu;
    }

    static class Menu {
        private String name;
        private int price;

        public Menu(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }
}
