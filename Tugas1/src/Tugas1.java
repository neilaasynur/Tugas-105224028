import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        String nama, nim;
        int usia;
        double tinggiBadan;
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print ("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print ("Masukkan umur:  ");
        usia = input.nextInt();
        System.out.print ("Masukkan tinggi badan: ");
        tinggiBadan = input.nextInt();

        input.close();
        System.out.println ("========== DATA DIRI ==========\nNama\t: " + nama + "\nNIM\t: " + nim + "\nUsia\t: " + usia + " tahun\nTinggi badan: " + tinggiBadan + " cm\n==============================");
        int hasil = (usia * 2)+ 10 / 5 - 3;
        System.out.println ("Hasil dari operasi aritmatika usia adalah: " + hasil);

        if (usia > 18 ){
            System.out.println ("Usia > 18 tahun: " + (usia > 18));
        } else {
            System.out.println ("Usia tidak lebih dari 18 tahun: " + (usia > 18));
        }
        if (usia > 18 && tinggiBadan > 160) {
            System.out.println("Usia > 18 dan tinggi badan > 160: " + (usia > 18 && tinggiBadan > 160));
        } else {
            System.out.println("Usia > 18 dan tinggi badan > 160: " + (usia > 18 && tinggiBadan > 160));
        }

        System.out.println("Konversi Umur secara casting " + (double) usia + " dan casting tipe data tinggi badan " + (int) tinggiBadan);
    }
}
