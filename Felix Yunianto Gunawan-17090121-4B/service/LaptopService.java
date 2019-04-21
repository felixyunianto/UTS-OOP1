package service;

import java.util.*;
import entity.*;

public class LaptopService {

    private static List<Laptop> data = new LinkedList<Laptop>();

    public void tambahData(Laptop ltp) {
        data.add(ltp);
        System.out.println("Data sudah tersimpan");
    }

    public void ubahData(Laptop ltp) {
        int idx = data.indexOf(ltp);
        if(idx >= 0) data.set(idx, ltp);
        System.out.println("Data sudah berubah");
    }

    public void hapusData(String id_laptop) {
        int idx = data.indexOf(new Laptop(id_laptop, "", ""));
        if(idx >= 0) data.remove(idx);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData() {
        System.out.println("\n--= Data =--");
        int i = 1;
        for(Laptop ltp : data) {
            System.out.println("Data Ke-" + i++);
            System.out.println("  ID LAPTOP : " + ltp.getId_Laptop());
            System.out.println("  NAMA LAPTOP: " + ltp.getNama_Laptop());
            System.out.println("  MERK LAPTOP : " + ltp.getMerk_Laptop());
        }
    }

}