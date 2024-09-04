/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ADMIN
 */
public class ReadTextFile {
    public static void main(String[] args) {
         String fileName = "sanpham.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int productCount = 1;            
           while ((line = reader.readLine()) != null) {
                String[] productDetails = line.split(";");               
                // Xuất thông tin sản phẩm ra màn hình
                System.out.println("San pham " + productCount + ":");
                System.out.println("Ten : " + productDetails[0]);
                System.out.println("Gia: " + productDetails[1]);
                System.out.println("Mo ta: " + productDetails[2]);
                System.out.println();    
                productCount++;
            }
        } catch (IOException e) {
            System.out.println("Loi khong the doc file: " + e.getMessage());
        }
    }
}
