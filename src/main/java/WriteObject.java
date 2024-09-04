/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {
    public static void main(String[] args) {
        List<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("keo", 2000));
        sanPhams.add(new SanPham("duong", 4000));
        sanPhams.add(new SanPham("banh", 5000));
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sanpham.bin"))) {
            oos.writeObject(sanPhams);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

