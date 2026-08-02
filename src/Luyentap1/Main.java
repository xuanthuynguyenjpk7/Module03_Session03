package Luyentap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhập thông tin
        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        Double gia = sc.nextDouble();

        System.out.print("Nhập số lượng mua: ");
        int soLuong = sc.nextInt();

        System.out.println("Khách có thẻ thành viên hay không: ");
        boolean thanhVien = sc.nextBoolean();
        // Tính toán
        double thanhTien = gia * soLuong;
        double giamGia = 0;
        if (thanhVien) {
            giamGia = thanhTien * 0.1;
        }
        double vat = (thanhTien - giamGia) * 0.08;
        double tongTien =  thanhTien - gia + vat;

        //xuất kết quả
        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.println("Khách hàng: " + tenKhachHang);
        System.out.println("Sản phẩm: " + tenSanPham);
        System.out.println("Số lượng: " + soLuong);
        System.out.printf("Thành tiền : %,.0f VND%n",  thanhTien);
        System.out.printf("Giảm giá: %,.0f VND%n",  giamGia);
        System.out.printf("Tiền VAT: %,.0f VND%n" + vat);
        System.out.printf("Tổng thanh toán: %,.0f VND%n", tongTien);
        sc.close();
    }
}
