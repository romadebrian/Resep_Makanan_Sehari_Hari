package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Ayam_Bakar_Madu extends AppCompatActivity {
    ImageButton BtnYoutubeAyam_Bakar_Madu ;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam__bakar__madu);

        nama = "https://www.youtube.com/watch?v=rn83V5g4dkQ/" ;

        BtnYoutubeAyam_Bakar_Madu = (ImageButton) findViewById(R.id.Youtube_Ayam_Bakar_Madu);

        BtnYoutubeAyam_Bakar_Madu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ayam_Bakar_Madu.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);
            }
        });
    }
}
