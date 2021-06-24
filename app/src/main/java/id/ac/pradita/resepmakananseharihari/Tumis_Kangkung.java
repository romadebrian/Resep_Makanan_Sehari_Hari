package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Tumis_Kangkung extends AppCompatActivity {
    ImageButton BtnYoutube_Tumis_Kangkung;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tumis__kangkung);

        nama = "https://www.youtube.com/watch?v=ZsfzzhA6Uxg/" ;

        BtnYoutube_Tumis_Kangkung = (ImageButton) findViewById(R.id.Youtube_Tumis_Kangkung);


        BtnYoutube_Tumis_Kangkung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tumis_Kangkung.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
