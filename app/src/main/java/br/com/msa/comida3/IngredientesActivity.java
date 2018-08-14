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

               CharSequence[] itens =  new CharSequence[]{"Arroz", "Açúcar", "Cebola", "Extrato de tomate", "Farinha de trigo", "Macarrão", "Massa de Lasanha", "Molho de tomate", "Ovo", "Pão", "Pão de forma", "Pão de forma integral", "Sal", "Tapioca", "Óleo"};
                final String[] itens2 = {"Arroz", "Açúcar", "Cebola", "Extrato de tomate", "Farinha de trigo", "Macarrão", "Massa de Lasanha", "Molho de tomate", "Ovo", "Pão", "Pão de forma", "Pão de forma integral", "Sal", "Tapioca", "Óleo"};
               ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo1);
                Dialogo(itens,"Itens Básicos", itens2, listaIngredientes);

            }
        });
        Button botao2=(Button)findViewById(R.id.button_tipo2);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Creme de leite", "Leite", "Maionese", "Margarina ou Manteiga", "Queijo Muçarela", "Queijo cottage", "Queijo parmesão ralado", "Queijo provolone", "Requeijão cremoso", "Ricota"};
                final String[] itens2 = {"Creme de leite", "Leite", "Maionese", "Margarina ou Manteiga", "Queijo Muçarela", "Queijo cottage", "Queijo parmesão ralado", "Queijo provolone", "Requeijão cremoso", "Ricota"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo2);
                  Dialogo(itens,"Lacticínios", itens2, listaIngredientes);


            }
        });
        Button botao3=(Button)findViewById(R.id.button_tipo3);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Calabresa", "Presunto", "Salame", "Salsicha"};
                final String[] itens2 = {"Calabresa", "Presunto", "Salame", "Salsicha"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo3);
                Dialogo(itens,"Embutidos", itens2, listaIngredientes);


            }
        });

        Button botao4=(Button)findViewById(R.id.button_tipo4);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Abacate", "Abacaxi", "Açaí", "Caju", "Cajá", "Goiaba", "Laranja", "Manga", "Tomate"};
                final String[] itens2 = {"Abacate", "Abacaxi", "Açaí", "Caju", "Cajá", "Goiaba", "Laranja", "Manga", "Tomate"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo4);
                Dialogo(itens,"Frutas", itens2, listaIngredientes);


            }
        });
        Button botao5=(Button)findViewById(R.id.button_tipo5);
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Abobrinha", "Amendoim", "Batata", "Batata doce", "Cenoura", "Mandioca", "Manjericão", "Milho", "Salsa(ou salsinha)"};
                final String[] itens2 = {"Abobrinha", "Amendoim", "Batata", "Batata doce", "Cenoura", "Mandioca", "Manjericão", "Milho", "Salsa(ou salsinha)"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo5);
                Dialogo(itens,"Verduras/Legumes/Grãos", itens2, listaIngredientes);


            }
        });

        Button botao6=(Button)findViewById(R.id.button_tipo6);
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

            CharSequence[] itens =  new CharSequence[]{"Acém", "Alcatra", "Atum", "Bacalhau", "Bacon", "Camarão", "Carne Moída", "Carne de boi", "Carne do Sol", "Costela Suína", "Coxa de Frango", "Coxão Mole", "Filé de Frango", "Filé de merluza","Filé Mignon", "Frango", "Lombo Suíno", "Maminha", "Peito de Peru", "Salmão", "Sardinha", "Sobrecoxa de Frango", "Toucinho"};
                final String[] itens2 = {"Acém", "Alcatra", "Atum", "Bacalhau", "Bacon", "Camarão", "Carne Moída", "Carne de boi", "Carne do Sol", "Costela Suína", "Coxa de Frango", "Coxão Mole", "Filé de Frango", "Filé de merluza","Filé Mignon", "Frango", "Lombo Suíno", "Maminha", "Peito de Peru", "Salmão", "Sardinha", "Sobrecoxa de Frango", "Toucinho"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo6);
                Dialogo(itens,"Carnes", itens2, listaIngredientes);


            }
        });



        Button botao7=(Button)findViewById(R.id.button_tipo7);
        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Amido de Milho", "Azeite", "Azeite de dendê", "Café Solúvel", "Caldo de Carne","Catchup", "Chocolate", "Coco ralado", "Doce de leite", "Farinha", "Farinha de Milho","Farinha de Rosca", "Fermento biológico", "Fermento em pó", "Goiabada", "Leite de Coco", "Molho Inglês", "Molho Madeira", "Mostarda", "Mostarda em pó", "Nutella", "Patê de Frango", "Patê de Presunto", "Polvilho azedo", "Polvilho doce", "Shoyu", "Vinho Branco"};
                final String[] itens2 = {"Amido de Milho", "Azeite", "Azeite de dendê", "Café Solúvel", "Caldo de Carne","Catchup", "Chocolate", "Coco ralado", "Doce de leite", "Farinha", "Farinha de Milho","Farinha de Rosca", "Fermento biológico", "Fermento em pó", "Goiabada", "Leite de Coco", "Molho Inglês", "Molho Madeira", "Mostarda", "Mostarda em pó", "Nutella", "Patê de Frango", "Patê de Presunto", "Polvilho azedo", "Polvilho doce", "Shoyu", "Vinho Branco"};
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
