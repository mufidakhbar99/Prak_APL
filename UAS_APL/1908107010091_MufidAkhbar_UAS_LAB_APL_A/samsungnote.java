//membuat class samsungnote tetapi diimplement ke file mobilephone
public class samsungnote implements mobilephone {
    //memilih nilai int dan getdollar untuk mengambil nilai dari dollar
    @Override
    public int getdollar() {
        //mengembalikan nilai dollar dengan 700
        return 700;
    }
}