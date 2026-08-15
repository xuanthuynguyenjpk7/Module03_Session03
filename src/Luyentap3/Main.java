package Luyentap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //biến số nhân viên
        double sum = 0; // biến tổng lương
        double max = 0; //biến lương cao nhất lớn hơn 0
        double min = 500000000; //biến lương thấp nhất phải nhỏ hơn 500tr
        double totalBonus = 0;
        do {
            System.out.println("\n=====MENU======");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---Nhập lương nhân viên (nhập -1 để kết thúc)--- ");
                    while (true) {
                        System.out.print("Nhập lương: ");
                        double salary = sc.nextDouble();
                        // Nhập -1 để kết thúc
                        if (salary == -1) {
                            break;
                        }
                        // Kiểm tra lương hợp lệ
                        if (salary < 0 || salary > 500000000) {
                            System.out.println("Lương không hợp lệ. Nhập lại.");
                            continue;
                            //continue nghĩa là:Bỏ qua phần code còn lại của vòng lặp hiện tại 
                            // và quay lại nhập lương tiếp.
                        }
                        //tính lương khi nhập hợp lệ
                        count++;
                        sum += salary;
                        if (salary > max) {
                            max = salary;
                        }
                        if (salary < min) {
                            min = salary;
                        }
                        //phân loại lương
                        if (salary <= 5000000) {
                            totalBonus += salary * 0.05;
                            System.out.println("-> Phân loại: Thu nhập thấp");
                        } else if (salary <= 15000000) {
                            totalBonus += salary * 0.10;
                            System.out.println("-> Phân loại: Thu nhập trung bình");
                        } else if (salary <= 50000000) {
                            totalBonus += salary * 0.15;
                            System.out.println("-> Phân loại: Thu nhập khá");
                        } else if (salary < 100000000) {
                            totalBonus += salary * 0.20;
                            System.out.println("-> Phân loại: Thu nhập cao");
                        } else {
                            totalBonus += salary * 0.25;
                            System.out.println("-> Phân loại: Thu nhập cao");
                        }
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu!");
                    } else {
                        double average = sum / count;
                        System.out.println("----Thống Kê----");
                        System.out.println("Số nhân viên: " + count);
                        System.out.printf("Tổng lương: %,.0f VNĐ%n", sum);
                        //%,.0f có tác dụng thêm dấu phân cách hàng nghìn và không hiển thị số lẻ
                        System.out.printf("Lương trung bình: %,.0f VNĐ%n", average);
                        System.out.printf("Lương cao nhất: %,.0f VNĐ%n", max);
                        System.out.printf("Lương thấp nhất: %,.0f VNĐ%n", min);
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        System.out.printf("Tổng tiền thưởng nhân viên: %,.0f VNĐ%n", totalBonus);
                    }
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (true);

    }
}
