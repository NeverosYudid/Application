package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toast toast;
    Button happy, sad,dont,sleppy,quit, feel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        happy = (Button) findViewById(R.id.botonhappy);
        sad = (Button) findViewById(R.id.botonsad);
        dont = (Button) findViewById(R.id.botondont);
        sleppy = (Button) findViewById(R.id.botonsleepy) ;
        quit = (Button) findViewById(R.id.botonquit) ;
        feel = (Button) findViewById(R.id.botonfeel);

        happy.setOnClickListener(this);
        sad.setOnClickListener(this);
        dont.setOnClickListener(this);
        sleppy.setOnClickListener(this);
        quit.setOnClickListener(this);
        feel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.botonhappy:
                Toast.makeText(getApplicationContext(), "Aver una sonrisita, el corazón alegre hermosea el rostro ", Toast.LENGTH_LONG).show();
                break;
            case R.id.botonsad:
                Toast.makeText(getApplicationContext(), "No este triste pues jeje, despues de la tormenta viene la calma", Toast.LENGTH_LONG).show();
                break;
            case R.id.botondont:
                Toast.makeText(getApplicationContext(), "Deja de ser flojo y ponte a lavar los trastes jej", Toast.LENGTH_LONG).show();
                break;
            case R.id.botonsleepy:
                Toast.makeText(getApplicationContext(), "No son ojeras son ideas acumuladas, pero ya no te duermas tardes, por favor!", Toast.LENGTH_LONG).show();
                break;
            case R.id.botonquit:
                Toast.makeText(getApplicationContext(), "Si con carrera cuesta, imaginate sin ella ", Toast.LENGTH_LONG).show();
                break;
            case R.id.botonfeel:
                Toast.makeText(getApplicationContext(), "Animo, animo, animo jeje", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}