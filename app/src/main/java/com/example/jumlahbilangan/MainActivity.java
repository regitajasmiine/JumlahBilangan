package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

import com.example.jumlahbilangan.R;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText hasil;
    private Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        bil1 = (EditText) findViewById(R.id.edit_bil1);
        bil2 = (EditText) findViewById(R.id.edit_bil2);
        hasil = (EditText) findViewById(R.id.hasil);
        hitung = (Button) findViewById(R.id.hitung);
    }

    private void initEvent() {
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        hasil.setText(total+"");
    }
}