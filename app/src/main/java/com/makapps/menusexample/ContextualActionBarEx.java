package com.makapps.menusexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextualActionBarEx extends AppCompatActivity {

    private ActionMode mActionMode;
    public ActionMode.Callback mActionModeCallback =
            new ActionMode.Callback() {
                @Override
                public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                    MenuInflater inflater = mode.getMenuInflater();
                    inflater.inflate(R.menu.menu1, menu);
                    return true;

                }

                @Override
                public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                    return false;
                }

                @Override
                public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.title1: {
                            Toast.makeText(ContextualActionBarEx.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                            mode.finish(); // Action picked, so close the action bar.
                            return true;
                        }
                        case R.id.title2: {
                            Toast.makeText(ContextualActionBarEx.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                            mode.finish(); // Action picked, so close the action bar.
                            return true;
                        }
                        default:
                            return false;
                    }

                }

                @Override
                public void onDestroyActionMode(ActionMode mode) {
                    mActionMode = null;
                }
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_action_bar_ex);
        Button btn = findViewById(R.id.btn1);
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                if (mActionMode != null) return false;
                mActionMode =
                        ContextualActionBarEx.this.startActionMode(mActionModeCallback);
                view.setSelected(true);
                return true;
            }
        });


    }
}
