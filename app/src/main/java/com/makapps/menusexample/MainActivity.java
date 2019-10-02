package com.makapps.menusexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openOptionsMenu(View view) {
        startActivity(new Intent(this,OptionsMenuEx.class));
    }

    public void openContextMenu(View view) {
        startActivity(new Intent(this,ContextMenuEx.class));
    }

    public void openContextualAB(View view) {
        startActivity(new Intent(this,ContextualActionBarEx.class));
    }

    public void openPopUpMenu(View view) {
        startActivity(new Intent(this,PopupMenuEx.class));
    }
}
