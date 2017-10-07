package br.com.msa.comida3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Resultados extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resultados);
        Intent intent = getIntent();
        final ArrayList<String> receitasSelecionadas= (ArrayList<String>) intent.getSerializableExtra("resultados");
        final ListView listaResultados= (ListView) findViewById(R.id.resultados_lista);
        ArrayAdapter adapter = new ArrayAdapter(Resultados.this, android.R.layout.simple_list_item_1,receitasSelecionadas);
        listaResultados.setAdapter(adapter);
        calculeHeightListView(listaResultados);
        listaResultados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View item, int position, long id) {

                String resultado = (String) listaResultados.getItemAtPosition(position);
                Intent intentResultados= new Intent(Resultados.this,MostrarReceita.class);



                //mostrar(resultado);
                intentResultados.putExtra("resultado", resultado);
                startActivity(intentResultados);


            }
        });

    }
    private void calculeHeightListView(ListView listaIngredientes) {
        int totalHeight = 0;
        ListAdapter adapter = listaIngredientes.getAdapter();
        int lenght = adapter.getCount();
        for (int i = 0; i <lenght; i++) {
            View listItem = adapter.getView(i, null, listaIngredientes);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listaIngredientes.getLayoutParams();
        params.height = totalHeight
                + (listaIngredientes.getDividerHeight() * (adapter.getCount() - 1));
        listaIngredientes.setLayoutParams(params);
        listaIngredientes.requestLayout();
    }

    public void ColocaTexto(String tituloTxt,String ingredientesTxt,String comoFazerTxt){
        TextView titulo= (TextView) findViewById(R.id.titulo_texto);;
        TextView ingredientes = (TextView) findViewById(R.id.ingredientes_texto);
        TextView comoFazer=(TextView) findViewById(R.id.como_fazer_texto);
        titulo.setText(tituloTxt);
        ingredientes.setText(" " + ingredientesTxt);
        comoFazer.setText(" " + comoFazerTxt);

    }

}
