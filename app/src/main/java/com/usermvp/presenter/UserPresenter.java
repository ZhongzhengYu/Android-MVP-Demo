package com.usermvp.presenter;

import com.usermvp.bean.UserBean;
import com.usermvp.model.IUserModel;
import com.usermvp.model.UserModel;
import com.usermvp.view.IUserView;

import java.util.List;

/**
 * Created by YuZhongzheng on 2016/7/12.
 * <p/>
 * zhongzhengdev@gmail.com
 */
public class UserPresenter {

    IUserView mView;
    IUserModel mModel;

    public UserPresenter(IUserView mView) {
        this.mView = mView;
        mModel = new UserModel();
    }

    public void setModel() {
        mModel.setUserName(mView.getUserName());
        mModel.setUserGender(mView.getUserGender());
        mModel.setUserAge(mView.getUserAge());
        mModel.setUserId(mView.getUserId());
        mModel.saveUser();
    }

    public List<UserBean> getUser() {
        return mModel.loadUser();
    }
}
