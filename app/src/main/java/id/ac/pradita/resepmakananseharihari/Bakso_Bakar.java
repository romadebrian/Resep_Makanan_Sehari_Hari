package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bakso_Bakar extends AppCompatActivity {
    ImageButton BtnYoutube_Bakso_Bakar;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakso__bakar);

        nama = "https://www.youtube.com/watch?v=pI1e-jxemEY/" ;

        BtnYoutube_Bakso_Bakar = (ImageButton) findViewById(R.id.Youtube_Bakso_Bakar);


        BtnYoutube_Bakso_Bakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bakso_Bakar.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
