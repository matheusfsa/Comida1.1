package br.com.msa.comida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void selecionarOpcao(View view){
        Intent intentIngredientes= new Intent(MainActivity.this,IngredientesActivity.class);
        switch (view.getId()){
            case(R.id.cafe_da_manha):

                intentIngredientes.putExtra("tipo","cafe_da_manha");
                startActivity(intentIngredientes);
                break;
            case(R.id.almoco):

                intentIngredientes.putExtra("tipo","almoco");
                startActivity(intentIngredientes);
                break;
            case(R.id.sobremesa):
                intentIngredientes.putExtra("tipo","sobremesa");
                startActivity(intentIngredientes);
                break;
            case(R.id.lanche):
                intentIngredientes.putExtra("tipo","lanche");
                startActivity(intentIngredientes);
                break;



        }
    }
}
