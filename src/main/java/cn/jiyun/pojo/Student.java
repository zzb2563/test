package cn.jiyun.pojo;

import java.util.Date;

public class Student {

    private String userName;
    private Integer id;
    private String address;
    private String hobby;
    private Integer age;
    private Date beginDate;
    private String sname;
    private String photo;
    private  String  uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
