package JavaBasic.ThisAndSuper.Super;

public class Child extends Parent{

    public Child(){
        System.out.println("this is child class");
    }


    public Child(String ten) {
        super(ten);
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        // o day trinh` bien dich tu dong them super() vao ham constructore de goi khoi tao lop cha
        Child child1 = new Child();
        System.out.println("___________________");

        //o day constructor child(string ten) se goi ham super() de goi khoi tao lop cha co tham so
        Child child2 =new Child("Loc Nguyen The");
    }

}
