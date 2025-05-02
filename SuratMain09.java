import java.util.Scanner;

public class SuratMain09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        StackSurat09 stackSurat = new StackSurat09(10);
        int pilih;

        do {
            System.out.println();
            System.out.println("===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc09.nextInt();
            sc09.nextLine();

            switch (pilih) {
                case 1 :
                System.out.print("ID Surat          : ");
                String idSurat = sc09.nextLine();
                System.out.print("Nama Mahasiswa    : ");
                String namaMahasiswa = sc09.nextLine();
                System.out.print("Masukkan Kelas    : ");
                String kelas = sc09.nextLine();
                System.out.print("Jenis Izin (C/S/I): ");
                char jenisIzin = sc09.nextLine().charAt(0);
                System.out.print("Durasi Izin       : ");
                int durasi = sc09.nextInt();
                sc09.nextLine();  
                
                Surat09 surat = new Surat09(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                stackSurat.push(surat);
                    break;
                case 2 :
                Surat09 suratProses = stackSurat.pop();
                if (suratProses != null) {
                    System.out.println("Surat izin dari " + suratProses.namaMahasiswa + " telah diproses.");
                }
                    break;
                case 3 :
                Surat09 suratTerakhir = stackSurat.peek();
                if (suratTerakhir != null) {
                    System.out.println("Surat izin terakhir dari " + suratTerakhir.namaMahasiswa + " dengan ID: " + suratTerakhir.idSurat);
                }
                    break;
                case 4 :
                System.out.println("Nama mahasiswa: ");
                String namaCari = sc09.nextLine();
                stackSurat.cariSurat(namaCari);
                    break;
                case 0 :
                System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih != 0);
        sc09.close();
        }
    }

