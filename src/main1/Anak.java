/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author MOKLET-2
 */
//Menggunakan keyword extends
public class Anak extends Main1 {
    
    //Menerapkan Overloading (dua buah method bisa dideklarasikan dengan -
    //nama yang sama, asal parameter yang digunakan berbeda)
    public void hitung(int a, int b){//Yang di dalam tanda kurung adalah parameter
        System.out.println("Operator Aritmatika Penjumlahan: "+(a+b));
    }
    //Menerapkan Overloading (dua buah method bisa dideklarasikan dengan -
    //nama yang sama, asal parameter yang digunakan berbeda)
    public void hitung(int a, int b, int c){//Yang di dalam tanda kurung adalah parameter
        System.out.println("Operator Aritmatika Pengurangan: "+(a-b-c));
    }
    //Menerapkan Overloading (dua buah method bisa dideklarasikan dengan -
    //nama yang sama, asal parameter yang digunakan berbeda)
    public void hitung(int a, int b, int c, int d){//Yang di dalam tanda kurung adalah parameter
        System.out.println("Operator Aritmatika Perkalian: "+(a*b*c*d));
    }
    //Menerapkan Overloading (dua buah method bisa dideklarasikan dengan -
    //nama yang sama, asal parameter yang digunakan berbeda)
    public void hitung(int a, int b, int c, int d, int e){//Yang di dalam tanda kurung adalah parameter
        System.out.println("Operator Aritmatika Pembagian: "+(a/b/c/d/e));
    }
    //Menerapkan Overloading (dua buah method bisa dideklarasikan dengan -
    //nama yang sama, asal parameter yang digunakan berbeda)
    public void hitung(int a, int b, int c, int d, int e, int f){//Yang di dalam tanda kurung adalah parameter
        System.out.println("Operator Aritmatika Modulus: "+(a%b%c%d%e%f));
    }
    
}
