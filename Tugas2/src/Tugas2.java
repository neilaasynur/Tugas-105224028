import java.util.Scanner;

//Neila Faaizah Asynur 105224028

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM ANALISIS NILAI MAHASISWA ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        // 1. Deklarasi Array
        int[] nilaiMahasiswa = new int[jumlah];

        // 2. Perulangan untuk Input Nilai
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int tempNilai = input.nextInt();

            // 3. Perbandingan (Validation)
            if (tempNilai < 0 || tempNilai > 100) {
                System.out.println("Nilai tidak valid! Masukkan antara 0-100.");
                i--; // Mengulang input untuk indeks yang sama
            } else {
                nilaiMahasiswa[i] = tempNilai;
            }
        }

        double rataRata = 0;
        int tertinggi = nilaiMahasiswa[0];
        int terendah = nilaiMahasiswa[0];

        for (int i = 0; i < jumlah; i++){
            rataRata += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > tertinggi) {
                tertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < terendah) {
                terendah = nilaiMahasiswa[i];
            }
        }
        rataRata /= jumlah;
        
        int lulus = 0;
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] >= 75) {
                lulus++;
            }
        }

        int diatasRataRata = 0;
        String[] hasil = new String [jumlah];
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] > rataRata) {
                hasil[i] = "Lulus";
                diatasRataRata++;
            } else {
                hasil[i] = "Tidak Lulus";
            }
        }
        
        System.out.println("\n--- HASIL ANALISIS ---");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i] + " (" + hasil[i] + ")");
        }
        System.out.println("------------------------------\nNilai Rata-rata: " + rataRata + "\nNilai Tertinggi: " + tertinggi + "\nNilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa di Atas Rata-rata: " + diatasRataRata + "\n==============================");

        input.close();
    }
}