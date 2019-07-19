package com.pa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GradeTest {
    @BeforeClass
    public String DescStart(){
        System.out.println("测试开始");
        return "测试开始";
    }
    @AfterClass
    public String DescEnd(){
        System.out.println("测试结束");
        return "测试结束";
    }
    @Test
    public void test1(){
        int firstpara=-10;
        Grade grd=new Grade();
        String result1=grd.grade(firstpara);
        Assert.assertEquals(grd.s0,result1);
    }
    @Test
    public void test2(){
        int firstpara=0;
        Grade grd=new Grade();
        String result2=grd.grade(firstpara);
        Assert.assertEquals(grd.s4,result2);
    }
    @Test
    public void test3(){
        int firstpara=59;
        Grade grd=new Grade();
        String result3=grd.grade(firstpara);
        Assert.assertEquals(grd.s4,result3);
    }
    @Test
    public void test4(){
        int firstpara=60;
        Grade grd=new Grade();
        String result4=grd.grade(firstpara);
        Assert.assertEquals(grd.s3,result4);
    }
    @Test
    public void test5(){
        int firstpara=79;
        Grade grd=new Grade();
        String result5=grd.grade(firstpara);
        Assert.assertEquals(grd.s3,result5);
    }
    @Test
    public void test6(){
        int firstpara=80;
        Grade grd=new Grade();
        String result6=grd.grade(firstpara);
        Assert.assertEquals(grd.s2,result6);
    }
    @Test
    public void test7(){
        int firstpara=89;
        Grade grd=new Grade();
        String result7=grd.grade(firstpara);
        Assert.assertEquals(grd.s2,result7);
    }
    @Test
    public void test8(){
        int firstpara=90;
        Grade grd=new Grade();
        String result8=grd.grade(firstpara);
        Assert.assertEquals(grd.s1,result8);
    }
    @Test
    public void test9(){
        int firstpara=100;
        Grade grd=new Grade();
        String result9=grd.grade(firstpara);
        Assert.assertEquals(grd.s1,result9);
    }
    @Test
    public void test10(){
        int firstpara=101;
        Grade grd=new Grade();
        String result10=grd.grade(firstpara);
        Assert.assertEquals(grd.s0,result10);
    }

}