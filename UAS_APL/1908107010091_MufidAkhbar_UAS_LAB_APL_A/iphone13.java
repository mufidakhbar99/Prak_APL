//membuat class iphone13 tetapi diimplement ke file mobilephone
public class iphone13 implements mobilephone {
    //ngeovride untuk nilai dari iphone 13
    @Override
    //memilih nilai int dan getdollar untuk mengambil nilai dari dollar
    public int getdollar() {
        //mengembalikan nilai dollar dengan 1000
        return 1000;
    }
}