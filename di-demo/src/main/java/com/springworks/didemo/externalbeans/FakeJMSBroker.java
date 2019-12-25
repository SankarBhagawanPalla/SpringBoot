package com.springworks.didemo.externalbeans;

public class FakeJMSBroker {

    private String username;
    private String password;
    private String jmsurl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJmsurl() {
        return jmsurl;
    }

    public void setJmsurl(String jmsurl) {
        this.jmsurl = jmsurl;
    }

    @Override
    public String toString() {
        return "FakeJMSBroker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jmsurl='" + jmsurl + '\'' +
                '}';
    }
}
