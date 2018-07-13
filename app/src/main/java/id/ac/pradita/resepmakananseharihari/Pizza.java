package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Pizza extends AppCompatActivity {
    ImageButton BtnYoutube_Pizza;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        nama = "https://www.youtube.com/watch?v=O5dysbuTfgg/" ;

        BtnYoutube_Pizza = (ImageButton) findViewById(R.id.Youtube_Pizza);


        BtnYoutube_Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pizza.this, Youtube.class);
                i.putExtra(KEY_NAME, nama);
                startActivity(i);

            }
        });

    }
}
