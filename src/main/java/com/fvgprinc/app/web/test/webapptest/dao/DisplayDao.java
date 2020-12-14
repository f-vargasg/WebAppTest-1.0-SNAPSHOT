/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.test.webapptest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author garfi
 */
public class DisplayDao {

    public static ResultSet Report() throws SQLException {
        ResultSet rs = null;
        String sql;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection  conn =  DriverManager.getConnection("jdbc:mariadb://10.25.1.86:3306/TESTDB", "admin", "valerie5250");
            sql = "select a.nombre, a.apellido, a.correo\n"
                    + "from usuario a\n"
                    + "order by id desc;";
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

}
