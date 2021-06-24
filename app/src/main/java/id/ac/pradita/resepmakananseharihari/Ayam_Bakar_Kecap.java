package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Ayam_Bakar_Kecap extends AppCompatActivity {
    ImageButton BtnYoutube_Ayam_Bakar_Kecap;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam__bakar__kecap);

        nama = "https://www.youtube.com/watch?v=INa6V2kG3iE/" ;

        BtnYoutube_Ayam_Bakar_Kecap = (ImageButton) findViewById(R.id.Youtube_Ayam_Bakar_Kecap);


        BtnYoutube_Ayam_Bakar_Kecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Ayam_Bakar_Kecap.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
