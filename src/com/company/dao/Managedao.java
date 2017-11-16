package com.company.dao;

import com.company.table.ManageSystem;

import java.sql.Connection;

public interface Managedao {
    /**
    * @Description: 向数据库添加角色, 参数是实体类以及权限
    * 如果是"超级管理员" 检查传入的power 可以是"管理员" 以及"用户"
    * 如果是"管理员"或"用户" 传入的power只能是"用户"
     * * @param:    manageSystem    是要添加的角色
     *              connection      传入连接
    **/
    public boolean Insert(ManageSystem manageSystem, Connection connection);
    /**
    * @Description: 显示数据库中所能看见自己以及所有权限小于自己的用户
    * @param:   manageSystem 是使用者本身,需要查看他的用户权限
    **/
    public void ShowAll(ManageSystem manageSystem);

}
