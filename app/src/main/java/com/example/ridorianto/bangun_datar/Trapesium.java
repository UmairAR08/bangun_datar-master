package com.example.ridorianto.bangun_datar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Trapesium extends AppCompatActivity {

    EditText a, b ,t;
    Button b1;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        a = (EditText) findViewById(R.id.avar);
        b = (EditText) findViewById(R.id.bvar);
        t = (EditText) findViewById(R.id.tinggi);
        b1 = (Button) findViewById(R.id.button5);
        hasil = (TextView) findViewById(R.id.txt_hasil5);

        //aksi jika tombol button di klik
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toas
                if(a.length()== 0 && b.length()== 0 && t.length()==0){
                    Toast.makeText(getApplication(),"A , B Dan Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(a.length() == 0){
                    Toast.makeText(getApplication(), "A tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(b.length() == 0) {
                    Toast.makeText(getApplication(), "B tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if(t.length() == 0){
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    //Deklarasi variabel perhitungan
                    String isiA = a.getText().toString();
                    String isiB = b.getText().toString();
                    String isiT = t.getText().toString();
                    int a = Integer.parseInt(isiA);
                    int b = Integer.parseInt(isiB);
                    int t = Integer.parseInt(isiT);
                    int hs = trapesium (a,b,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public int trapesium(int a, int b,int t){
        return ((a+b)/2)*t;
    }
}

