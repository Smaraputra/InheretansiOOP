package extend;

class Makhluk_hidup {
    public void tidur(){
    }
    public void makan(){
    }
    public void tindakan_lapar() {
        System.out.println("Mencari Makanan Terlebih Dahulu.");
        makan();
    }
    public void tindakan_mengantuk() {
        System.out.println("Mencari Tempat Tidur Terlebih Dahulu.");
        tidur();
    }
}
class Mamalia extends Makhluk_hidup {
    public void makan(){
    }
    public void menyusui(){
    }
    public void memberi_makan_anak() {
        System.out.println("Mempersiapkan Susu Terlebih Dahulu.");
        menyusui();
    }
    public void tindakan_lapar() {
        System.out.println("Mencari Makanan Yang Cocok Untukku (Mamalia) Terlebih Dahulu.");
        makan();
    }
}
class Manusia extends Mamalia {
    public void makan(){
    }
    public void tindakan_lapar() {
        System.out.println("Mencari Makanan Yang Cocok Untukku (Manusia) Terlebih Dahulu.");
        makan();
    }
    String nama_lengkap;
    public static void  main(String[] args) {
        Manusia manusia_1 = new Manusia();
        manusia_1.nama_lengkap = "A.A. Gde Agung Smaraputra";
        System.out.println("Namaku " + manusia_1.nama_lengkap + ". Karena Aku Mengantuk Maka" +
                " Tindakan Yang Harus Kulakukan Adalah");
        manusia_1.tindakan_mengantuk();
    }
}