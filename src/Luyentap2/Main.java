package Luyentap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0; // số học viên
        double sum = 0; // tổng điểm
        double max = 0; // điểm cao nhất
        double min = 10;  // điểm thấp nhất

        do {
            System.out.println("\n***************MENU NHẬP ĐIỂM***************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Nhập điểm (-1 để kết thúc): ");
                        double score = sc.nextDouble();
                        // kết thúc nhập điểm
                        if (score == -1) {
                            break;
                        }
                        if (score < 0 || score > 10) {
                            System.out.println("Điểm không hợp lệ! Nhập lại.");
                            continue;
                        }
                        // tính toán
                        count++;
                        sum += score;
                        if (score > max) {
                            max = score;
                        }
                        if (score < min) {
                            min = score;
                        }
                        //xếp loại
                        if (score < 5) {
                            System.out.println("Xếp loại: Yếu");
                        } else if (score < 7) {
                            System.out.println("Xếp loại: Trung Bình");
                        } else if (score < 8) {
                            System.out.println("Xếp loại: Khá");
                        } else if (score < 9) {
                            System.out.println("Xếp loại: Giỏi");
                        } else {
                            System.out.println("Xếp loại: Xuất sắc");
                        }
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu!");
                    } else {
                        double average = sum / count;
                        System.out.println("\n===== THỐNG KÊ =====");
                        System.out.println("Số học viên đã nhập: " + count);
                        System.out.println("Điểm trung bình: " + average);
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (true);

    }
}
