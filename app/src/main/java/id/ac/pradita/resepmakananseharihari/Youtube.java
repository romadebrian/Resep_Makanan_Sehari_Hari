package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube extends AppCompatActivity {
    ImageButton BtnYoutube ;

    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);


        WebView webView = findViewById(R.id.Webview);
        String url = nama;
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

//        BtnYoutube = (ImageButton) findViewById(R.id.YtPisang_Goreng_Nugget);
//
//        BtnYoutube.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent GotoYoutube = new Intent(In);
//                GotoYoutube.setData(Uri.parse("https://pradita.ac.id"));
//                startActivity(GotoYoutube);
//            }
//        });
    }
}
