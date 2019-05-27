package JavaBasic.GPCoder_OverView_OOP;

public class OverviewOOP {
    // khai báo thuộc tính
    String lopOOP;
    String thuoctinhOOP;

    public OverviewOOP(String lopOOP, String thuoctinhOOP) {
        //su dung this de truy cap thuoc tinh lopOOP, thuoctinhOOP trong class
        // neu ko su dung this thi chi truy cap vao tham so cua ham khoi tao
        this.lopOOP = lopOOP;
        this.thuoctinhOOP = thuoctinhOOP;
        System.out.println("here is automation cores");
    }

    // phuong thuc getter
    public String getLopOOP(){
        return lopOOP;
    }

    public String getThuoctinhOOP() {
        return thuoctinhOOP;
    }

    //phuong thuc setter
    public void setLopOOP(){
        this.lopOOP = lopOOP;
        this.thuoctinhOOP = thuoctinhOOP;
    }


}
