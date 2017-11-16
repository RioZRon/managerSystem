package com.company.service;

import com.company.table.ManageSystem;

//实现注册 查询 修改 删除
public interface ManageService {
        /**
         * @Description: 向数据库添加角色, 参数是实体类以及权限
         * 如果是"超级管理员" 检查传入的power 可以是"管理员" 以及"用户"
         * 如果是"管理员" 传入的power只能是"用户"
         * 一开始的注册页面默认是管理员状态
         * @param:  manageSystem 是要添加的角色
         *          power        是传入的用户权限
         **/
        public boolean Register (ManageSystem manageSystem, String  power);
        /**
         * @Description: 显示数据库中所能看见自己以及所有权限小于自己的用户
         * @param:   manageSystem 是使用者本身,需要查看他的用户权限
         **/
        public void ShowAll(ManageSystem manageSystem);

    }

