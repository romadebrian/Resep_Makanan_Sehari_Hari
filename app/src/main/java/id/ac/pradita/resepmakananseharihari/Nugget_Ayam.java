package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Nugget_Ayam extends AppCompatActivity {
    ImageButton BtnYoutube_Nugget_Ayam;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nugget__ayam);

        nama = "https://www.youtube.com/watch?v=5YH0d_w1UzI/" ;

        BtnYoutube_Nugget_Ayam = (ImageButton) findViewById(R.id.Youtube_Nugget_Ayam);


        BtnYoutube_Nugget_Ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Nugget_Ayam.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
