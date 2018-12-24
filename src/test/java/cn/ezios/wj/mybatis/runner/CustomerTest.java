package cn.ezios.wj.mybatis.runner;

import cn.ezios.wj.mybatis.dao.CustomerDao;
import cn.ezios.wj.mybatis.model.CustomerModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @ClassName CustomerTest
 * @Description TODO
 * @Date 2018/12/24 21:34
 * @Creaded By Wangj
 */
public class CustomerTest {

    protected SqlSession session = null;
    @Before
    public void initConnection(){
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("数据源配置流获取失败！");
            return;
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        if(session != null){
            System.out.println("获取session成功！");
        }else {
            return;
        }
        this.session = session;
    }

    @Test
    public void testSelectOneById(){
        String id = "001";
        CustomerModel customerModel = getCustomerMapper().selectOneById(id);
        System.out.println(customerModel);
    }

    private CustomerDao getCustomerMapper() {
        return session.getMapper(CustomerDao.class);
    }

    @Test
    public void testInsertOne(){
        CustomerModel customerModel = new CustomerModel("003","zt","father");
        int i = getCustomerMapper().insertOne(customerModel);
        System.out.println("插入 ： " + i + "条数据！");
    }
}
