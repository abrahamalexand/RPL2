package aplikasiabsen;
import springHibernate.model.listkaryawan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplikasiabsen {
    public static void main(String[] args) {
        List<listkaryawan> daftarKaryawan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Tambah Data Karyawan (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("ID: ");
            String id = input.nextLine();
            
            System.out.print("Bidang: ");
            String bidang = input.nextLine();
            input.nextLine();
            
            listkaryawan karyawan = new listkaryawan(nama, id, bidang);
            daftarKaryawan.add(karyawan);
        }
        System.out.println("Daftar Karyawan:");
        for (listkaryawan karyawan : daftarKaryawan) {
            System.out.println(karyawan);
        }
    }
    
}
