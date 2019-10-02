package com.makapps.menusexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionsMenuEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu_ex);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.title1:{
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.title2:{
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.title3:{
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.title4:{
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.title5:{
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
