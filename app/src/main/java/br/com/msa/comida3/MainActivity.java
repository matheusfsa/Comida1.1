package br.com.msa.comida3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
