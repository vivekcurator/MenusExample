package com.makapps.menusexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextMenuEx extends AppCompatActivity implements View.OnCreateContextMenuListener {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_ex);
        btn = findViewById(R.id.btn);
        registerForContextMenu(btn);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu1, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.title1: {
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.title2: {
                Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
            default:
                return super.onContextItemSelected(item);
        }

    }
}
