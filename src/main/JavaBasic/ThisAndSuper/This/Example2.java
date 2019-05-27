package JavaBasic.ThisAndSuper.This;

public class Example2 {
    public String soBaoHiem;
    public String congTyHienTai;


    public String getSoBaoHiem() {
        return soBaoHiem;
    }

    public void setSoBaoHiem() {
        this.soBaoHiem = "abc12345";
    }

    public String getCongTyHienTai() {
        return congTyHienTai;
    }

    public void setCongTyHienTai() {
        this.congTyHienTai = "diachiso103";
    }

    public void print(){
    /* phương thức print sẽ gọi hàm khởi tạo của lớp helper với tham số là this(tham chiếu biến íntance của current class
     * sau đó gọi hàm printSoBaoHiem va printCongTyHienTai.
     */
        Helper helper = new Helper();
        helper.print(this);
    }

    public static void main(String[] args) {
        Example2 us = new Example2();
        us.setCongTyHienTai();
        us.setSoBaoHiem();
        us.print();
    }
}
