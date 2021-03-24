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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mendeklarasikan objek
        Anak object = new Anak();
        
        //Untuk menjalankan method 1 hitung (penjumlahan)
        object.hitung(12 , 5);
        //untuk menjalankan method 2 hitung (pengurangan)
        object.hitung(168 , 45 , 17);
        //untuk menjalankan method 3 hitung (perkalian)
        object.hitung(3 , 23 , 36 , 49 );
        //untuk menjalankan method hitung 4 (pembagian)
        object.hitung(600 , 2 , 3 , 4 , 5);
        //untuk menjalankan method hitung 5 (modulus)
        object.hitung(100 , 2 , 2 , 2 , 2 , 2);
    }
    //Konstruktor
    public Main1(){
        System.out.println("Jenis - Jenis Operator Aritmatika Bahasa Java");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Modulus");
        System.out.println("=============================================");
    }
    
}
