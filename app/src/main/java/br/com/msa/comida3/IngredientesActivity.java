package br.com.msa.comida3;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.util.ArrayMap;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IngredientesActivity extends AppCompatActivity {

    private AlertDialog alerta;

    ArrayList<String> itensSelecionadosTotais = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes);
        Intent intent = getIntent();
        String tipo = (String) intent.getSerializableExtra("tipo");
        Button botao1 = (Button) findViewById(R.id.button_tipo1);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

               CharSequence[] itens =  new CharSequence[]{"Açúcar","Arroz","Café Solúvel","Catchup","Extrato de tomate","Farinha de trigo","Farinha de Rosca","Macarrão","Molho de tomate","Ovo","Óleo","Pão","Pão de forma integral","Pão de forma","Sal","Tapioca"};
                final String[] itens2 = {"Açúcar","Arroz","Café Solúvel","Catchup","Extrato de tomate","Farinha de trigo","Farinha de Rosca","Macarrão","Molho de tomate","Ovo","Óleo","Pão","Pão de forma integral","Pão de forma","Sal","Tapioca"};
               ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo1);
                Dialogo(itens,"Itens Básicos", itens2, listaIngredientes);

            }
        });
        Button botao2=(Button)findViewById(R.id.button_tipo2);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Queijo Muçarela","Queijo cottage","Requeijão cremoso","Margarina ou Manteiga","Maionese","Leite","Creme de leite","Queijo parmesão ralado"};
                final String[] itens2 = {"Queijo Muçarela","Queijo cottage","Requeijão cremoso","Margarina ou Manteiga","Maionese","Leite","Creme de leite","Queijo parmesão ralado"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo2);
                  Dialogo(itens,"Lacticínios", itens2, listaIngredientes);


            }
        });
        Button botao3=(Button)findViewById(R.id.button_tipo3);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Presunto","Salsicha","Salame","Calabresa"};
                final String[] itens2 = {"Presunto","Salsicha","Salame","Calabresa"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo3);
                Dialogo(itens,"Embutidos", itens2, listaIngredientes);


            }
        });

        Button botao4=(Button)findViewById(R.id.button_tipo4);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Abacate","Abacaxi","Acerola","Açaí","Cajá","Caju","Goiaba","Laranja","Manga","Tomate"};
                final String[] itens2 = {"Abacate","Abacaxi","Acerola","Açaí","Cajá","Caju","Goiaba","Laranja","Manga","Tomate"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo4);
                Dialogo(itens,"Frutas", itens2, listaIngredientes);


            }
        });
        Button botao5=(Button)findViewById(R.id.button_tipo5);
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Abobrinha","Alface","Alho","Amendoim","Batata","Batata doce","Cenoura","Mandioca","Milho"};
                final String[] itens2 = {"Abobrinha","Alface","Alho","Amendoim","Batata","Batata doce","Cenoura","Mandioca","Milho"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo5);
                Dialogo(itens,"Verduras/Legumes/Grãos", itens2, listaIngredientes);


            }
        });

        Button botao6=(Button)findViewById(R.id.button_tipo6);
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Carne de boi","Acém","Alcatra","Atum","Bacalhau","Bacon","Bife de filé mignon","Carne do Sol","Carne Moída","Coxa de Frango","Coxão Mole","Filé de merluza","Filé de Frango","Filé de peito de Frango","Frango","Salmão","Sardinha","Sobrecoxa de Frango","Toucinho"};
                final String[] itens2 = {"Carne de boi","Acém","Alcatra","Atum","Bacalhau","Bacon","Bife de filé mignon","Carne do Sol","Carne Moída","Contra Filé","Coxa de Frango","Coxão Mole","Filé de merluza","Filé de Frango","Filé de peito de Frango","Frango","Salmão","Sardinha","Sobrecoxa de Frango","Toucinho"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo6);
                Dialogo(itens,"Carnes", itens2, listaIngredientes);


            }
        });



        Button botao7=(Button)findViewById(R.id.button_tipo7);
        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Amido de Milho","Azeite","Azeite de dendê","Chocolate","Coco ralado","Caldo de Carne","Goiabada","Doce de leite","Farinha","Farinha de Milho","Fermento em pó","Fermento biológico","Leite de Coco","Mostarda","Mostarda em pó","Molho Inglês","Nutella","Patê de Frango","Patê de Presunto","Polvilho azedo","Polvilho doce","Shoyu","Vinho Branco"};
                final String[] itens2 = {"Amido de Milho","Azeite","Azeite de dendê","Chocolate","Coco ralado","Caldo de Carne","Goiabada","Doce de leite","Fermento em pó","Fermento biológico","Leite de Coco","Mostarda","Mostarda em pó","Molho Inglês","Nutella","Patê de Frango","Patê de Presunto","Polvilho azedo","Polvilho doce","Shoyu","Vinho Branco"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo7);
                Dialogo(itens,"Outros", itens2, listaIngredientes);



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
        final ArrayList<String> itensSelecionados = new ArrayList<String>();

        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(titulo);

        //define o diálogo como uma lista, passa o adapter.
        AlertDialog.Builder builder1 = builder.setMultiChoiceItems(itens, null, new DialogInterface.OnMultiChoiceClickListener() {
            public void onClick(DialogInterface dialog, int which,
                                boolean isChecked) {
                if (isChecked) {
                    if (itensSelecionados.contains(itens2[which])) {
                    }else {
                        if(itensSelecionadosTotais.contains(itens2[which])){

                        }else{
                            itensSelecionadosTotais.add(itens2[which]);

                        }

                            itensSelecionados.add(itens2[which]);




                    }

                } else if (itensSelecionados.contains(itens2[which])  ) {
                    // Else, if the item is already in the array, remove it

                    itensSelecionados.remove(itens2[which]);
                    itensSelecionadosTotais.remove(itens2[which]);
                }

            }

        });
        for(int i=0;i<itens2.length;i++){
            if(itensSelecionadosTotais.contains(itens2[i])&&(itensSelecionados.contains(itens2[i])==false)){
                itensSelecionados.add(itens2[i]);
            }
        }

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                ArrayAdapter adapter = new ArrayAdapter(IngredientesActivity.this, android.R.layout.simple_list_item_1, itensSelecionados);
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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i;
        Busca busca = new Busca();
        Intent intent = getIntent();
        String tipo = (String) intent.getSerializableExtra("tipo");

        ArrayList<String> resultadoDaBusca = busca.pesquisa(tipo,itensSelecionadosTotais);
        switch (item.getItemId()) {
            case R.id.menu_igredientes_ok:
                Intent intentResultados= new Intent(IngredientesActivity.this,Resultados.class);
                intentResultados.putExtra("resultados", resultadoDaBusca);
                startActivity(intentResultados);


                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
