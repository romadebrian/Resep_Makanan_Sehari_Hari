package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Nasi_Goreng extends AppCompatActivity {
    ImageButton BtnYoutube_Nasi_Goreng;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi__goreng);

        nama = "https://www.youtube.com/watch?v=dWvPcmpINYY/" ;

        BtnYoutube_Nasi_Goreng = (ImageButton) findViewById(R.id.Youtube_Nasi_Goreng);


        BtnYoutube_Nasi_Goreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Nasi_Goreng.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
