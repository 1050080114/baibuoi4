package bài1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Giaodichnha> arrGiaodichnha = new ArrayList<>();
        ArrayList<Giaodichdat> arrGiaodichdat = new ArrayList<>();
        int soGiaodichdat = 0, soGiaodichnha = 0;
        long tongTienGiaodichdat = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giao dịch đất: ");
        soGiaodichdat = scanner.nextInt();
        System.out.print("Nhập số giao dịch nhà: ");
        soGiaodichnha = scanner.nextInt();

        System.out.println("Nhập thông tin giao dịch đất:");
        for (int i = 0; i < soGiaodichdat; i++) {
            System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
            Giaodichdat Giaodichdat = new Giaodichdat();
            Giaodichdat.nhap();
            arrGiaodichdat.add(Giaodichdat);
        }

        System.out.println("Nhập thông tin giao dịch nhà:");
        for (int i = 0; i < soGiaodichnha; i++) {
            System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
            Giaodichnha Giaodichnha = new Giaodichnha();
            Giaodichnha.nhap();
            arrGiaodichnha.add(Giaodichnha);
        }

        System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < arrGiaodichnha.size(); i++) {
            System.out.println(arrGiaodichdat.get(i).toString());
        }

        System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < arrGiaodichnha.size(); i++) {
            System.out.println(arrGiaodichnha.get(i).toString());
        }

        for (int i = 0; i < arrGiaodichdat.size(); i++) {
            if (arrGiaodichdat.get(i).getLoaidat().equalsIgnoreCase("A")) {
                tongTienGiaodichdat += arrGiaodichdat.get(i).getDientich() *
                        arrGiaodichdat.get(i).getDongia() * 1.5;
            } else if (arrGiaodichdat.get(i).getLoaidat().equalsIgnoreCase("B") ||
                    arrGiaodichdat.get(i).getLoaidat().equalsIgnoreCase("C")) {
                tongTienGiaodichdat += arrGiaodichdat.get(i).getDientich() *
                        arrGiaodichdat.get(i).getDongia();
            }
        }
        trungBinhThanhTien = tongTienGiaodichdat / (arrGiaodichdat.size());
        System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);

        // xuất ra các giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGiaodichdat.size(); i++) {
            String[] dateGiaodichdat = arrGiaodichdat.get(i).getNgaygiaodich().split("/");
            if (dateGiaodichdat[1].equals("9") && dateGiaodichdat[2].equals("2013")) {
                System.out.println(arrGiaodichdat.get(i).toString());
            }
        }

        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGiaodichnha.size(); i++) {
            String[] dateGiaodichnha = arrGiaodichnha.get(i).getNgaygiaodich().split("/");
            if (dateGiaodichnha[1].equals("9") && dateGiaodichnha[2].equals("2013")) {
                System.out.println(arrGiaodichnha.get(i).toString());
            }
        }
    }

}
