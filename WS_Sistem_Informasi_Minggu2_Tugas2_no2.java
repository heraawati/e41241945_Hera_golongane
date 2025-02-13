/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2p1_tugasno1;
import java.util.Scanner;
public class WS_Sistem_Informasi_Minggu2_Tugas2_no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int pilihan;
        
        System.out.println("\t CAFE CERIA ");
        System.out.println("\tANEKA MINUMAN ");
        System.out.println("----------------------------");
        System.out.println("\tSPECIAL MENU : ");
        System.out.println("      1. Soft drinks ");
        System.out.println("      2. Mix juice ");
        System.out.println("      3. Nescafe ");
        System.out.println("      4. Soda Milk ");
        System.out.println("      5. Tea ");
        
        //masukkan nama pembeli 
        System.out.print("Masukkan nama pembeli: ");
        nama = scanner.nextLine();
        //masukkan pilihan menu 
        System.out.print("\nSilahkan masukkan pilihan anda: ");
        pilihan = scanner.nextInt();
        
        System.out.print("Minuman yang anda pesan adalah: ");
        
        switch(pilihan){
            case 1 :
                System.out.println("Soft drinks");
                break;
            case 2 : 
                System.out.println("Mix juice");
                break;
            case 3 : 
                System.out.println("Nescafe");
                break;
            case 4 : 
                System.out.println("Soda Milk");
                break;
            case 5 :
                System.out.println("Tea");
                break;
            default:
                System.out.println("pilihan tidak ada di menu");
        }
        
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terimakasih" +nama+ "telah berkunjung di Cafe Ceria");
    }
    
}
