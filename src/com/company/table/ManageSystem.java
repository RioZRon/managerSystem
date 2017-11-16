package com.company.table;

public class ManageSystem {
    private int id;
    private String username;
    private String password;
    private String power;
    private String email;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPower() {
        return power;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "id:" + id + "\n" + "用户名:" + username + "\n" + "密码:" + password + "\n" + "权限:" + power + "\n" + "邮箱" + email;
    }
}
