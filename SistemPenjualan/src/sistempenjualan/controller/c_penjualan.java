/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempenjualan.controller;

import java.sql.SQLException;
import sistempenjualan.desain.FrameUtama;
import sistempenjualan.desain.PanelKasir;
import sistempenjualan.desain.PanelKasir2;
import sistempenjualan.model.TransaksiPenjualan;

/**
 *
 * @author USER
 */
public class c_penjualan {

    PanelKasir views;
    TransaksiPenjualan models;

    public c_penjualan() throws SQLException {
        views = new PanelKasir();
        models = new TransaksiPenjualan();
        views.getTabelKasir().setModel(models.getTabel());
        views.setVisible(true);
    }
}
