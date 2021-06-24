package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Telur_Gulung extends AppCompatActivity {
    ImageButton BtnYoutube_Telur_Gulung;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telur__gulung);

        nama = "https://www.youtube.com/watch?v=ibxHV21Gkvw/" ;

        BtnYoutube_Telur_Gulung = (ImageButton) findViewById(R.id.Youtube_Telur_Gulung);


        BtnYoutube_Telur_Gulung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Telur_Gulung.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
