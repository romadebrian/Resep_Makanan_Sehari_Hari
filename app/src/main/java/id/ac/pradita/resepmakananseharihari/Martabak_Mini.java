package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Martabak_Mini extends AppCompatActivity {
    ImageButton BtnYoutube_Martabak_Mini;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martabak__mini);

        nama = "https://www.youtube.com/watch?v=e5dmA69jz4M/" ;

        BtnYoutube_Martabak_Mini = (ImageButton) findViewById(R.id.Youtube_Martabak_Mini);


        BtnYoutube_Martabak_Mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Martabak_Mini.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
