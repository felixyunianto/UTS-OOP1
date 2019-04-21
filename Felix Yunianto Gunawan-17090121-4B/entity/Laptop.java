package entity;

public class Laptop{
    public String id_Laptop;
    public String nama_Laptop;
    public String merk_Laptop;

    public boolean equals(Object obj) {
        Laptop ltp = (Laptop) obj;
        return id_Laptop.equals(ltp.getId_Laptop());
    }

    public String getId_Laptop() {
        return id_Laptop;
    }

    public void setId_Laptop(String id_Laptop) {
        this.id_Laptop = id_Laptop;
    }

    public String getNama_Laptop() {
        return nama_Laptop;
    }

    public void setNama_Laptop(String nama_Laptop) {
        this.nama_Laptop = nama_Laptop;
    }

    public String getMerk_Laptop() {
        return merk_Laptop;
    }

    public void setMerk_Laptop(String merk_Laptop) {
        this.merk_Laptop = merk_Laptop;
    }

    public Laptop(String id_Laptop, String nama_Laptop, String merk_Laptop) {
        this.id_Laptop = id_Laptop ;
        this.nama_Laptop     = nama_Laptop;
        this.merk_Laptop   = merk_Laptop;
    }
}