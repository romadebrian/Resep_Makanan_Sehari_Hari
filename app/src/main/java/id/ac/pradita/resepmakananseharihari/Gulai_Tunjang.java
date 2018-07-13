package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Gulai_Tunjang extends AppCompatActivity {
    ImageButton BtnYoutube_Gulai_Tunjang;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulai__tunjang);

        nama = "https://www.youtube.com/watch?v=TigHEtGDFxk" ;

        BtnYoutube_Gulai_Tunjang = (ImageButton) findViewById(R.id.Youtube_Gulai_Tunjang);


        BtnYoutube_Gulai_Tunjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gulai_Tunjang.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
