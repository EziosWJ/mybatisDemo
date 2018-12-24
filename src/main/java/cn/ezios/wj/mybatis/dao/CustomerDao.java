package cn.ezios.wj.mybatis.dao;

import cn.ezios.wj.mybatis.model.CustomerModel;

public interface CustomerDao extends BaseDao {

    public CustomerModel selectOneById(String id);

    public int insertOne(CustomerModel CustomerModel);
}
