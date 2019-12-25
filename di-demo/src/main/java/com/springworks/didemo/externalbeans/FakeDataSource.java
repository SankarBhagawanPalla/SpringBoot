package com.springworks.didemo.externalbeans;

public class FakeDataSource {

    private String dburl;
    private String userName;
    private String password;

    public String getDburl() {
        return dburl;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "dburl='" + dburl + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
