/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2p1_tugasno1;
import java.util.Scanner;
public class WS_Sistem_Informasi_Minggu2_Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nama;
        double harga1,harga2,harga3,harga4,harga5,totalHarga;
        
        System.out.println("-----------------------------------------------");
        System.out.println("\t Kharisma Agung Plaza < KAP >");
        System.out.println("\t   Promo Belanja Berhadiah");
        System.out.println("\t Khusus Pembelian 5 Barang Pertama");
        System.out.println("\t Dengan harga minimum Rp 10000,00");
        System.out.println("-----------------------------------------------");
        
        System.out.print("masukkan nama pembeli : ");
        nama = scanner.nextLine();
 
        System.out.print("\nmasukkan harga barang ke-1 \t: ");
        harga1 = scanner.nextDouble();
        System.out.print("masukkan harga barang ke-2 \t: ");
        harga2 = scanner.nextDouble();
        System.out.print("masukkan harga barang ke-3 \t: ");
        harga3 = scanner.nextDouble();
        System.out.print("masukkan harga barang ke-4 \t: ");
        harga4 = scanner.nextDouble();
        System.out.print("masukkan harga barang ke-5 \t: ");
        harga5 = scanner.nextDouble();
        totalHarga = harga1+harga2+harga3+harga4+harga5;
        
        System.out.print("Total Harga Pembelian atas nama " + nama + " adalah Rp " +totalHarga);
        
        if (totalHarga >=10000){
            System.out.print("\n\n selamat ..... \n Anda mendapat hadiah 1 buah mug cantik");
        }else{
            
        }
        System.out.println("\n----------------------------------------------");
        System.out.println("\t\t Terimakasih ");
        System.out.println(" \tAnda sudah belanja di Kharisma Agung Plaza ");
    }
}
