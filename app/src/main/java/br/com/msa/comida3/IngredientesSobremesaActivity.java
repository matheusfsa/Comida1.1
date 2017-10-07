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

public class IngredientesSobremesaActivity extends AppCompatActivity {
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

                CharSequence[] itens =  new CharSequence[]{"Açucar","Arroz","Ovo","Farinha de trigo","Fermento em pó"};
                final String[] itens2 = {"Açucar","Arroz","Ovo","Farinha de trigo","Fermento em pó"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo1);
                Dialogo(itens,"Itens Básicos", itens2, listaIngredientes);

            }
        });
        Button botao2=(Button)findViewById(R.id.button_tipo2);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Creme de Leite","Doce de leite","Leite","Leite Condesado","Leite em pó","Margarina ou Manteiga","Iorgute Natural","Sorvete de Creme"};
                final String[] itens2 = {"Creme de Leite","Doce de leite","Leite","Leite Condesado","Leite em pó","Margarina ou Manteiga","Iorgute Natural","Sorvete de Creme"};
                ListView  listaIngredientes= (ListView) findViewById(R.id.lista_tipo2);
                Dialogo(itens,"Lacticínios", itens2, listaIngredientes);

            }
        });
        Button botao3=(Button)findViewById(R.id.button_tipo3);
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Achocolatado","Chocolate ao Leite","Chocolate em pó","Chocolate Meio Amargo"};
                final String[] itens2 = {"Achocolatado","Chocolate ao Leite","Chocolate em pó","Chocolate Meio Amargo"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo3);
                Dialogo(itens,"Chocolates", itens2, listaIngredientes);


            }
        });
        Button botao4=(Button)findViewById(R.id.button_tipo4);
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Abacaxi","Amendoim","Mandioca","Limão","Banana","Morango","Cenoura","Laranja","Pêssego"};
                final String[] itens2 = {"Abacaxi","Amendoim","Mandioca","Limão","Banana","Morango","Cenoura","Laranja","Pêssego"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo5);
                Dialogo(itens,"Frutas/Verduras/Raizes", itens2, listaIngredientes);


            }
        });

        Button botao5=(Button)findViewById(R.id.button_tipo5);
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Pé de moleque","Biscoito de Maisena","Bolacha Maria","Creme de Avelã","Farinha de Milho","Gelatina","Milho"};
                final String[] itens2 = {"Pé de moleque","Biscoito de Maisena","Bolacha Maria","Creme de Avelã","Farinha de Milho","Gelatina","Milho"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo4);
                Dialogo(itens,"Doces", itens2, listaIngredientes);


            }
        });
        Button botao6=(Button)findViewById(R.id.button_tipo6);
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                //Lista de itens

                CharSequence[] itens =  new CharSequence[]{"Amido de Milho","Azeite","Azeite de dendê","Chocolate","Coco ralado","Caldo de Carne","Goiabada","Doce de leite","Farinha","Fermento em pó","Fermento biológico","Leite de Coco","Mostarda","Mostarda em pó","Molho Inglês","Nutella","Polvilho azedo","Polvilho doce","Shoyu"};
                final String[] itens2 = {"Amido de Milho","Azeite","Azeite de dendê","Chocolate","Coco ralado","Caldo de Carne","Goiabada","Doce de leite","Fermento em pó","Fermento biológico","Leite de Coco","Mostarda","Mostarda em pó","Molho Inglês","Nutella","Polvilho azedo","Polvilho doce","Shoyu"};
                ListView listaIngredientes= (ListView) findViewById(R.id.lista_tipo11);
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
                ArrayAdapter adapter = new ArrayAdapter(IngredientesSobremesaActivity.this, android.R.layout.simple_list_item_1, itensSelecionados);
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