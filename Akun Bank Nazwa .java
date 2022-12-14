import java.util.Scanner;public class AkunBank {
    // DEKLARASI ATTRIBUTE CLASS
    static Scanner get = new Scanner(System.in);
    String customerName, bank;
    int customerID, saldo;

    // MEMBUAT INSTANCE METHOD
    public void cekSaldo() {
        System.out.println("Selamat Datang " + this.customerName + " di " + this.bank);
        System.out.println("Saldo Terakhir Anda : Rp." + this.saldo);
    }
    public int simpanUang() {
        System.out.println("Selamat Datang di " + this.bank);
        System.out.print("Masukan jumlah uang yang akan disimpan : Rp.");
        int simpan = get.nextInt();

        this.saldo += simpan;
        System.out.println("=======================================================\n");
        System.out.println("BERHASIL! Saldo terakhir anda : RP." + this.saldo);
        return this.saldo;
    }
    public int ambilUang() {
        System.out.println("Selamat Datang di " + this.bank);
        System.out.print("Masukan jumlah uang yang akan diambil : Rp.");
        int ambil = get.nextInt();

        if (this.saldo > ambil) {
            this.saldo -= ambil;
            System.out.println("=======================================================\n");
            System.out.println("BERHASIL! Saldo terakhir anda : RP." + this.saldo);
        } else {
            System.out.println("=======================================================\n");
            System.out.println("MOHON MAAF SALDO ANDA TIDAK CUKUP!");
        }
        
        return this.saldo;
    }
    public void menu () {
        System.out.println("\tSELAMAT DATANG " + this.customerName + " DI " + this.bank);
        System.out.println("1. CEK SALDO \n2. AMBIL UANG\n3. SIMPAN UANG\n4. EXIT");
        System.out.print("Masukan pilihan anda : ");
        int choice = get.nextInt();
        System.out.println("=======================================================\n");

        switch(choice) {
            case 1 :
                cekSaldo();
                System.out.println("=======================================================\n");
                menu();
                break;
            case 2 :
                ambilUang();
                System.out.println("=======================================================\n");
                menu();
                break;
            case 3 :
                simpanUang();
                System.out.println("=======================================================\n");
                menu();
                break;
            case 4 :
                System.out.println("TERIMAKASIH..");
                System.out.println("=======================================================\n");
                break;
            default:
                System.out.println("ANDA MEMASUKAN INPUT YANG SALAH!!\n");
        }

    }

    public static void main(String[] args) {
        // INSTANSIASI OBJECT
        AkunBank customer1 = new AkunBank();
        customer1.customerName = "NAZWA AULIA";
        customer1.customerID = 312110044;
        customer1.bank = "BANK BNI";
        customer1.saldo = 190101;

        // MENGAKSES INSTANCE METHOD
        customer1.menu();
    }
}