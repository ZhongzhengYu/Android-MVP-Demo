package com.usermvp.model;

import com.usermvp.bean.UserBean;

import java.util.List;

/**
 * Created by YuZhongzheng on 2016/7/12.
 * <p/>
 * zhongzhengdev@gmail.com
 */
public interface IUserModel {

    void setUserId(int userId);

    void setUserName(String userName);

    void setUserGender(String userGender);

    void setUserAge(int userAge);

    void saveUser();

    List<UserBean> loadUser();
}
