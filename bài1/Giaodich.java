package bài1;

import java.util.Scanner;

public class Giaodich {

    private static final float dientich = 0;
    private static final double dongia = 0;

    public Giaodich(int magiaodich, String loaidat, String Ngaygiaodich, double Dongia, float Dientich) {
        Magiaodich = magiaodich;

        Ngaygiaodich = ngaygiaodich;
        Dongia = dongia;
        Dientich = dientich;
    }

    @Override
    public String toString() {
        return "Giaodich [Magiaodich=" + Magiaodich + ", Ngaygiaodich=" + Ngaygiaodich
                + ", Dongia =" + Dongia + ", Dientich=" + Dientich + "]";
    }

    private int Magiaodich;

    private String Ngaygiaodich;
    private double Dongia;
    private float Dientich;
    private String ngaygiaodich;
    Scanner scanner = new Scanner(System.in);

    public int getMagiaodich() {
        return Magiaodich;
    }

    public void setMagiaodich(int magiaodich) {
        Magiaodich = magiaodich;
    }

    public String getNgaygiaodich() {
        return Ngaygiaodich;
    }

    public void setNgaygiaodich(String Ngaygiaodich) {
        Ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double Dongia) {
        Dongia = dongia;
    }

    public Giaodich() {
        super();

    }

    public float getDientich() {
        return Dientich;
    }

    public void setDientich(float Dientich) {

        Dientich = dientich;
    }

    public void nhap() {
        System.out.println("Nhap ma giao dich ;");
        Magiaodich = scanner.nextInt();
        System.out.println("nhap ngay giao dich:");
        Ngaygiaodich = scanner.nextLine();
        System.out.println("nhap don gia:");
        Dongia = scanner.nextDouble();
        System.out.println("nhap dien tich:");
        Dientich = scanner.nextFloat();

    }

}
