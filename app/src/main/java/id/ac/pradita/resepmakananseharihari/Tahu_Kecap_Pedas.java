package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Tahu_Kecap_Pedas extends AppCompatActivity {
    ImageButton BtnYoutube_Tahu_Kecap_Pedas ;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahu__kecap__pedas);

        nama = "https://www.youtube.com/watch?v=GhVJjRiJZ_M/" ;

        BtnYoutube_Tahu_Kecap_Pedas = (ImageButton) findViewById(R.id.Youtube_Tahu_Kecap_Pedas);


        BtnYoutube_Tahu_Kecap_Pedas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tahu_Kecap_Pedas.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
