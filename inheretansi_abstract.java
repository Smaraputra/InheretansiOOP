package abstrak;

abstract class Makhluk_hidup {
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

class Mamalia extends Makhluk_hidup { }

class Manusia extends Mamalia {
    public void makan(){
    }
    public void tindakan_lapar() {
        System.out.println("Mencari Makanan Yang Cocok Untukku (Manusia) Terlebih Dahulu.");
        makan();
    }
    public static void  main(String[] args) {
        Mamalia a=new Mamalia();
        System.out.println("Karena Aku Kelaparan Maka Tindakan Yang Harus Kulakukan Adalah");
        a.tindakan_lapar();
    }
}