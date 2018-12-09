package com.example.gilangdeva.menghitungvolumekubus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input_sisi;
    Button button,hitung_volume;
    TextView text_volume;
    String vol="Volume dari bangun kubus di atas yaitu ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_sisi=(EditText)findViewById(R.id.input_sisi);
        hitung_volume=(Button)findViewById(R.id.hitung_volume);
        text_volume=(TextView)findViewById(R.id.text_volume);

        hitung_volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sisi=Integer.parseInt(input_sisi.getText().toString());
                double volume = sisi * sisi * sisi;

                text_volume.setText(vol + String.valueOf(volume));
            }


        });
    }
}
