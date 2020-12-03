package com.example.prova2chris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.imn1)
        {
            Toast.makeText(
                    getApplicationContext(),
                    "Clicou em Ajuda",
                    Toast.LENGTH_LONG).show();
            return true;
        }
        if(id == R.id.imn2)
        {
            Toast.makeText(
                    getApplicationContext(),
                    "Sair da Aplicação",
                    Toast.LENGTH_LONG).show();
            finish();
            System.exit(0);
        }


        return super.onOptionsItemSelected(item);
    }
}