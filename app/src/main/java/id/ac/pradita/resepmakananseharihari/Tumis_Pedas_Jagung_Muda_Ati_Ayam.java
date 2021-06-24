package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Tumis_Pedas_Jagung_Muda_Ati_Ayam extends AppCompatActivity {
    ImageButton BtnYoutube_Tumis_Pedas_Jagung_Muda_Ati_Ayam;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tumis__pedas__jagung__muda__ati__ayam);

        nama = "https://www.youtube.com/watch?v=R0UEVIWjc40&vl=id/" ;

        BtnYoutube_Tumis_Pedas_Jagung_Muda_Ati_Ayam = (ImageButton) findViewById(R.id.Youtube_Tumis_Pedas_Jagung_Muda_Ati_Ayam);


        BtnYoutube_Tumis_Pedas_Jagung_Muda_Ati_Ayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tumis_Pedas_Jagung_Muda_Ati_Ayam.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
