package JavaBasic.ThisAndSuper.Super;

public class Parent {
    private String ten;

    public Parent(){
        System.out.println("This is parent class");
        print();
    }

    public Parent(String ten) {
        this.ten = ten;
        System.out.println("this is parent class");
        print();
    }

    public void print(){
        System.out.println("ten cua toi la: " + ten);
    }
}
