import java.util.Scanner;

interface bangundatar{
    void segitiga();
    void persegi();
    void lingkaran();
    void persegipanjang();
    void pembuka();
}

abstract class printout implements bangundatar{
    public void pembuka(){
        System.out.println("Input diterima!");
    }
}

class printoutbangun extends printout{
    public void segitiga(){
        System.out.println("Segitiga memiliki 3 sisi.");
    }
    public void persegi(){
        System.out.println("Persegi memiliki 4 sisi.");
    }
    public void lingkaran(){
        System.out.println("Lingkaran memiliki 1 sisi.");
    }
    public void persegipanjang(){
        System.out.println("Persegi panjang memiliki 4 sisi.");
    }
}

class programutama{
    public static void main (String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Masukkan Pilihan Bangun Datar");
        System.out.println("1. Segitiga || 2.Persegi || 3.Lingkaran || 4.Persegi Panjang");
        System.out.println("Jawaban anda:");
        int pilihan = myObj.nextInt();
        bangundatar a=new printoutbangun();
        a.pembuka();
        if(pilihan==1){
            a.segitiga();
        }else if(pilihan==2){
            a.persegi();
        }
        else if(pilihan==3){
            a.lingkaran();
        }
        else{
            a.persegipanjang();
        }
    }
}
