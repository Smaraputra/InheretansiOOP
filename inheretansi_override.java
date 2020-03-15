package override;

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
    public static void  main(String[] args) {
        Makhluk_hidup manusia_1=new Mamalia();
        Manusia manusia_2=new Manusia();
        System.out.println("Karena Aku Kelaparan Maka Tindakan Yang Harus Kulakukan Adalah");
        manusia_1.tindakan_lapar();
        manusia_2.tindakan_lapar();
    }
}