package com.example.menuproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSendMessage(View view) {
        Intent intent = new Intent (Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:" + Uri.encode("17275432689")));
        intent.putExtra("sms_body", "Matthew King");
        startActivity(intent);
    }

    public void onClickCall (View view){
        Intent intent = new Intent (Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:7275432689"));
        startActivity(intent);
    }

    public void onClickWeb (View view){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://google.com"));
        startActivity(intent);
    }

    public void onClickMap (View view){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo: 27.9529, -82.8033"));
        startActivity(intent);
    }

    public void onClickChooser (View view){
        Intent intent = new Intent (Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "CS639");
        intent.putExtra(Intent.EXTRA_TEXT, "Join CS639");
        startActivity(Intent.createChooser(intent, "Share the love"));
    }

    public void onClickNewActivity (View view){
        Intent intent = new Intent (this, NewActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_help) {
            Intent intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

}
