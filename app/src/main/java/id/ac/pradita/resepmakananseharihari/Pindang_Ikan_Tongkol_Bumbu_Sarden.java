package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Pindang_Ikan_Tongkol_Bumbu_Sarden extends AppCompatActivity {
    ImageButton BtnYoutube_Pindang_Ikan_Tongkol_Bumbu_Sarden;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindang_ikan_tongkol_bumbu_sarden);

        nama = "https://www.youtube.com/watch?v=KZBZgK3mAUM/" ;

        BtnYoutube_Pindang_Ikan_Tongkol_Bumbu_Sarden = (ImageButton) findViewById(R.id.Youtube_Pindang_Ikan_Tongkol_Bumbu_Sarden);


        BtnYoutube_Pindang_Ikan_Tongkol_Bumbu_Sarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pindang_Ikan_Tongkol_Bumbu_Sarden.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
