package br.com.msa.comida3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostrarReceita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setContentView(R.layout.pao_com_queijo);
        ArrayList<Receitas> receitas = new ArrayList<Receitas>();
        receitas.add(new Receitas("Misto Quente","http://www.tudogostoso.com.br/receita/138603-misto-quente-de-forno-a-minha-moda.html"));
        receitas.add(new Receitas("Cachorro Quente","http://gshow.globo.com/receitas-gshow/receita/cachorro-quente-ao-molho-super-hiper-mega-bom-54909b094d3885149c000048.html"));
        receitas.add(new Receitas("Sanduíche de frango com pasta de queijo","http://www.tudogostoso.com.br/receita/138603-misto-quente-de-forno-a-minha-moda.html"));
        receitas.add(new Receitas("Cachorro quente de forno","http://www.tudogostoso.com.br/receita/28749-cachorro-quente-de-forno.html"));
        receitas.add(new Receitas("Omelete de forno","http://receitasdeminuto.com/omelete-de-forno/"));
        receitas.add(new Receitas("Cuscuz de Tapioca","http://www.tudogostoso.com.br/receita/7271-cuscuz-de-tapioca.html"));
        receitas.add(new Receitas("Ovos Mexidos","http://gnt.globo.com/receitas/receitas/ovos-mexidos-cremosos.htm"));
        receitas.add(new Receitas("Waffle","http://www.tudogostoso.com.br/receita/154704-waffle-classico.html"));
        receitas.add(new Receitas("Crepe Suiço","https://www.magazinefeminina.com/receita-crepe-suico-palito-doce-salgado"));
        receitas.add(new Receitas("Torrada com queijo, presunto e ovo","https://www.tudoreceitas.com/receita-de-pao-recheado-com-ovo-queijo-e-presunto-2722.html"));
        receitas.add(new Receitas("Panqueca Americana","http://www.tudogostoso.com.br/receita/13110-panqueca-americana.html"));
        receitas.add(new Receitas("Café Cremoso","http://www.tudogostoso.com.br/receita/11486-cafe-cremoso.html"));
        receitas.add(new Receitas("Pão de queijo no liquidificador","http://allrecipes.com.br/receita/2428/p-o-de-queijo-de-liquidificador.aspx"));
        receitas.add(new Receitas("Pão de queijo de sanduicheira","https://cybercook.uol.com.br/receita-de-pao-de-queijo-de-sanduicheira-r-14-14030.html"));
        receitas.add(new Receitas("Bolinhos de Chuva","http://www.tudogostoso.com.br/receita/76049-bolinho-de-chuva.html"));
        receitas.add(new Receitas("Bolinhos de batata","http://www.tudogostoso.com.br/receita/11908-bolinhos-de-batata-recheados.html"));
        receitas.add(new Receitas("Tiras de frango crocantes com molho de mostarda","http://www.tudogostoso.com.br/receita/11908-bolinhos-de-batata-recheados.htmlhttp://gordelicias.biz/index.php/2014/01/25/tiras-frango-crocante-mostarda-mel/"));
        receitas.add(new Receitas("Panquecas americanas recheadas de nutella","http://www.pilotandoumfogao.com.br/2016/02/28/panquecas-americanas-recheadas-de-nutella/"));
        receitas.add(new Receitas("Pizza enrolada","http://gshow.globo.com/receitas-gshow/receita/pizza-enrolada-4d5065c052e0b252bc000951.html"));
        receitas.add(new Receitas("Batata doce frita","http://gshow.globo.com/receitas-gshow/receita/batata-doce-frita-4d513ccf52e0b252bc00db2f.html"));
        receitas.add(new Receitas("Hambúrguer","http://www.tudogostoso.com.br/receita/155011-hamburguer-caseiro.html"));
        receitas.add(new Receitas("Pizza de hambúrguer","http://www.tudogostoso.com.br/receita/120294-hamburguer-pizza.html"));
        receitas.add(new Receitas("Pão com alho","http://gshow.globo.com/receitas-gshow/receita/pao-de-alho-para-churrasco-5648e59d4d388578d1000049.html"));
        receitas.add(new Receitas("Bolinhas de queijo","http://www.tudogostoso.com.br/receita/2082-bolinha-de-queijo.html"));
        receitas.add(new Receitas("Sanduíche Beirute","http://gshow.globo.com/receitas-gshow/receita/sanduiche-beirute-56bf70794d3885665b00003f.html"));
        receitas.add(new Receitas("Macarrão com molho de queijo","http://allrecipes.com.br/receita/13153/molho-de-queijo-para-macarr-o.aspx"));
        receitas.add(new Receitas("Carne de Panela Simples","http://www.tudogostoso.com.br/receita/91006-carne-de-panela-de-pressao-simples-e-pratica.html"));
        receitas.add(new Receitas("Macarrão de panela de pressão","http://gshow.globo.com/receitas-gshow/receita/macarrao-cremoso-de-panela-de-pressao-50b5efcd4d09383d9900003f.html"));
        receitas.add(new Receitas("Frango ao molho de tomate","http://gshow.globo.com/receitas-gshow/receita/frango-ao-molho-de-tomate-55305f6d4d388565b400003f.html"));
        receitas.add(new Receitas("Risoto simples de frango","http://www.tudogostoso.com.br/receita/53709-risoto-de-frango-facil.html"));
        receitas.add(new Receitas("Moqueca de ovos","http://www.tudogostoso.com.br/receita/60306-moqueca-de-ovos-baiana.html"));
        receitas.add(new Receitas("Almôdegas de carne moída","http://www.tudogostoso.com.br/receita/64879-almondegas.html"));
        receitas.add(new Receitas("Salmão à moda Alemã","http://receitasdecomidas.com.br/salmao-a-moda-alema.html"));
        receitas.add(new Receitas("Filé de frango recheado","http://www.receitadevovo.com.br/receitas/file-de-frango-recheado"));
        receitas.add(new Receitas("Farofa de Carne do Sol","http://www.tudogostoso.com.br/receita/12963-farofa-de-carne-de-sol.html"));
        receitas.add(new Receitas("Bife à Milanesa","http://www.tudogostoso.com.br/receita/41735-bife-a-milanesa.html"));
        receitas.add(new Receitas("Carne assada na panela de pressão","http://www.tudogostoso.com.br/receita/66573-carne-assada-na-panela-de-pressao.html"));
        receitas.add(new Receitas("Carne de Panela","http://allrecipes.com.br/receita/5980/carne-de-panela-de-press-o.aspx"));
        receitas.add(new Receitas("Bife Acebolado com molho de Maionese","http://www.tudogostoso.com.br/receita/97221-bife-acebolado-com-molho-de-maionese.html"));
        receitas.add(new Receitas("Bacalhau Desfiado","http://www.tudogostoso.com.br/receita/6109-bacalhau-desfiado.html"));
        receitas.add(new Receitas("Frango à caçadora","http://gnt.globo.com/receitas/receitas/frango-a-cacadora-veja-a-receita-tradicional-de-claude-troisgros.htm"));
        receitas.add(new Receitas("Filé de Merluza frito","http://www.receitamaneira.com.br/file-de-merluza-frito/"));
        receitas.add(new Receitas("Yakissoba","http://www.tudogostoso.com.br/receita/2085-yakissoba-da-casa.html"));
        receitas.add(new Receitas("Estrogonofe de Frango","http://www.tudogostoso.com.br/receita/2462-strogonoff-de-frango.html"));
        receitas.add(new Receitas("Sobrecoxa de Frango","http://gnt.globo.com/receitas/receitas/sobrecoxas-de-frango-agridoce.htm"));
        receitas.add(new Receitas("Baguetinha de Frango com Requeijão","http://gshow.globo.com/receitas-gshow/receita/baguetinha-de-frango-com-requeijao-55e5f8ff4d38852917000044.html"));
        receitas.add(new Receitas("Lasanha de Frigideira com Molho Bolonhesa de Frango","http://www.hojetemfrango.com.br/receita/pratico/lasanha-ao-molho-bolonhesa-de-frango/"));
        receitas.add(new Receitas("Risoto de Panela de Pressão","http://www.receitasetemperos.com.br/risoto-na-panela-de-pressao/"));
        receitas.add(new Receitas("Frango Oriental ao Molho de Laranja","http://www.tudogostoso.com.br/receita/102410-frango-ao-molho-de-laranja-chines.html"));
        receitas.add(new Receitas("Frango à Parmegiana sem Fritura","http://entretenimento.band.uol.com.br/diadia/receita/24406/Frango-Parmegiana-Sem-Fritura.html"));
        receitas.add(new Receitas("Frango Xadrez","http://www.tudogostoso.com.br/receita/897-frango-xadrez.html"));
        receitas.add(new Receitas("Macarrão com Leite de Coco e Frango","http://receitasdeminuto.com/macarrao-com-leite-de-coco-e-frango-facil-sadia/"));
        receitas.add(new Receitas("Espaguete com Bacon e Abobrinha","http://receitasdeminuto.com/espaguete-com-bacon-e-abobrinha/"));
        receitas.add(new Receitas("Bolo de Mandioca","http://www.tudogostoso.com.br/receita/1786-bolo-de-mandioca.html"));
        receitas.add(new Receitas("Musse com Pé de Moleque e Chocolate","http://gshow.globo.com/receitas-gshow/receita/torta-mousse-de-chocolate-com-pe-de-moleque-4d50a08f52e0b252bc004084.html"));
        receitas.add(new Receitas("Bolo Rápido de Liquidificador","http://www.tudogostoso.com.br/receita/11252-bolo-de-liquidificador.html"));
        receitas.add(new Receitas("Danoninho Caseiro","http://www.tudogostoso.com.br/receita/19728-danoninho-caseiro.html"));
        receitas.add(new Receitas("Nega Maluca","http://gshow.globo.com/receitas-gshow/receita/bolo-nega-maluca-550f0f494d3885044b000043.html"));
        receitas.add(new Receitas("Chocolate Quente Cremoso","http://www.tudogostoso.com.br/receita/130871-chocolate-quente-cremoso.html"));
        receitas.add(new Receitas("Mousse de Limão","http://www.aquinacozinha.com/mousse-de-limao-mais-facil-impossivel/"));
        receitas.add(new Receitas("Sorvete","http://www.tudogostoso.com.br/receita/4730-sorvete-facil.html"));
        receitas.add(new Receitas("Brigadeirão","http://www.tudogostoso.com.br/receita/73135-brigadeirao-rapido-e-facil.html"));
        receitas.add(new Receitas("Bolo de Laranja","http://www.tudogostoso.com.br/receita/13953-bolo-de-laranja.html"));
        receitas.add(new Receitas("Pipoca Doce","http://www.tudogostoso.com.br/receita/7269-pipoca-doce.html"));
        receitas.add(new Receitas("Pé de Moleque de Leite Condensado","http://www.tudogostoso.com.br/receita/9861-pe-de-moleque-de-leite-condensado.html"));
        receitas.add(new Receitas("Mousse de Abacaxi","http://www.tudogostoso.com.br/receita/4364-mousse-de-abacaxi.html"));
        receitas.add(new Receitas("Prestígio Gelado","http://www.tudogostoso.com.br/receita/140770-prestigio-gelado.html"));
        receitas.add(new Receitas("Torta Gelada de Bis","http://www.tudogostoso.com.br/receita/13796-torta-gelada-de-bis.html"));
        receitas.add(new Receitas("Bombocado","http://www.tudogostoso.com.br/receita/4660-bombocado-de-liquidificador.html"));
        receitas.add(new Receitas("Taça de Chocolates, Bolachas e Chantilly","http://www.tudogostoso.com.br/receita/71894-taca-de-chocolate-bolachas-e-chantilly.html"));
        receitas.add(new Receitas("Super Cremoso de Morango","http://www.tudogostoso.com.br/receita/94266-super-cremoso-de-morango.html"));
        receitas.add(new Receitas("Arroz Doce Cremoso","http://www.tudogostoso.com.br/receita/10592-arroz-doce-cremoso.html"));
        receitas.add(new Receitas("Brigadeiro de Microondas","http://gshow.globo.com/receitas-gshow/receita/brigadeiro-de-microondas-4e891816a913e0312c00302a.html"));
        receitas.add(new Receitas("Smoothie de Frutas","http://www.muitochique.com/receitas/smoothie.html"));
        receitas.add(new Receitas("Flan de Pêssego","http://www.tudogostoso.com.br/receita/82230-flan-de-pessego.html"));
        receitas.add(new Receitas("Torta de Brigadeiro, Chocolate e Bis","http://www.tudogostoso.com.br/receita/16948-torta-de-brigadeiro-sorvete-e-bis.html"));
        receitas.add(new Receitas("Beijinho de Microondas","http://www.tudogostoso.com.br/receita/17759-beijinho-de-microondas.html"));
        receitas.add(new Receitas("Frapê de Café","http://www.tudogostoso.com.br/receita/14836-frape-de-cafe.html"));
        receitas.add(new Receitas("Torta Salgada de Liquidificador","http://www.tudogostoso.com.br/receita/1600-torta-salgada-de-liquidificador.html"));
        receitas.add(new Receitas("Torta de Frango","http://www.tudogostoso.com.br/receita/1282-torta-de-frango.html"));
        receitas.add(new Receitas("Coxinha","http://www.tudogostoso.com.br/receita/1363-coxinha-pratica-deliciosa.html"));
        receitas.add(new Receitas("Empadão","http://www.tudogostoso.com.br/receita/7070-empadao-preguicoso.html"));
        receitas.add(new Receitas("Torta de Frango Cremosa","http://www.tudogostoso.com.br/receita/76-torta-cremosa-de-frango.html"));
        receitas.add(new Receitas("Coxinha de Frango","http://www.tudogostoso.com.br/receita/3798-coxinha-de-frango.html"));
        receitas.add(new Receitas("Joelho","http://www.tudogostoso.com.br/receita/7201-joelho.html"));
        receitas.add(new Receitas("Lanche Rápido","http://www.tudogostoso.com.br/receita/3114-lanche-rapido.html"));
        receitas.add(new Receitas("Biscoitos Amanteigados","http://www.tudogostoso.com.br/receita/68-biscoitos-amanteigados.html"));
        receitas.add(new Receitas("Pão de Batata","http://www.tudogostoso.com.br/receita/83-pao-de-batata.html"));
        receitas.add(new Receitas("Enroladinho de Salsicha","http://www.tudogostoso.com.br/receita/12040-enroladinho-de-salsicha.html"));
        receitas.add(new Receitas("Pão de Mel","http://www.tudogostoso.com.br/receita/2745-pao-de-mel.html"));
        receitas.add(new Receitas("Risólis","http://www.tudogostoso.com.br/receita/712-risolis.html"));
        receitas.add(new Receitas("Cookies","http://www.tudogostoso.com.br/receita/19941-cookies-maravilhosos-de-chocolate.html"));
        receitas.add(new Receitas("Rosquinhas","http://www.tudogostoso.com.br/receita/1779-rosquinhas.html"));
        receitas.add(new Receitas("Torta de Sardinha","http://www.tudogostoso.com.br/receita/1736-torta-de-sardinha-rapida.html"));
        receitas.add(new Receitas("Biscoito de Maizena","http://www.tudogostoso.com.br/receita/7511-biscoitos-de-maizena.html"));
        receitas.add(new Receitas("Quibe Frito","http://www.tudogostoso.com.br/receita/56-quibe-frito.html"));
        receitas.add(new Receitas("Massa de Empadão","http://www.tudogostoso.com.br/receita/123-massa-de-empadao.html"));
        receitas.add(new Receitas("Cueca Virada","http://www.tudogostoso.com.br/receita/573-cueca-virada.html"));
        receitas.add(new Receitas("Torta Salgada de Frango","http://www.tudogostoso.com.br/receita/36201-torta-salgada-de-frango.html"));
        receitas.add(new Receitas("Lanche Agridoce","http://www.tudogostoso.com.br/receita/188961-lanche-agridoce-da-dona-diva.html"));
        receitas.add(new Receitas("Sanduíche de Forno","http://www.tudogostoso.com.br/receita/10580-sanduiche-de-forno.html"));
        receitas.add(new Receitas("Biscoito de Polvilho","http://www.tudogostoso.com.br/receita/81-biscoito-de-polvilho.html"));
        receitas.add(new Receitas("Sanduíche Cremoso de Forno","http://www.tudogostoso.com.br/receita/17229-sanduiche-cremoso-de-forno.html"));
        receitas.add(new Receitas("Rosca de Leite Condensado","http://www.tudogostoso.com.br/receita/8279-rosca-de-leite-condensado.html"));
        receitas.add(new Receitas("Esfirra","http://www.tudogostoso.com.br/receita/17523-esfirra-fofinha-da-mamae.html"));
        receitas.add(new Receitas("Estrogonofe de Carne","http://mdemulher.abril.com.br/receitas/estrogonofe-de-carne/"));
        receitas.add(new Receitas("Atum ao Forno","http://mdemulher.abril.com.br/receitas/atum-ao-forno/"));
        receitas.add(new Receitas("Coxa de frango com ervas","http://mdemulher.abril.com.br/receitas/coxa-de-frango-com-ervas/"));
        receitas.add(new Receitas("Macarrão com molho de requeijão e maionese","http://mdemulher.abril.com.br/receitas/macarrao-com-molho-de-requeijao-e-maionese/"));
        receitas.add(new Receitas("Pizza dois queijos","http://mdemulher.abril.com.br/receitas/pizza-caseira-com-dois-queijos/"));











        Collections.sort(receitas);




        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        WebView webview = (WebView) findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setSupportZoom(false);
        webview.setWebViewClient(new WebViewClient());
        webview.setHorizontalScrollBarEnabled(false);
        webview.setVerticalScrollBarEnabled(false);
        Intent intent = getIntent();
        String resultado = (String) intent.getSerializableExtra("resultado");
        Receitas p = new Receitas(resultado);
        int i = Collections.binarySearch(receitas,p);
        webview.loadUrl(receitas.get(i).getLink());


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
