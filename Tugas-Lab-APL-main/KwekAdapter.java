class BebekAdapter implements Kucing {
    Bebek kucing;

    public BebekAdapter(Bebek kucing) {
        this.kucing = kucing;
    }

    public void meow() {
        kucing.kwek();
    }
}