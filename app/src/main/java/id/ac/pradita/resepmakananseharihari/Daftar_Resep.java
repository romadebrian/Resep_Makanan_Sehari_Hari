package id.ac.pradita.resepmakananseharihari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Daftar_Resep extends AppCompatActivity {
    TextView PisangGorengNugget, SotoAyamSpesial, PindangIkan, TelurCris, TahuKecap,   NasiGoreng, GurameSausTiram, BihunGoreng, GulaiTunjang, MartabakMini,TumisPedasJagungMudaAtiAyam, NuggetAyam, IkanKembungKuning, BaksoBakar, AyamBakarMadu,   TelurGulung, Pizza, AyamBakarKecap, TumisKangkung, AyamRicaRica;
    ImageButton GmbrPisangGorengNugget, GmbrSotoAyamSpesial, GmbrPindangIkan, GmbrTelurCris, GmbrTahuKecap,   GmbrNasiGoreng, GmbrGurameSausTiram, GmbrBihunGoreng, GmbrGulaiTunjang, GmbrMartabakMini, GmbrTumisPedasJagungMudaAtiAyam, GmbrNuggetAyam, GmbrIkanKembungKuning, GmbrBaksoBakar, GmbrAyamBakarMadu,   GmbrTelurGulung, GmbrPizza, GmbrAyamBakarKecap, GmbrTumisKangkung, GmbrAyamRicaRica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_resep);

        PisangGorengNugget = (TextView) findViewById(R.id.Pisang_Goreng_Nugget);
        SotoAyamSpesial = (TextView) findViewById(R.id.Soto_Ayam_Special);
        PindangIkan = (TextView) findViewById(R.id.Pindang_Ikan_Tongkol_Bumbu_Sarden);
        TelurCris = (TextView) findViewById(R.id.Telur_Crispy);
        TahuKecap = (TextView) findViewById(R.id.Tahu_Kecap_Pedas);
        NasiGoreng = (TextView) findViewById(R.id.Nasi_Goreng);
        GurameSausTiram = (TextView) findViewById(R.id.Gurame_Saus_Tiram);
        BihunGoreng = (TextView) findViewById(R.id.Bihun_Goreng);
        GulaiTunjang = (TextView) findViewById(R.id.Gulai_Tunjang);
        MartabakMini = (TextView) findViewById(R.id.Martabak_Mini);
        TumisPedasJagungMudaAtiAyam = (TextView) findViewById(R.id.Tumis_Pedas_Jagung_Muda_Ati_Ayam);
        NuggetAyam = (TextView) findViewById(R.id.Nugget_Ayam);
        IkanKembungKuning = (TextView) findViewById(R.id.Ikan_Kembung_Kuning);
        BaksoBakar = (TextView) findViewById(R.id.Bakso_Bakar);
        AyamBakarMadu = (TextView) findViewById(R.id.Ayam_Bakar_Madu);
        TelurGulung = (TextView) findViewById(R.id.Telur_Gulung);
        Pizza = (TextView) findViewById(R.id.Pizza);
        AyamBakarKecap = (TextView) findViewById(R.id.Ayam_Bakar_Kecap);
        TumisKangkung = (TextView) findViewById(R.id.Tumis_Kangkung);
        AyamRicaRica = (TextView) findViewById(R.id.Ayam_Rica_Rica);

        GmbrPisangGorengNugget = (ImageButton) findViewById(R.id.GmbrPisang_Goreng_Nugget);
        GmbrSotoAyamSpesial = (ImageButton) findViewById(R.id.GmbrSoto_Ayam_Special);
        GmbrPindangIkan = (ImageButton) findViewById(R.id.GmbrPindang_Ikan_Tongkol_Bumbu_Sarden);
        GmbrTelurCris = (ImageButton) findViewById(R.id.GmbrTelur_Crispy);
        GmbrTahuKecap = (ImageButton) findViewById(R.id.GmbrTahu_Kecap_Pedas);
        GmbrNasiGoreng = (ImageButton) findViewById(R.id.GmbrNasi_Goreng);
        GmbrGurameSausTiram = (ImageButton) findViewById(R.id.GmbrGurame_Saus_Tiram);
        GmbrBihunGoreng = (ImageButton) findViewById(R.id.GmbrBihun_Goreng);
        GmbrGulaiTunjang = (ImageButton) findViewById(R.id.GmbrGulai_Tunjang);
        GmbrMartabakMini = (ImageButton) findViewById(R.id.GmbrMartabak_Mini);
        GmbrTumisPedasJagungMudaAtiAyam = (ImageButton) findViewById(R.id.GmbrTumis_Pedas_Jagung_Muda_Ati_Ayam);
        GmbrNuggetAyam = (ImageButton) findViewById(R.id.GmbrNugget_Ayam);
        GmbrIkanKembungKuning = (ImageButton) findViewById(R.id.GmbrIkan_Kembung_Kuning);
        GmbrBaksoBakar = (ImageButton) findViewById(R.id.GmbrBakso_Bakar);
        GmbrAyamBakarMadu = (ImageButton) findViewById(R.id.GmbrAyam_Bakar_Madu);
        GmbrTelurGulung = (ImageButton) findViewById(R.id.GmbrTelur_Gulung);
        GmbrPizza = (ImageButton) findViewById(R.id.Gmbr_Pizza);
        GmbrAyamBakarKecap = (ImageButton) findViewById(R.id.GmbrAyam_Bakar_Kecap);
        GmbrTumisKangkung = (ImageButton) findViewById(R.id.GmbrTumis_Kangkung);
        GmbrAyamRicaRica = (ImageButton) findViewById(R.id.GmbrAyam_Rica_Rica);

        PisangGorengNugget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenResep1 = new Intent(Daftar_Resep.this, Pisang_Goreng_Nugget.class);
                startActivity(IntenResep1);
            }
        });

        SotoAyamSpesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sotoayam = new Intent(Daftar_Resep.this, Soto_Ayam_Spesial.class);
                startActivity(sotoayam);
            }
        });

        PindangIkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pindang = new Intent(Daftar_Resep.this, Pindang_Ikan_Tongkol_Bumbu_Sarden.class);
                startActivity(Pindang);
            }
        });

        TelurCris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelCrisp = new Intent(Daftar_Resep.this, Telur_Crispy.class);
                startActivity(TelCrisp);
            }
        });

        TahuKecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tahcap = new Intent(Daftar_Resep.this, Tahu_Kecap_Pedas.class);
                startActivity(Tahcap);
            }
        });

        NasiGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Nasgor = new Intent(Daftar_Resep.this, Nasi_Goreng.class);
                startActivity(Nasgor);
            }
        });

        GurameSausTiram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GurameST = new Intent(Daftar_Resep.this, Gurame_Saus_Tiram.class);
                startActivity(GurameST);
            }
        });

        BihunGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bihgor = new Intent(Daftar_Resep.this, Bihun_Goreng.class);
                startActivity(Bihgor);
            }
        });

        GulaiTunjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GulTuj = new Intent(Daftar_Resep.this, Gulai_Tunjang.class);
                startActivity(GulTuj);
            }
        });

        MartabakMini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MarMini = new Intent(Daftar_Resep.this, Martabak_Mini.class);
                startActivity(MarMini);
            }
        });

        TumisPedasJagungMudaAtiAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TumPeJuMuAtAy = new Intent(Daftar_Resep.this, Tumis_Pedas_Jagung_Muda_Ati_Ayam.class);
                startActivity(TumPeJuMuAtAy);
            }
        });

        NuggetAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NugAyam = new Intent(Daftar_Resep.this, Nugget_Ayam.class);
                startActivity(NugAyam);
            }
        });

        IkanKembungKuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IkanKemKu = new Intent(Daftar_Resep.this, Ikan_Kembung_Kuning.class);
                startActivity(IkanKemKu);
            }
        });

        BaksoBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BakBar = new Intent(Daftar_Resep.this, Bakso_Bakar.class);
                startActivity(BakBar);
            }
        });

        AyamBakarMadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AyamBakMad = new Intent(Daftar_Resep.this, Ayam_Bakar_Madu.class);
                startActivity(AyamBakMad);
            }
        });

        TelurGulung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tlgulgul = new Intent(Daftar_Resep.this, Telur_Gulung.class);
                startActivity(tlgulgul);
            }
        });

        Pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pizpiz = new Intent(Daftar_Resep.this, Pizza.class);
                startActivity(pizpiz);
            }
        });

        AyamBakarKecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayambarcap = new Intent(Daftar_Resep.this, Ayam_Bakar_Kecap.class);
                startActivity(ayambarcap);
            }
        });

        TumisKangkung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TumIs = new Intent(Daftar_Resep.this, Tumis_Kangkung.class);
                startActivity(TumIs);
            }
        });

        AyamRicaRica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AyamRicRic = new Intent(Daftar_Resep.this, Ayam_Rica_Rica.class);
                startActivity(AyamRicRic);
            }
        });





        GmbrPisangGorengNugget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrIntenResep1 = new Intent(Daftar_Resep.this, Pisang_Goreng_Nugget.class);
                startActivity(GmbrIntenResep1);
            }
        });

        GmbrSotoAyamSpesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Gmbrsotoayam = new Intent(Daftar_Resep.this, Soto_Ayam_Spesial.class);
                startActivity(Gmbrsotoayam);
            }
        });

        GmbrPindangIkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrPindang = new Intent(Daftar_Resep.this, Pindang_Ikan_Tongkol_Bumbu_Sarden.class);
                startActivity(GmbrPindang);
            }
        });

        GmbrTelurCris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrTelCrisp = new Intent(Daftar_Resep.this, Telur_Crispy.class);
                startActivity(GmbrTelCrisp);
            }
        });

        GmbrTahuKecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrTahcap = new Intent(Daftar_Resep.this, Tahu_Kecap_Pedas.class);
                startActivity(GmbrTahcap);
            }
        });

        GmbrNasiGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrNasgor = new Intent(Daftar_Resep.this, Nasi_Goreng.class);
                startActivity(GmbrNasgor);
            }
        });

        GmbrGurameSausTiram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrGurameST = new Intent(Daftar_Resep.this, Gurame_Saus_Tiram.class);
                startActivity(GmbrGurameST);
            }
        });

        GmbrBihunGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrBihgor = new Intent(Daftar_Resep.this, Bihun_Goreng.class);
                startActivity(GmbrBihgor);
            }
        });

        GmbrGulaiTunjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrGulTuj = new Intent(Daftar_Resep.this, Gulai_Tunjang.class);
                startActivity(GmbrGulTuj);
            }
        });

        GmbrMartabakMini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrMarMini = new Intent(Daftar_Resep.this, Martabak_Mini.class);
                startActivity(GmbrMarMini);
            }
        });

        GmbrTumisPedasJagungMudaAtiAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrTumPeJuMuAtAy = new Intent(Daftar_Resep.this, Tumis_Pedas_Jagung_Muda_Ati_Ayam.class);
                startActivity(GmbrTumPeJuMuAtAy);
            }
        });

        GmbrNuggetAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrNugAyam = new Intent(Daftar_Resep.this, Nugget_Ayam.class);
                startActivity(GmbrNugAyam);
            }
        });

        GmbrIkanKembungKuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrIkanKemKu = new Intent(Daftar_Resep.this, Ikan_Kembung_Kuning.class);
                startActivity(GmbrIkanKemKu);
            }
        });

        GmbrBaksoBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrBakBar = new Intent(Daftar_Resep.this, Bakso_Bakar.class);
                startActivity(GmbrBakBar);
            }
        });

        GmbrAyamBakarMadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrAyamBakMad = new Intent(Daftar_Resep.this, Ayam_Bakar_Madu.class);
                startActivity(GmbrAyamBakMad);
            }
        });

        GmbrTelurGulung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrTeltelGulGul = new Intent(Daftar_Resep.this, Telur_Gulung.class);
                startActivity(GmbrTeltelGulGul);
            }
        });

        GmbrPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrPizPiz = new Intent(Daftar_Resep.this, Pizza.class);
                startActivity(GmbrPizPiz);
            }
        });

        GmbrAyamBakarKecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrAyaybarbar = new Intent(Daftar_Resep.this, Ayam_Bakar_Kecap.class);
                startActivity(GmbrAyaybarbar);
            }
        });

        GmbrTumisKangkung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrTumTumKang = new Intent(Daftar_Resep.this, Tumis_Kangkung.class);
                startActivity(GmbrTumTumKang);
            }
        });

        GmbrAyamRicaRica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GmbrAyRicRic = new Intent(Daftar_Resep.this, Ayam_Rica_Rica.class);
                startActivity(GmbrAyRicRic);
            }
        });
    }
}
