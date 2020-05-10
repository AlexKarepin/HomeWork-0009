package com.karepin.homework_009;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // добавляем меню
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:

                return true;
            case R.id.action_open_notes:
                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
                Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_tasks:
                Intent intentTask = new Intent(MainActivity.this, TaskActivity.class);
                startActivity(intentTask);
                Toast.makeText(MainActivity.this, "Отркыть учет задач", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_address:
                Intent intentAddress = new Intent(MainActivity.this, AddressActivity.class);
                startActivity(intentAddress);
                Toast.makeText(MainActivity.this, "Отркыть форму выбора адреса", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_pay:
                Intent intentPay = new Intent(MainActivity.this, PayActivity.class);
                startActivity(intentPay);
                Toast.makeText(MainActivity.this, "Отркыть форму оплаты", Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

