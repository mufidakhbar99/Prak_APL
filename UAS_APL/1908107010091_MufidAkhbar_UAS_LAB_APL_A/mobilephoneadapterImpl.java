//membuat class mobilephoneadapterImpl dan diimplement ke file mobilephoneadapter
public class mobilephoneadapterImpl implements mobilephoneadapter{
    
    private mobilephone rp;
    //membuat method mobilephone adapter implemen yang didalamnya terdapat variabel mobilephone rp)
    public mobilephoneadapterImpl(mobilephone rp)
    {
        //menginisiasikan rp
        this.rp = rp;
    }
    //overide pada getdollar
    @Override
    public int getdollar() {
        //membuat variabel int rupiah dan mengambil nilai dollar
        int rupiah = rp.getdollar();
        return convertdollartorupiah(rupiah);
    }

    //membuat method convertdollar ke rupiah dengan int (yang mana didalam nya mengambil variabel rupiah)
    private int convertdollartorupiah(int rupiah)
    {
        //mengembalikan nilai rupiah yang dikalikan dengan Rp. 14.000,-
        return rupiah*14000;
    }
}
