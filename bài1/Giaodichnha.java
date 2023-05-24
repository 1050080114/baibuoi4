package bài1;

public class Giaodichnha extends Giaodich {

    private String Loainha;
    private String Diachi;
    private int Choose;

    public int getChoose() {
        return Choose;
    }

    public void setChoose(int choose) {
        Choose = choose;
    }

    public String getLoainha() {
        return Loainha;
    }

    public void setLoainha(String Loainha) {

        this.Loainha = Loainha;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public Giaodichnha() {
        super();
    }

    public Giaodichnha(String Loainha, String Diachi) {
        super();
        this.Loainha = Loainha;

        this.Diachi = Diachi;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhập địa chỉ: ");
        Diachi = scanner.nextLine();
        System.out.print("Nhập loại nhà (0: cao cấp, 1: thường): ");
        Choose = scanner.nextInt();
        switch (Choose) {
            case 0:
                Loainha  = "cao cấp";
                break;
            case 1:
                Loainha = "thường";
                break;
            default:
                System.out.println("Chọn số không hợp lệ.");
                break;
        }
    }

}