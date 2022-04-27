package com.company;

import com.company.model.DanhBa;
import com.company.model.NhomDanhBa;
import com.company.service.danhba.DanhBaService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<DanhBa> danhBaList = new ArrayList<DanhBa>();

    public static void menu() {
        System.out.println("==============DANH SÁCH CHỨC NĂNG======================");
        System.out.println("1.Thêm số liên lạc ");
        System.out.println("2. Hiển thị danh bạ ");
        System.out.println("3. Sửa số danh bạ");
        System.out.println("4 Xóa danh bạ ");
        System.out.println("5 Tìm số ");
        System.out.println("6. Cập nhật ");
        System.out.println("Đọc từ file");
        System.out.println("Ghi vào file");
        System.out.println("8. Thoát ");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            DanhBa danhBa = new DanhBa(i + 1, "067393833", "Bố", "Nam", "10/2/1975", "biendz@gmail.com", "HN");
            Main.danhBaList.add(danhBa);
        }
        int function = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            menu();
            try {
                System.out.println("Chọn chức năng");
                function = scanner.nextInt();
                DanhBaService danhBaService = new DanhBaService();

                switch (function) {
                    case 1:
                        danhBaService.insert();
                        break;
                    case 2:
                        danhBaService.showDanhBa();
                        break;
                    case 3 :
                        danhBaService.update();
                }
            } catch (InputMismatchException e) {
                System.out.println("Bạn nhập sai giá trị , vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (function != 8);
        System.out.println("Exit");
    }
}
