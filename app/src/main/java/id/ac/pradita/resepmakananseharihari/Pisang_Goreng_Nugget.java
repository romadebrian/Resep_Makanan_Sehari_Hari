package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pisang_Goreng_Nugget extends AppCompatActivity {
    ImageButton BtnYoutube_Pisang_Goreng_Nugget;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pisang__goreng__nugget);

        nama = "https://www.youtube.com/watch?v=JQ9V28ZZHGA/" ;

        BtnYoutube_Pisang_Goreng_Nugget = (ImageButton) findViewById(R.id.YtPisang_Goreng_Nugget);


        BtnYoutube_Pisang_Goreng_Nugget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pisang_Goreng_Nugget.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
