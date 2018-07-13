package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Soto_Ayam_Spesial extends AppCompatActivity {
    ImageButton BtnYoutube_Soto_Ayam_Spesial;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto_ayam_spesial);

        nama = "https://www.youtube.com/watch?v=K0JDxbDFuoU/" ;

        BtnYoutube_Soto_Ayam_Spesial = (ImageButton) findViewById(R.id.Youtube_Soto_Ayam_Spesial);


        BtnYoutube_Soto_Ayam_Spesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Soto_Ayam_Spesial.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
