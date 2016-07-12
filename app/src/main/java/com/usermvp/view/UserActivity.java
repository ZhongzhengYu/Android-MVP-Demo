package com.usermvp.view;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.usermvp.R;
import com.usermvp.bean.UserBean;
import com.usermvp.presenter.UserPresenter;

import java.util.List;

public class UserActivity extends ActivitySupport implements IUserView, View.OnClickListener {

    private EditText et_userId, et_userName, et_userGender, et_userAge;
    private TextView tv_showData;
    private UserPresenter presenter;

    @Override
    void initView() {
        setContentView(R.layout.activity_user);
        et_userId = (EditText) findViewById(R.id.et_userId);
        et_userName = (EditText) findViewById(R.id.et_userName);
        et_userGender = (EditText) findViewById(R.id.et_userGender);
        et_userAge = (EditText) findViewById(R.id.et_userAge);
        tv_showData = (TextView) findViewById(R.id.tv_showData);
        Button btn_showData = (Button) findViewById(R.id.btn_showData);
        Button btn_saveData = (Button) findViewById(R.id.btn_saveData);
        assert btn_saveData != null;
        btn_saveData.setOnClickListener(this);
        assert btn_showData != null;
        btn_showData.setOnClickListener(this);

    }

    @Override
    void initData() {
        presenter = new UserPresenter(this);
    }

    @Override
    public String getUserName() {
        return et_userName.getText().toString();
    }

    @Override
    public String getUserGender() {
        return et_userGender.getText().toString();
    }

    @Override
    public int getUserAge() {
        return Integer.parseInt(et_userAge.getText().toString().trim());
    }

    @Override
    public int getUserId() {
        return Integer.parseInt(et_userId.getText().toString().trim());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_saveData:
                presenter.setModel();
                break;

            case R.id.btn_showData:
                List<UserBean> users = presenter.getUser();
                tv_showData.setText(users.toString());
                break;

            default:
                break;
        }
    }
}
