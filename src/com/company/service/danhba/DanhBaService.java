package com.company.service.danhba;

import com.company.Main;
import com.company.model.DanhBa;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DanhBaService {
    public void insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh Bạ");
        try {
            System.out.println("Nhập id");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập số điện thoại");
            String NumberP = scanner.nextLine();
            System.out.println("Nhập tên");
            String name = scanner.nextLine();
            System.out.println("Nhập giới tính");
            String sex = scanner.nextLine();
            System.out.println("Ngày sinh");
            String date = scanner.nextLine();
            System.out.println("Nhập địa chỉ ");
            String address = scanner.nextLine();
            System.out.println("Nhập email");
            String email = scanner.nextLine();
            DanhBa danhBa = new DanhBa(id, NumberP, name, sex, date, address, email);
            Main.danhBaList.add(danhBa);

        } catch (
                InputMismatchException e) {
            System.out.println("Bạn nhâp sai vị trí , vui lòng thử lại");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showDanhBa() {
        System.out.println("DANH BẠ");
        String header = String.format("%5s%18s%18s%18s%17s%17s%23s", "ID", "số đt", "Tên", "Sex", "Date", "address", "email");
        System.out.println(header);
        for (DanhBa danhba : Main.danhBaList) {
            String row = String.format("%5s%18s%18s%18s%17s%17s%23s", danhba.getId(), danhba.getNumberPhone(), danhba.getName(), danhba.getSex(), danhba.getDate(), danhba.getAddress(), danhba.getEmail());
            System.out.println(row);

        }
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập mã :  ");
            Integer id = scanner.nextInt();
            DanhBa danhBa = null;
            for (DanhBa db : Main.danhBaList) {
                if (db.getId().equals(id)) {
                    danhBa = db;
                    break;
                }
            }
            if (danhBa == null) {
                System.out.println("Mã không tồn tại ! Nhập lại ");
            }
            System.out.println("DANH BẠ");
            assert danhBa != null;
            String row = String.format("%5s%18s%18s%18s%17s%17s%23s", danhBa.getId(), danhBa.getNumberPhone(), danhBa.getName(), danhBa.getSex(), danhBa.getDate(), danhBa.getAddress(), danhBa.getEmail());
            System.out.println(row);
            for (int i = 0; i < Main.danhBaList.size(); i++) {
                if (id.equals(Main.danhBaList.get(i).getId())) {
                    scanner.nextLine();
                    System.out.println("số điện thoại");
                    String number = scanner.nextLine();
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String sex = scanner.nextLine();
                    System.out.println("Nhập ngày sinh");
                    String date = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = scanner.nextLine();
                    System.out.println("Nhập email");
                    String email = scanner.nextLine();

                    Main.danhBaList.get(i).setNumberPhone(number);
                    Main.danhBaList.get(i).setName(name);
                    Main.danhBaList.get(i).setSex(sex);
                    Main.danhBaList.get(i).setDate(date);
                    Main.danhBaList.get(i).setAddress(address);
                    Main.danhBaList.get(i).setEmail(email);

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Bạn nhâp sai vị trí , vui lòng thử lại");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    public DanhBa getById(Integer id) {
//        DanhBa danhBa = new DanhBa();
//
//        for (DanhBa danhBa1 : Main.danhBaList) {
//            if (danhBa1.getId().equals(id)) {
//                danhBa = danhBa1;
//                break;
//            }
//        }
//        return danhBa;
//    }
}