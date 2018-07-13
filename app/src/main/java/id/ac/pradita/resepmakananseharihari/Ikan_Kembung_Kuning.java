package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ikan_Kembung_Kuning extends AppCompatActivity {
    ImageButton BtnYoutube_Ikan_Kembung_Kuning;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan__kembung__kuning);

        nama = "https://www.youtube.com/watch?v=Nd8m4fcJmag/" ;

        BtnYoutube_Ikan_Kembung_Kuning = (ImageButton) findViewById(R.id.Youtube_Ikan_Kembung_Kuning);


        BtnYoutube_Ikan_Kembung_Kuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ikan_Kembung_Kuning.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
