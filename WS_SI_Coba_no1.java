/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2p1_tugasno1;

import java.util.Scanner;
public class WS_SI_Coba_no1 {

    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner scanner = new Scanner(System.in);
        //mengambil inout 
        System.out.println("input nilai: ");
        nilai = scanner.nextInt();
        
        //menghitung gradenya
        if (nilai>=90){
            grade = "A";
        }else if (nilai>=80){
            grade = "B+";
        }else if (nilai>=70){
            grade = "B";
        }else if (nilai>=60){
            grade = "C+";
        }else if (nilai>=50){
            grade = "C";
        }else if (nilai>=40){
            grade ="D";
        }else{
            grade = "E";
        }
        //mencetak hasilnya
        System.out.println("Grade: " + grade);
    }
    
}
