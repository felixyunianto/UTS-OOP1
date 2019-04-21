import entity.*;
import service.*;
import java.util.*;

public class Aplikasi {

    private static Scanner scanner;
    private static LaptopService service = new LaptopService();

    public static void main(String[] args) {
        int opsi = 5;
        do {
            tampilkanMenu();
            scanner = new Scanner(System.in);
            opsi = scanner.nextInt();
            proses(opsi);
        }while(opsi !=5);
    }
    private static void proses(int  opsi){
        switch (opsi){
            case 1:
                tampilkanFromTambahData();
                break;
            case 2:
                tampilkanFromUbahData();
                break;
            case 3:
                HapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
            case 5 :
                System.out.println("BERHASIL KELUAR");
        }
    }

    private static void tampilkanFromUbahData(){
        scanner = new  Scanner(System.in);
        String id_laptop, nama_laptop, merk_laptop;

        System.out.println("\n--= Form Ubah Data");
        System.out.print ("ID LAPTOP : ");
        id_laptop = scanner.nextLine();
        System.out.print("NAMA LAPTOP : ");
        nama_laptop = scanner.nextLine();
        System.out.print("MERK LAPTOP : ");
        merk_laptop = scanner.nextLine();
        service.ubahData(new Laptop(id_laptop, nama_laptop, merk_laptop));
    }

    private static void tampilkanFromTambahData() {
        scanner = new  Scanner(System.in);
        String id_laptop, nama_laptop, merk_laptop;

        System.out.println("\n--= Form Tambah Data");
        System.out.print ("ID LAPTOP : ");
        id_laptop = scanner.nextLine();
        System.out.print("NAMA LAPTOP : ");
        nama_laptop = scanner.nextLine();
        System.out.print("MERK LAPTOP : ");
        merk_laptop = scanner.nextLine();
        service.tambahData(new Laptop(id_laptop, nama_laptop, merk_laptop));
    }

    private static void tampilkanMenu() {
        System.out.println("\n--= Menu Aplikasi =--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("--------------");
        System.out.print ("opsi > ");
    }
    private static void HapusData() {
    scanner = new Scanner(System.in);
        System.out.println("\n=--= Form Hapus Data =--=");
        System.out.print("ID LAPTOP : ");
        String id_laptop = scanner.nextLine();
        service.hapusData(id_laptop);
    }

}