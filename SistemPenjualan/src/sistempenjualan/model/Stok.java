package sistempenjualan.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Stok {

    DBConnector kon;

    public Stok() throws SQLException {
        kon = new DBConnector();
    }

    public void Tambah(String idProduk, String nama, String hargaPokok, String hargaJual, String stok) {
        try {
            String query = "INSERT INTO `penjualan-db`.`produk` (`idProduk`, `namaProduk`, `hargaPokok`, `hargaJual`, `stok`) "
                    + "VALUES ('" + idProduk + "', '" + nama + "', '" + hargaPokok + "', '" + hargaJual + "', '" + stok + "');";
            kon.execute(query);
            System.out.println(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void Ubah(String idProduk, String nama, String hargaPokok, String hargaJual, String stok) {
        try {
            String query = "UPDATE `produk` SET `namaProduk` ='" + nama + "', `hargaPokok` = '" + hargaPokok + "', `hargaJual` = '" + hargaJual + "', `stok` = '" + stok + "' where `produk`.`idProduk` = '" + idProduk + "'";
            kon.execute(query);
            System.out.println(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void Hapus(String no) {
        try {
            String query = "DELETE FROM `produk` WHERE `produk`.`no` ='" + no + "'";
            kon.execute(query);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public DefaultTableModel getTabel() {
        String[] header = {"No", "ID Produk", "Nama", "Harga Pokok", "Harga Jual", "Stok"};
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        try {
            String query = "select * from produk";
            ResultSet rs = kon.getResult(query);
            System.out.println(query);

            while (rs.next()) {
                String[] kolom = new String[6];
                kolom[0] = rs.getString("no");
                kolom[1] = rs.getString("idProduk");
                kolom[2] = rs.getString("namaProduk");
                kolom[3] = rs.getString("hargaPokok");
                kolom[4] = rs.getString("hargaJual");
                kolom[5] = rs.getString("stok");
                dtm.addRow(kolom);
                System.out.println(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dtm;
    }

}
