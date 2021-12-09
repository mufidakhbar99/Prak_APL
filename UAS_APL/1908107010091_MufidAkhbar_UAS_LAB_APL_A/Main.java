import java.util.Scanner;

//membuat infterface toko yang memiliki method jenisbrosur yang dikosongkan
interface toko {
    public void jenisbrosur();
}
//membuat class iphone yang dan membuat print untuk deskripsikan model MobilePhone didalam method jenisbrosur
class iphone implements toko {
    public void jenisbrosur() {
        System.out.println("Harga Iphone 13 adalah $1.000,-");
    }
}
//membuat class samsung yang dan membuat print untuk deskripsikan model MobilePhone didalam method jenisbrosur
class samsung implements toko {
    public void jenisbrosur() {
        System.out.println("Harga Samsung Note 9 adalah $700,-");
    }
}
//membuat class samsung yang dan membuat print untuk deskripsikan model MobilePhone didalam method jenisbrosur
class xiaomi implements toko {
    public void jenisbrosur() {
        System.out.println("Harga Xiaomi adalah $200,-");
    }
}
//membuat class brosur yang didalamnya memiliki variabel private toko 
class brosur {
    private toko toko;

    public void settoko(toko Jenis) {
        this.toko = Jenis;
    }

    public toko gettoko() {
        return toko;
    }

    public void jenisbrosur() {
        toko.jenisbrosur();
    }

}

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        ///membuat output pilihan untuk user
        System.out.println("");
        System.out.println("Selamat Datang Di toko Motomobi");
        System.out.println("Pilihan Type Mobile Phone Yang Tersedia Pada toko Kami :\n 1.Iphone \n 2.Samsung \n 3.Xiaomi \n ");
        System.out.println("(User Hanya Dapat Input Nomor)");
        scanner = new Scanner(System.in);
        String Typebrosur = scanner.next();
        System.out.println("Anda Menekan Nomor : " + Typebrosur);

        brosur brosur = null;
        brosur = new brosur();
        ///melakukan kondisi saat user memasukkan inputan 1 untuk memilih
        if ("1".equalsIgnoreCase(Typebrosur)) {
            brosur.settoko(new iphone());
        ///mengambil nilai adapter dari method iphone13 yang telah diubah oleh mobilephoneadapterImpl
             mobilephone iphone13 = new iphone13();
    	mobilephoneadapter iphone13Adapter = new mobilephoneadapterImpl(iphone13);
        System.out.println("Harga Mobilephone iphone13 Dalam Rupiah adalah Rp." + iphone13Adapter.getdollar() );
        ///melakukan kondisi saat user memasukkan inputan 2 untuk memilih
        } else if ("2".equalsIgnoreCase(Typebrosur)) {
            brosur.settoko(new samsung());
        ///mengambil nilai adapter dari method samsungnote yang telah diubah oleh mobilephoneadapterImpl    
            mobilephone samsungnote = new samsungnote();
    	mobilephoneadapter samsungnoteAdapter = new mobilephoneadapterImpl(samsungnote);
        System.out.println("Harga Mobilephone Samsung Note Dalam Rupiah adalah Rp." + samsungnoteAdapter.getdollar() );
        ///melakukan kondisi saat user memasukkan inputan 3 untuk memilih
        } else if ("3".equalsIgnoreCase(Typebrosur)) {
            brosur.settoko(new xiaomi());
        ///mengambil nilai adapter dari method xiaomipoco yang telah diubah oleh mobilephoneadapterImpl  
            mobilephone xiaomipoco = new xiaomipoco();
    	mobilephoneadapter xiaomipocoAdapter = new mobilephoneadapterImpl(xiaomipoco);
        System.out.println("Harga Mobilephone Xiaomi PocoPhone F1 Dalam Rupiah adalah Rp." + xiaomipocoAdapter.getdollar() );
        }
        
        brosur.jenisbrosur();

        

       

        
    }

    
    	
    
}