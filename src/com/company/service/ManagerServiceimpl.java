package com.company.service;

import com.company.dao.ManageDaoimp;
import com.company.dao.Managedao;
import com.company.dbutils.DBUtils;
import com.company.table.ManageSystem;

import java.sql.Connection;

public class ManagerServiceimpl implements ManageService{
    @Override
    public boolean Register(ManageSystem manageSystem, String power) {
        if(power == "��������Ա" && manageSystem.getPower() == "��������Ա")
            return false;
        else if(power == "����Ա" && manageSystem.getPower() != "�û�")
            return false;
        else if(power == "�û�")
            return false;
        else {
            Connection connection = null;
            connection = DBUtils.getConnection();
            ManageDaoimp manageDaoimp = new ManageDaoimp();
            manageDaoimp.Insert(manageSystem, connection);
            return true;
        }
    }

    @Override
    public void ShowAll(ManageSystem manageSystem) {

    }
}
