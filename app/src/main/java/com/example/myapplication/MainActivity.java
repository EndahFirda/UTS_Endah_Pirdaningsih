package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //persiapan variable objek yang ada pada xml
    EditText etNama, etTanggal;
    Button btRamal, btTanggal;
    String var_Tanggal,var_Nama;
    Calendar cld;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTanggal = findViewById(R.id.bt_tanggal);
        btRamal = findViewById(R.id.bt_ramal);
        etNama = (EditText) findViewById(R.id.et_nama);
        etTanggal = (EditText) findViewById(R.id.et_tanggal);


        btRamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(etTanggal.getText().toString().length()==0){
            etTanggal.setError("Tangal Tidak Boleh Kosong");
            }else{
            var_Tanggal = etTanggal.getText().toString();
            var_Nama = etNama.getText().toString();
                Intent a = new Intent (MainActivity.this, Result.class);
                Bundle b = new Bundle();
                b.putString("parse_tanggal", var_Tanggal);
                b.putString("parse_nama", var_Nama);
                a.putExtras(b);
                startActivity(a);
            }
            }
        });

        btTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cld = Calendar.getInstance();
                int day = cld.get(Calendar.DAY_OF_MONTH);
                int month = cld.get(Calendar.MONTH);
                int year = cld.get(Calendar.YEAR);

                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        etTanggal.setText(mDay + "/" +(mMonth+1) + "/" + mYear);
                    }
                },day,month,year);
                dpd.show();
            }
        });
    }
}