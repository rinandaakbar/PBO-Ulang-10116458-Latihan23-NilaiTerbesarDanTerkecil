/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int [] nilai = new int [20];
        int a;
        String nama;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa=====");
        Scanner ms = new Scanner (System.in);
        System.out.print("Masukkan Nama Petugas\t\t : ");
        nama = ms.nextLine();
        
        System.out.print("\nMasukkan Banyaknya Nilai Mahasiswa\t : ");
        n = ms.nextInt();
        for (a = 0; a < n; a++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (a+1)+"\t : ");
            nilai[a] = ms.nextInt();
        }
        
        System.out.println("\n"+"====Hasil Nilai Mahasiswa====");
        for (a=0; a < n; a++)   {
        
            System.out.println("Nilai Mahasiswa Ke-" + (a+1) + " : " + nilai[a]);
            
        }
        
        int min = nilai[1];
        int max = nilai[1];
        
        for (a=0; a < n; a++)  {
        
            if (nilai[a] > max){
               max = nilai[a];
            }else if (nilai[a] < min)  {
               min = nilai[a];
            }
        }
        System.out.println("\nNilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("\nPetugas\t: " + nama);
    }
    
}
