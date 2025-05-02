public class StackSurat09 {
    private Surat09[] stack;
    private int top = -1;
    private int size;

    public StackSurat09(int size) {
        this.size = size;
        stack = new Surat09[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat09 surat09) {
        if (!isFull()) {
            stack[++top] = surat09;
            System.out.println("Surat izin diterima.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat izin.");
        }
    }

    public Surat09 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }
    
    public Surat09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean suratDitemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat izin ditemukan." );
                System.out.println("ID: " + stack[i].idSurat + ", Nama: " + stack[i].namaMahasiswa + ", Kelas: " + stack[i].kelas + ", Jenis Izin: " + stack[i].jenisIzin + ", Durasi: " + stack[i].durasi + " hari");
                suratDitemukan = true;
                break;
            }
        }
        if (!suratDitemukan) {
            System.out.println("Surat izin tidak ditemukan untuk mahasiswa " + namaMahasiswa);
        }
    } 
}
