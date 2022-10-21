/**
* Program pertama saya
* Author : Nazwa Aulia
*/ 
public class Hello {
    public static void main(String[] args){
        // menampilkan tulisan Hello, Nazwa Aulia-312110044-TI.21.C2 di Layer
        system.out.println("Hello, Nazwa Aulia-312110044-TI.21.C2 di Layer");
    }

}
public class Person {
    String Nama;
    String JenisKelamin;
    Int Umur;
}
public class IdentitasPerson{
    public static void main(String[] args){
        // Membuat object
        Person identitas = Person ();

        /* memanggil atribut dan memberi nilai */
        identitas.Nama = "Anton";
        identitas.JenisKelamin = "Laki-laki";
        identitas.Umur ="21";
        system.out.println("Nama : " + identitas.Nama);
        system.out.println("Jenis Kelamin : " + identitas.JenisKelamin);
        system.out.println("Umur : " + identitas.Umur);

        identitas.Nama = "Riko";
        identitas.JenisKelamin = "Laki-laki";
        identitas.Umur ="20";
        system.out.println("Nama : " + identitas.Nama);
        system.out.println("Jenis Kelamin : " + identitas.JenisKelamin);
            system.out.println("Umur : " + identitas.Umur);
    }
}