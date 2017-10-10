package sistempenjualan.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author altintop
 */
public class DBConnector {

    Connection koneksi;
    Statement queryStatement;

    public DBConnector() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/penjualan-db";
        String username = "root";
        String password = "";

        this.koneksi = DriverManager.getConnection(url, username, password);
        this.queryStatement = this.koneksi.createStatement();
    }

    public void executeQuery(String perintahQuery) throws SQLException {
        this.queryStatement.execute(perintahQuery);
    }

    public ResultSet getResult(String perintahQuery) throws SQLException {
        return queryStatement.executeQuery(perintahQuery);
    }

    public void execute(String sql) throws SQLException {
        this.queryStatement.executeUpdate(sql);
    }

}
