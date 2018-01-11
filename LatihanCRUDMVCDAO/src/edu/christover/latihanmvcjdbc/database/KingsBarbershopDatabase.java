/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.christover.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.christover.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.christover.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Christover Ramanda Moa-10116531-PBO12
 */
public class KingsBarbershopDatabase {
    private static Connection connection; 
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
     if (connection==null) {
         
         
         MysqlDataSource dataSource = new MysqlDataSource();
         dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
         dataSource.setUser("root");
         dataSource.setPassword("");
         connection = dataSource.getConnection();
     }
        return connection;
    
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao==null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}
