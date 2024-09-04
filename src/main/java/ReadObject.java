import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sanpham.bin"))) {
            List<SanPham> sanphams = (List<SanPham>) ois.readObject();
            for (SanPham sp : sanphams) {
                System.out.println(sp);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


