package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gurame_Saus_Tiram extends AppCompatActivity {
    ImageButton BtnYoutubeGurame_Saus_Tiram;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurame__saus__tiram);

        nama = "https://www.youtube.com/watch?v=zH5a68jzlaU/" ;

        BtnYoutubeGurame_Saus_Tiram = (ImageButton) findViewById(R.id.Youtube_Gurame_Saus_Tiram);


        BtnYoutubeGurame_Saus_Tiram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurame_Saus_Tiram.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
