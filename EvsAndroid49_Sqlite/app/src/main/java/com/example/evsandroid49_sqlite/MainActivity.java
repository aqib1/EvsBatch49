package com.example.evsandroid49_sqlite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.room.Room;

import com.example.evsandroid49_sqlite.dbreader.AppDatabase;
import com.example.evsandroid49_sqlite.dbreader.DBManager;
import com.example.evsandroid49_sqlite.entities.User;
import com.example.evsandroid49_sqlite.models.UserModel;

public class MainActivity extends Activity {

    private EditText userName, password, confirmPassword, email, phoneNumber;
    private Button register;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        settingUpListeners();
        DBManager.getInstance().init(getApplicationContext());
        appDatabase = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "USER_DATABASE").build();
    }

    private void settingUpListeners() {
    register.setOnClickListener((v) -> {
        MainActivity thisActivity = MainActivity.this;
        String password = thisActivity.password.getText().toString();
        String confirmPassword = thisActivity.confirmPassword.getText().toString();
        if(password.equals(confirmPassword)) {
//            UserModel userModel = new UserModel();
//            userModel.setUserName(thisActivity.userName.getText().toString());
//            userModel.setPassword(password);
//            userModel.setEmail(thisActivity.email.getText().toString());
//            userModel.setContactNumber(thisActivity.phoneNumber.getText().toString());
//            DBManager.getInstance().insert(userModel);
            User user = new User();
            user.setId(23);
            user.setName(thisActivity.userName.getText().toString());
            user.setPassword(password);
            user.setEmail(thisActivity.email.getText().toString());
            user.setNumber(thisActivity.phoneNumber.getText().toString());
            appDatabase.userDao().insert(user);
            Toast.makeText(thisActivity, "User Registered successfully", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(thisActivity, "Confirm password is not same as password", Toast.LENGTH_SHORT).show();
        }
    });


    }

    private void initComponents() {
        userName = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        confirmPassword = findViewById(R.id.et_confirmPassword);
        email = findViewById(R.id.et_email);
        phoneNumber = findViewById(R.id.et_phone);
        register = findViewById(R.id.btn_register);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        DBManager.getInstance().destroy();
    }
}