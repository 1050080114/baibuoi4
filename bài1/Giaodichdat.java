package bài1;

public class Giaodichdat extends Giaodich {

    private String Loaidat;

    public String getLoaidat() {
        return Loaidat;
    }

    public void setLoaidat(String Loaidat) {
        Loaidat = getLoaidat();
    }

    public Giaodichdat() {
        super();
    }

    public Giaodichdat(String Loaidat) {
        super();
        this.Loaidat = Loaidat;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhập loại đất (A/B/C): ");
        Loaidat = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + this.Loaidat;
    }
}
