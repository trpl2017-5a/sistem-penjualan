package sistempenjualan.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altintop
 */
public class TransaksiPenjualan {

    private List<Produk> barang;
    private String tanggal;
    private String namaKasir;
    private String namaBarang;
    private String kodeBarang;
    private int qty;
    private int totalHarga;
    private String hasilQuery;

    DBConnector kon;

    public TransaksiPenjualan() throws SQLException {
        kon = new DBConnector();
    }

    public void Tambah(String namaKasir, String kodeBarang, String namaBarang, String jumlah, String tanggal, String totalHarga) {
          try {
            String query="INSERT INTO `penjualan-db`.`kasir` (`nama_kasir`, `kode_barang`, `nama_barang`, `jumlah`, `tanggal`, `total_harga`) "
                    + "VALUES ('" + namaKasir + "', '" + kodeBarang + "', '" + namaBarang + "', '" + jumlah + "', '" + tanggal + "', '" + totalHarga + "');";
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public DefaultTableModel getTabel() {
        String[] header = {"Nama Kasir", "Kode Barang", "Nama Barang", "Jumlah", "Tanggal", "Total Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from kasir";
            ResultSet rs = kon.getResult(query);
            System.out.println(query);

            while (rs.next()) {
                String[] kolom = new String[6];
                kolom[0] = rs.getString("nama_kasir");
                kolom[1] = rs.getString("kode_barang");
                kolom[2] = rs.getString("nama_barang");
                kolom[3] = rs.getString("jumlah");
                kolom[4] = rs.getString("tanggal");
                kolom[5] = rs.getString("total_harga");
                dtm.addRow(kolom);
                System.out.println(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }

//    public DefaultTableModel getTabel() {
//        String[] header = {"Id Transaksi", "Waktu Transaksi", "Kuantitas", "Tipe Transaksi", "Harga", "Nama Pembeli", "Nama Kasir", "Cabang"};
//        DefaultTableModel dtm = new DefaultTableModel(null, header);
//        try {
//            String query = "select * from transaksi";
//            ResultSet rs = kon.getResult(query);
//            System.out.println(query);
//
//            while (rs.next()) {
//                String[] kolom = new String[8];
//                kolom[0] = rs.getString("id_transaksi");
//                kolom[1] = rs.getString("waktu_transaksi");
//                kolom[2] = rs.getString("kuantitas");
//                kolom[3] = rs.getString("tipe_transaksi");
//                kolom[4] = rs.getString("harga");
//                kolom[5] = rs.getString("nama_pembeli");
//                kolom[6] = rs.getString("nama_kasir");
//                kolom[7] = rs.getString("cabang");
//                dtm.addRow(kolom);
//                System.out.println(query);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return dtm;
//    }
}
