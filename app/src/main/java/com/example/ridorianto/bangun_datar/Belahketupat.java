package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Belahketupat extends AppCompatActivity {

    EditText d1, d2;
    Button b;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belahketupat);

        d1 = (EditText) findViewById(R.id.diagonal1);
        d2 = (EditText) findViewById(R.id.diagonal2);
        b = (Button) findViewById(R.id.button4);
        hasil = (TextView) findViewById(R.id.txt_hasil4);

        //aksi jika tombol button di klik
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(d1.length()== 0 && d2.length()== 0){
                    Toast.makeText(getApplication(),"Diagonal 1 dan Diagonal 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(d1.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal 1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(d2.length() == 0){
                    Toast.makeText(getApplication(), "Diagonal 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiDiagonal1 = d1.getText().toString();
                    String isiDiagonal2 = d2.getText().toString();
                    int d1 = Integer.parseInt(isiDiagonal1);
                    int d2 = Integer.parseInt(isiDiagonal2);
                    int hs = belahketupat (d1,d2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public int belahketupat(int d1, int d2){
        return d1*d2/2;
    }
}
