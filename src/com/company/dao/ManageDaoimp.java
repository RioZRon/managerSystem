package com.company.dao;

import com.company.dbutils.DBUtils;
import com.company.table.ManageSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManageDaoimp implements Managedao{
    @Override
    public boolean Insert(ManageSystem manageSystem, Connection connection) {
        PreparedStatement preparedStatement= null;
        try{
            String sql = "insert into ManageSystem values (id_seq.nextval, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,manageSystem.getUsername());
            preparedStatement.setString(2,manageSystem.getPassword());
            preparedStatement.setString(3,manageSystem.getPower());
            preparedStatement.setString(4,manageSystem.getEmail());

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.
        }

    }

    @Override
    public void ShowAll(ManageSystem manageSystem) {

    }
}
