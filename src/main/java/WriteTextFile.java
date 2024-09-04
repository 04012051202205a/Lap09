/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pr = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin san pham  " + (i + 1) + ":");
            System.out.print("Nhap ten san pham : ");
            String name = sc.nextLine();
            System.out.print("Gia san pham : ");
            String price = sc.nextLine();
            System.out.print("Mo ta san pham: ");
            String description = sc.nextLine();          
            pr[i] = name + ";" + price + ";" + description;
        }
        sc.close();
        try (FileWriter writer = new FileWriter("sanpham.txt")) {
            for (String product : pr) {
                writer.write(product + System.lineSeparator());
            }
            System.out.println("Thong tin san pham duoc ghi vao 'sanpham.txt'.");
        } catch (IOException e) {
            System.out.println("Luu file khong thanh cong: " + e.getMessage());
        }
    }
}
