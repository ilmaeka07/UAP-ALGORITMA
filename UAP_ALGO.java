/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uap_algo;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class UAP_ALGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nim, nama, jurusan, ulang;
        int tahun;
        do{
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukan NAMA : ");
        nama = input.nextLine();
        
        System.out.println();
        System.out.println("NIM = "+ nim);
        System.out.println("NAMA = "+ nama);

        String[] character = nim.split("\\.");
        tahun = Integer.parseInt(character[0]);
        System.out.println("Tahun Ajaran Masuk = " + "20" + tahun + " - 20" + (tahun + 1));

        jurusan = nim.substring(3,5);
        switch (jurusan) {
            case "52" -> System.out.println("Jurusan = S-1 Teknologi Informasi");
            case "51" -> System.out.println("Jurusan = S-1 Sistem Informasi");
            case "31" -> System.out.println("Jurusan = D-3 Sistem Informasi");
            default -> System.out.println("Jurusan Tidak Tersedia"); 
        }

        System.out.println("Jurusan = " + jurusan);
        System.out.println("No Urut Masuk = " + character[2].replaceFirst("^0+(?!$)", ""));
            
        System.out.print("Apakah Anda Ingin Memasukkan Data Lagi [Ya/Tidak] : ");
        ulang = input.nextLine();   
        } while (ulang.equals("Ya"));
        
        System.exit(0);
    }
    
}
