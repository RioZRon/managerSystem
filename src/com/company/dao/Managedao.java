package com.company.dao;

import com.company.table.ManageSystem;

import java.sql.Connection;

public interface Managedao {
    /**
    * @Description: �����ݿ���ӽ�ɫ, ������ʵ�����Լ�Ȩ��
    * �����"��������Ա" ��鴫���power ������"����Ա" �Լ�"�û�"
    * �����"����Ա"��"�û�" �����powerֻ����"�û�"
     * * @param:    manageSystem    ��Ҫ��ӵĽ�ɫ
     *              connection      ��������
    **/
    public boolean Insert(ManageSystem manageSystem, Connection connection);
    /**
    * @Description: ��ʾ���ݿ������ܿ����Լ��Լ�����Ȩ��С���Լ����û�
    * @param:   manageSystem ��ʹ���߱���,��Ҫ�鿴�����û�Ȩ��
    **/
    public void ShowAll(ManageSystem manageSystem);

}
