package com.pa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * ������mysql���ݿ����Ӵ���
 */
public class MySqlDr {
    private static final String url = "jdbc:mysql://192.168.1.222/mysql";/*jdbc:mysql://���ݿ�ɣ�/���ݿ���*/
    private static final String user = "root";//���ݿ��û���
    private static final String password = "123456";//��Ӧ���û�����

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet resultSet = null;

    public MySqlDr() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("���ݿ�����ʧ�ܣ�");
            e.printStackTrace();
        }

    }

    /* ִ��SQL���:��ѯ�����ؽ��, ���ǵ�������أ����ǲ��Ե�ʱ����Ǹ���������ѯ��Ȼ�󷵻�һ���������������Ƚϼ��ɣ����Ե��������*/
    public String getData(String sql, String targetName) {
        String result = null;
        try {

            pst = conn.prepareStatement(sql);
            resultSet = pst.executeQuery();
            while (resultSet.next()) {
                result = resultSet.getString(targetName);
            }
            this.close();
        } catch (Exception e) {
            System.out.println("ִ�в�ѯ���ʧ��");
            e.printStackTrace();
        }
        return result;
    }

    /* �ر����� */
    private void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (Exception e) {
            System.out.println("�ر����ݿ�����ʧ�ܣ�");
            e.printStackTrace();
        }
    }

}