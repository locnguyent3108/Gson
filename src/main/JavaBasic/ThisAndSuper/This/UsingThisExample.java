package JavaBasic.ThisAndSuper.This;

public class UsingThisExample {
    private String ten;
    private int soNha;
    private int NationalID;
    // dung this de phan biet bien toan cuc va bien cuc bo
    // constructor root
    public UsingThisExample(String ten, int soNha){
        this.ten = ten; // <- co this la bien toan cuc
        this.soNha = soNha;
    }

    public UsingThisExample(String ten, int soNha, int NationalID){
        this(ten, soNha); //bat buoc phai la dong lenh dau tien
        this.NationalID = NationalID;
    }

    public void printTen() {
        System.out.println("toi ten la:" + ten);
    }

    public void printSoNha() {
        System.out.println("so nha cua tui la: " + soNha);
    }

    public void print(){
        // goi phuong thuc o lop hien tai
        this.printSoNha();
        this.printTen();
    }

    //Tra ve instance cua lop hien tai
    public UsingThisExample setSoNha() {
        System.out.println("241");
        return this;
    }

    public UsingThisExample setTen() {
        System.out.println("Loc nguyen the");
        return this;
    }
}
