package com.usermvp.bean;

/**
 * Created by YuZhongzheng on 2016/7/12.
 * <p/>
 * zhongzhengdev@gmail.com
 */
public class UserBean {

    private int Id;
    private String name;
    private String gender;
    private int age;

    public UserBean(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
