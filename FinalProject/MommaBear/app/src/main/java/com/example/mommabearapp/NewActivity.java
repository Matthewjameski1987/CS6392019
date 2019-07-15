package com.example.mommabearapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }




    public void onClickChoresActivity (View view){
        Intent intent = new Intent (this, ChoresActivity.class);
        startActivity(intent);
    }

    public void onClickBillsActivity (View view){
        Intent intent = new Intent (this, BillsActivity.class);
        startActivity(intent);
    }

    public void onClickSendMessage(View view) {
        Intent intent = new Intent (Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + Uri.encode("17275432689")));
        intent.putExtra("sms_body", "New Daddy-Do Task!");
        startActivity(intent);
    }

    public void onClickWeb (View view){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://instacart.wegmans.com/"));
        startActivity(intent);
    }

    public void onClickCalendar (View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }


}
