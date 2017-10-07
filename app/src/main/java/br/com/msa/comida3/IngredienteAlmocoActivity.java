package br.com.msa.comida3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class IngredienteAlmocoActivity extends AppCompatActivity {
    private AlertDialog alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes);


        Button botao1 = (Button) findViewById(R.id.button_tipo1);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Arroz","Feijão","Macarrão"};
                final String[] itens2 = {"Arroz","Feijão","Macarrão"};
                ListView  listaIngredientes= (ListView) findViewById(R.id.lista_tipo1);
                Dialogo(itens,"Itens Básicos", itens2, listaIngredientes);

            }
        });
        Button botao2=(Button)findViewById(R.id.button_tipo2);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Alho","Sal","Cominho"};
                final String[] itens2 = {"Alho","Sal","Cominho"};
                ListView  listaIngredientes= (ListView) findViewById(R.id.lista_tipo2);
                Dialogo(itens,"Laticinios", itens2, listaIngredientes);

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_ingredientes, menu);

        return super.onCreateOptionsMenu(menu);


    }
    private void Dialogo(final CharSequence[] itens, final String titulo, final String[] itens2, final ListView listaIngredientes) {

        final boolean[] checados = new boolean[itens.length];
        //adapter utilizando um layout customizado (TextView)


        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(titulo);
        final ArrayList<String> itensSelecionados = new ArrayList<String>();
        //define o diálogo como uma lista, passa o adapter.
        AlertDialog.Builder builder1 = builder.setMultiChoiceItems(itens, null, new DialogInterface.OnMultiChoiceClickListener() {
            public void onClick(DialogInterface dialog, int which,
                                boolean isChecked) {
                if (isChecked) {
                    if (itensSelecionados.contains(itens2[which])) {
                    }else {
                        // If the user checked the item, add it to the selected items
                        itensSelecionados.add(itens2[which]);
                    }

                } else if (itensSelecionados.contains(itens2[which])) {
                    // Else, if the item is already in the array, remove it
                    itensSelecionados.remove(itens2[which]);
                }

            }

        });

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                ArrayAdapter adapter = new ArrayAdapter(IngredienteAlmocoActivity.this, android.R.layout.simple_list_item_1, itensSelecionados);
                listaIngredientes.setAdapter(adapter);
                calculeHeightListView(listaIngredientes);

            }

        });



        alerta = builder.create();
        alerta.show();
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
}
