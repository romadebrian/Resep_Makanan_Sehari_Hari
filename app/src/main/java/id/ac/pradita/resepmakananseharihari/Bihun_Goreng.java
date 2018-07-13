package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bihun_Goreng extends AppCompatActivity {
    ImageButton BtnYoutube_Bihun_Goreng;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bihun__goreng);

        nama = "https://www.youtube.com/watch?v=wc2E7gHMpbA/" ;

        BtnYoutube_Bihun_Goreng = (ImageButton) findViewById(R.id.Youtube_Bihun_Goreng);


        BtnYoutube_Bihun_Goreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bihun_Goreng.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
