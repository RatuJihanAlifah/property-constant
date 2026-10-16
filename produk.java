class Produk {
    String kode;
    String nama;
    double harga;
    int stok;

    final double PAJAK = 0.11;

    Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void tampilkanProduk() {
        System.out.println("Produk: " + nama);
        System.out.printf("Harga: Rp%,.0f%n", harga);
        System.out.println("Stok: " + stok);
        System.out.println("Pajak: 11%");
        System.out.printf("Total harga setelah pajak: Rp%,.0f%n",
                harga + (harga * PAJAK));
    }

    public static void main(String[] args) {
        Produk produk = new Produk("P001", "Laptop", 10000000, 5);
        produk.tampilkanProduk();
    }
}
