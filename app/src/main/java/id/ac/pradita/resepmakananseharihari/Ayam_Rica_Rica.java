package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Ayam_Rica_Rica extends AppCompatActivity {
    ImageButton BtnYoutube_Ayam_Rica_Rica;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam__rica__rica);

        nama = "https://www.youtube.com/watch?v=b7pcR_PhY50/" ;

        BtnYoutube_Ayam_Rica_Rica = (ImageButton) findViewById(R.id.Youtube_Ayam_Rica_Rica);


        BtnYoutube_Ayam_Rica_Rica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ayam_Rica_Rica.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
