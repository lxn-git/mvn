package com.pa;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
public class MysqlTest {
    @Test
    public  void getAssertData() {
        MySqlDr mySqlDr = new MySqlDr();
        String result = mySqlDr.getData("select bill_nm FROM tbl_chacc_brand_grade_inf WHERE seq_id=0","bill_nm");//查询语句
        System.out.println(result);
        Assert.assertEquals(result,"优惠券");
    }
}