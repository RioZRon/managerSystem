package com.company.service;

import com.company.table.ManageSystem;

//ʵ��ע�� ��ѯ �޸� ɾ��
public interface ManageService {
        /**
         * @Description: �����ݿ���ӽ�ɫ, ������ʵ�����Լ�Ȩ��
         * �����"��������Ա" ��鴫���power ������"����Ա" �Լ�"�û�"
         * �����"����Ա" �����powerֻ����"�û�"
         * һ��ʼ��ע��ҳ��Ĭ���ǹ���Ա״̬
         * @param:  manageSystem ��Ҫ��ӵĽ�ɫ
         *          power        �Ǵ�����û�Ȩ��
         **/
        public boolean Register (ManageSystem manageSystem, String  power);
        /**
         * @Description: ��ʾ���ݿ������ܿ����Լ��Լ�����Ȩ��С���Լ����û�
         * @param:   manageSystem ��ʹ���߱���,��Ҫ�鿴�����û�Ȩ��
         **/
        public void ShowAll(ManageSystem manageSystem);

    }

