package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Telur_Crispy extends AppCompatActivity {
    ImageButton BtnYoutube_Telur_Crispy;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telur_crispy);

        nama = "https://www.youtube.com/watch?v=eXmyWzdHTzI/" ;

        BtnYoutube_Telur_Crispy = (ImageButton) findViewById(R.id.Youtube_Telur_Crispy);


        BtnYoutube_Telur_Crispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Telur_Crispy.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
