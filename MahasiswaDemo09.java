import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        StackTugasMahasiswa09 stack = new StackTugasMahasiswa09(5);
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpukan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas yang sudah dikumpulkan");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine(); 
            switch (pilih) {
                case 1 :
                    System.out.print("Nama    : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM     : ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = scan.nextLine();
                    Mahasiswa09 mhs = new Mahasiswa09(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2 :
                    Mahasiswa09 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama + " : ");
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.printf("Nilai biner tugas: " +  biner);
                    }
                    break;
                case 3 :
                    Mahasiswa09 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4 :
                    System.out.println("Daftar semua tugas: ");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                case 0 :
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                case 5 :
                Mahasiswa09 pertama = stack.bottom();
                if (pertama != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh " + pertama.nama);
                }
                case 6 :
                System.out.print("Jumlah tugas yang sudah dikumpulkan: " + stack.tugasCount() + "\n");
                break;
            }
        } while (pilih != 0);

    }
}
