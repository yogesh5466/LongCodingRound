package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText userid,username,address;
    Button insert,requestbut,accept;
    Owner users1;
    Users user2;
    PropertyDetails propertyDetails;
    Request request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users1 = new Owner();
        user2 = new Users();
        propertyDetails = new PropertyDetails();
        request = new Request();
        userid = findViewById(R.id.editTextuserid);
        username = findViewById(R.id.editTextusername);
        address = findViewById(R.id.address);
        insert = findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                users1.setUserId(userid.getText().toString());
                users1.setOwnerid(1);
                users1.setAddress(address.getText().toString());
                users1.setIsloggedin(true);
                users1.setUsername(username.getText().toString());
                users1.setNoofProp(3);
                users1.setNoofpropsold(2);
                user2.setUsername("yogesh");
                user2.setIsloggedin(true);
                user2.setAddress("123");
                user2.setUserId("2");
                propertyDetails.setHouseid(1);
                propertyDetails.setAreaName("coimbatore");
                propertyDetails.setBHKconfig(3);
                propertyDetails.setPropid(12);
                propertyDetails.setOwnerid(1);
                propertyDetails.setIsbought(false);

            }
        });
        requestbut = findViewById(R.id.request);
        accept = findViewById(R.id.accept);
        requestbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makerequest(user2,propertyDetails);
                Toast.makeText(MainActivity.this,"1000",Toast.LENGTH_SHORT).show();
            }
        });
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestaccept(request);
            }
        });
    }

    public void makerequest(Users user2,PropertyDetails propertyDetails){
        request.setAmountbid(1000);
        request.setUserid(user2.getUserId());
        request.setReqid(1);
        request.setPropid(propertyDetails.propid);
        request.setAccepted(false);
    }
    public void requestaccept(Request req){
        req.setAccepted(true);
        Toast.makeText(MainActivity.this,"Accepted",Toast.LENGTH_SHORT).show();
    }
}