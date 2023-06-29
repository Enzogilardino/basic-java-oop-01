// class dengan constructor 
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
//     Mahasiswa (){
//         System.out.println("ini adalah constructor");
//     }
// }    

// constructor dengan parameter
Mahasiswa(String InputNama, String InputNIM, String inputJurusan){
    nama = InputNama;
    NIM = InputNIM;
    jurusan = inputJurusan;

    System.out.println(nama);
    System.out.println(NIM);
    System.out.println(jurusan);
    }
}

public class main {
    public static void main(String[] args) throws Exception {
    
        Mahasiswa mahasiswa1 = new Mahasiswa("Enzo","202157201002","Sistem informasi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Yusuf","202157201035","Sistem informasi");
        
    }
    
}
