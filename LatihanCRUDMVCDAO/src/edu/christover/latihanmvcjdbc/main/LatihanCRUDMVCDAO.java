/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.christover.latihanmvcjdbc.main;

import edu.christover.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.christover.latihanmvcjdbc.error.PelangganException;
import edu.christover.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Christover Ramanda Moa-10116531-PBO12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (Exception e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
}
        });
    }
    
}
