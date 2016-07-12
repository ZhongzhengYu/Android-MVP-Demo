package com.usermvp.model;

import com.usermvp.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuZhongzheng on 2016/7/12.
 * <p/>
 * zhongzhengdev@gmail.com
 */
public class UserModel implements IUserModel {

    private String mUserName;
    private String mUserGender;
    private int mUserAge;

    private List<UserBean> users;

    public UserModel() {
        users = new ArrayList<>();
    }

    @Override
    public void setUserId(int userId) {
    }

    @Override
    public void setUserName(String userName) {
        this.mUserName = userName;
    }

    @Override
    public void setUserGender(String userGender) {
        this.mUserGender = userGender;
    }

    @Override
    public void setUserAge(int userAge) {
        this.mUserAge = userAge;
    }

    @Override
    public void saveUser() {
        UserBean user = new UserBean(mUserName, mUserGender, mUserAge);
        users.add(user);
    }

    @Override
    public List<UserBean> loadUser() {
        return users;
    }
}
