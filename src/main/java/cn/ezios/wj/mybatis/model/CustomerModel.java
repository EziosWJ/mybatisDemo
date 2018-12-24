package cn.ezios.wj.mybatis.model;

import java.io.Serializable;

/**
 * @ClassName CustomerModel
 * @Description TODO
 * @Date 2018/12/24 21:20
 * @Creaded By Wangj
 */
public class CustomerModel implements Serializable {

    private String id;
    private String name;
    private String wanted;

    public CustomerModel(String id, String name, String wanted) {
        this.id = id;
        this.name = name;
        this.wanted = wanted;
    }

    public CustomerModel() {
        super();
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", wanted='" + wanted + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWanted() {
        return wanted;
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;
    }
}
