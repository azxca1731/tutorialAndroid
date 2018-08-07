package com.example.azxca.pr01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1.DataForm 정의
    //2.item 정의
    //3.어댑터 바꾸기
    //4.init하기

    //4-1. 디비에서 가져오기
    //4-2. restAPI
    //4-3. 소켓

    RecyclerView rcv;
    RcvAdapter rcvAdapter;
    ArrayList<DataForm> list= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        rcv = (RecyclerView) findViewById(R.id.main_rcv);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        rcvAdapter = new RcvAdapter(this, list);
        rcv.setAdapter(rcvAdapter);

    }

    private void init(){

        DataForm a=new DataForm("hello",1);
        list.add(a);

        a=new DataForm("myname",2);
        list.add(a);

        a=new DataForm("is",3);
        list.add(a);

        a=new DataForm("android",4);
        list.add(a);
    }
}
