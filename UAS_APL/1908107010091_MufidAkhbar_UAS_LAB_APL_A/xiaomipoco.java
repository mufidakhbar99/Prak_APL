//membuat class xiaomipoco tetapi diimplement ke file mobilephone
public class xiaomipoco implements mobilephone {
    //memilih nilai int dan getdollar untuk mengambil nilai dari dollar
    @Override
    public int getdollar() {
        //mengembalikan nilai dollar dengan 200
        return 200;
    }
}