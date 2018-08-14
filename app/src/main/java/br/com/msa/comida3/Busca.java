package br.com.msa.comida3;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Familia SA on 02/11/2016.
 */
public class Busca {

    final String[] misto_quente = {"Pão","Queijo Muçarela","Presunto"};
    final String[] cachorro_quente ={"Salsicha"};
    final String[] sanduiche_frango_pasta ={"Pão de forma","Filé de Frango","Queijo cottage"};
    final String[] cachorro_quente_de_forno ={"Farinha de trigo","Ovo","Salsicha"};
    final String[] omelete_de_forno ={"Ovo","Queijo Muçarela","Leite","Farinha de trigo"};
    final String[] cuscuz_de_tapioca ={"Tapioca"};
    final String[] ovos_mexidos_com_leite ={"Ovo","Leite"};
    final String[] waffle ={"Farinha de trigo","Leite","Ovo"};
    final String[] crepe_suico ={"Ovo","Leite","Farinha de trigo"};
    final String[] torrada_que_pre_ovo ={"Pão de forma","Presunto","Queijo Muçarela","Ovo"};
    final String[] panqueca_americana ={"Farinha de trigo","Ovo","Leite"};
    final String[] cafe_cremoso ={"Café Solúvel"};
    final String[] pao_de_queijo_liquidificador ={"Leite","Queijo parmesão ralado","Polvilho azedo","Polvilho doce"};
    final String[] pao_de_queijo_sanduicheira ={"Leite","Queijo parmesão ralado","Polvilho doce","Ovo"};
    final String[] bolinho_de_chuva ={"Farinha de trigo","Amido de Milho","Leite","Fermento em pó","Ovo"};
    final String[] bolinhos_de_batata ={"Batata","Farinha de trigo"};
    final String[] tiras_frango_mostarda ={"Filé de Frango","Farinha de Rosca"};
    final String[] panquecas_nutella ={"Leite","Ovo","Farinha de trigo","Nutella"};
    final String[] pizza_enrolada ={"Farinha de trigo","Fermento biológico"};
    final String[] batata_doce_frita ={"Batata doce"};
    final String[] hamburguer ={"Carne Moída"};
    final String[] pizza_hamburguer ={"Carne Moída","Queijo Muçarela","Queijo Muçarela"};
    final String[] pao_alho ={"Pão"};
    final String[] bolinhas_queijo ={"Farinha de trigo","Queijo Muçarela","Ovo","Margarina ou Manteiga"};
    final String[] sanduiche_beirute ={"Pão","Filé Mignon"};
    final String[] sanduiche_sem_gluten ={"Pão"};
    final String[] macarrao_molho_queijo ={"Macarrão","Requeijão cremoso","Leite","Creme de Leite"};
    final String[] carne_panela_simples ={"Alcatra"};
    final String[] macarrao_pressao ={"Macarrão"};
    final String[] frango_molho_tomate ={"Frango","Molho de tomate"};
    final String[] risoto_frango ={"Frango","Arroz"};
    final String[] moqueca_ovos ={"Ovo","Azeite"};
    final String[] almodegas_carne_moida ={"Carne Moída"};
    final String[] salmao_alema ={"Salmão","Farinha de trigo"};
    final String[] file_frango_recheado ={"Filé de Frango","Cebola","Queijo Muçarela"};
    final String[] farofa_carne_sol ={"Carne do Sol","Farinha"};
    final String[] bife_milanesa ={"Ovo","Carne de boi","Farinha de trigo","Farinha de Rosca"};
    final String[] carne_assada_pressao ={"Acém"};
    final String[] carne_panela ={"Coxão Mole"};
    final String[] bife_acebolado_maionese ={"Carne de boi","Maionese"};
    final String[] bacalhau_desfiado ={"Bacalhau"};
    final String[] frango_cacadora ={"Filé de Frango","Farinha de trigo"};
    final String[] file_merluza_frito ={"Filé de merluza"};
    final String[] yakissoba ={"Macarrão","Frango","Shoyu","Amido de Milho","Azeite"};
    final String[] estrogonofe_frango ={"Filé de Frango","Creme de Leite"};
    final String[] sobrecoxa_frango ={"Sobrecoxa de Frango"};
    final String[] baguetinha_frango_requeijao ={"Farinha de trigo","Filé de Frango","Ovo","Fermento biológico"};
    final String[] lasanha_bolonhesa_frango ={"Farinha de trigo","Requeijão cremoso","Filé de Frango"};
    final String[] risoto_pressao ={"Azeite","Arroz"};
    final String[] frango_oriental_laranja ={"Ovo","Filé de Frango","Farinha de trigo","Laranja"};
    final String[] frango_xadrez_forno ={"Sobrecoxa de Frango","Amido de Milho"};
    final String[] frango_parmefiana_fritura ={"Filé de Frango","Molho de tomate","Queijo Muçarela","Farinha de trigo","Ovo"};
    final String[] frango_xadrez ={"Filé de Frango","Shoyu"};
    final String[] macarrão_coco_frango ={"Sobrecoxa de Frango","Macarrão"};
    final String[] espaguete_bacon_abobrinha ={"Bacon","Macarrão"};
    final String[] musse_pe_cho ={"Pé de moleque","Chocolate Meio Amargo"};
    final String[] bolo_mandioca ={"Mandioca","Ovo","Leite"};
    final String[] bolo_liquidificador ={"Ovo","Leite","Farinha de trigo","Fermento em pó"};
    final String[] danoninho_caseiro ={"Leite Condesado","Creme de Leite","Iorgute Natural"};
    final String[] nega_maluca ={"Ovo","Farinha de trigo","Achocolatado"};
    final String[] nega_maluca2 ={"Ovo","Farinha de trigo","Chocolate em pó","Fermento em pó"};
    final String[] torta_leite_avela ={"Leite Condesado","Creme de Leite","Leite em pó","Creme de Avelã"};
    final String[] mousse_chocolate ={"Ovo","Chocolate Meio Amargo"};
    final String[] bolo_chocolate_sem_farinha ={"Chocolate em pó","Ovo","Fermento em pó"};
    final String[] bombom_aberto ={"Chocolate ao Leite","Leite Condesado","Creme de Leite"};
    final String[] capuccino ={"Leite em pó","Café Solúvel","Chocolate em pó"};
    final String[] smoothie_morango ={"Banana","Morango","Leite"};
    final String[] chocolate_quente_creme ={"Leite","Amido de Milho","Chocolate em pó","Creme de leite"};
    final String[] mousse_limao ={"Creme de leite","Leite Condesado","Limão"};
    final String[] sorvete ={"Creme de leite","Leite Condesado"};
    final String[] brigadeirao ={"Creme de leite","Leite Condesado","Chocolate em pó"};
    final String[] bolo_cenoura ={"Cenoura","Ovo","Farinha de trigo","Fermento em pó"};
    final String[] bolo_laranja ={"Laranja","Ovo","Farinha de trigo","Fermento em pó"};
    final String[] pipoca_doce ={"Milho","Chocolate em pó"};
    final String[] pe_de_moleque_cond={"Amendoim","Leite Condesado"};
    final String[] mousse_abacaxi={"Abacaxi","Leite Condesado","Creme de leite","Gelatina"};
    final String[] prestigio ={"Leite","Leite Condesado","Creme de leite","Amido de Milho","Achocolatado"};
    final String[] torta_bis ={"Leite","Leite Condesado","Creme de leite","Amido de Milho","Chocolate Meio Amargo","Ovo"};
    final String[] bombocado ={"Ovo","Leite Condesado","Coco ralado","Fermento em pó"};
    final String[] torta_gelada_amendoim ={"Leite Condesado","Amendoim","Creme de leite","Leite"};
    final String[] taca_chocolate_bolacha ={"Bolacha Maria","Leite Condesado","Ovo","Creme de leite","Leite","Chocolate"};
    final String[] cremoso_morango ={"Gelatina","Leite Condesado","Creme de leite","Leite","Morango"};
    final String[] arroz_doce_crem ={"Arroz","Leite Condesado","Creme de leite","Leite"};
    final String[] brigadeiro_micro ={"Leite Condesado","Creme de leite","Chocolate em pó"};
    final String[] smoothie_frutas ={"Banana"};
    final String[] flan_pessego ={"Leite Condesado","Creme de leite","Leite","Pêssego"};
    final String[] torta_brig_choc_bis ={"Leite Condesado","Leite"};
    final String[] beijinho_micro ={"Leite Condesado","Coco ralado"};
    final String[] frape_cafe ={"Leite Condesado","Café Solúvel","Sorvete de Creme"};
    final String[] torta_salgada_liq ={"Ovo","Farinha de trigo","Leite","Queijo Muçarela"};
    final String[] torta_frango ={"Filé de Frango","Ovo","Farinha de trigo","Leite"};
    final String[] coxinha ={"Leite","Batata","Farinha de trigo","Ovo"};
    final String[] empadao ={"Leite","Farinha de trigo","Ovo"};
    final String[] torta_frango_crem ={"Farinha de trigo","Ovo"};
    final String[] coxinha_frango ={"Leite","Farinha de trigo","Ovo","Filé de Frango","Batata"};
    final String[] joelho ={"Leite","Batata","Farinha de trigo","Queijo Muçarela","Presunto"};
    final String[] lanche_rapido ={"Pão de forma","Presunto","Queijo Muçarela","Creme de leite","Ovo"};
    final String[] biscoito_amanteigado ={"Farinha de trigo","Margarina ou Manteiga"};
    final String[] pao_batata ={"Fermento em pó","Leite","Batata","Ovo","Farinha de trigo"};
    final String[] sanduiche_natural ={"Pão de forma integral"};
    final String[] enroladinho_salsicha ={"Fermento biológico","Leite","Ovo","Farinha de trigo","Salsicha"};
    final String[] pao_mel ={"Mel","Leite","Ovo","Farinha de trigo","Chocolate"};
    final String[] risolis ={"Leite","Farinha de trigo"};
    final String[] cookies ={"Leite","Farinha de trigo","Margarina ou Manteiga","Fermento em pó"};
    final String[] rosquinhas ={"Leite","Farinha de trigo","Margarina ou Manteiga","Fermento em pó"};
    final String[] torta_sardinha ={"Leite","Farinha de trigo","Fermento em pó","Sardinha"};
    final String[] biscoito_maizena ={"Amido de Milho","Farinha de trigo","Margarina ou Manteiga"};
    final String[] quibe_frito ={"Carne Moída","Farinha de trigo","Margarina ou Manteiga"};
    final String[] empadao2 ={"Ovo","Farinha de trigo","Margarina ou Manteiga"};
    final String[] cueca_virada ={"Ovo","Farinha","Margarina ou Manteiga","Leite"};
    final String[] torta_salgada_frango ={"Ovo","Farinha de trigo","Margarina ou Manteiga","Leite","Fermento em pó"};
    final String[] lanche_agridoce ={"Pão de forma","Patê de Frango","Patê de Presunto","Leite"};
    final String[] sanduiche_de_forno ={"Pão de forma","Leite","Queijo Muçarela","Presunto"};
    final String[] biscoito_polvilho ={"Polvilho doce","Ovo","Margarina ou Manteiga"};
    final String[] sanduiche_cremoso_forno ={"Pão de forma","Presunto","Queijo Muçarela","Molho de tomate","Leite"};
    final String[] rosca_leite_condensado ={"Fermento em pó","Ovo","Leite Condensado","Farinha de trigo","Leite"};
    final String[] esfirra ={"Fermento biológico","Ovo","Farinha de trigo","Leite"};
    final String[] estrogonofe_carne ={"Alcatra"};
    final String[] atum_forno ={"Atum","Queijo Muçarela"};
    final String[] coxa_ervas ={"Coxa de Frango","Farinha de Rosca"};
    final String[] macarrao_requeijao_maionese ={"Macarrão","Queijo Muçarela","Requeijão cremoso"};
    final String[] pizza_dois_queijos ={"Fermento biológico","Farinha de trigo","Queijo Muçarela"};
    final String[] salada_camarao ={"Camarão"};
    final String[] lasanha4queijos ={"Queijo Muçarela","Massa de Lasanha","Farinha de trigo","Creme de leite","Leite"};
    final String[] panqueca4queijos ={"Queijo Muçarela","Requeijão cremoso","Farinha de trigo","Leite"};
    final String[] hamburger_cebola ={"Carne Moída","Farinha de trigo","Leite"};
    final String[] coccote_ovo ={"Peito de Peru","Ovo","Creme de leite"};
    final String[] bolinho_carne ={"Carne Moída","Ovo","Farinha de trigo","Batata"};
    final String[] carne_panela2 ={"Alcatra"};
    final String[] arroz_muss ={"Arroz","Queijo Muçarela","Ovo","Leite","Requeijão"};
    final String[] talharim_abob ={"Macarrão","Abobrinha","Cebola"};
    final String[] espaguete_bol ={"Macarrão","Molho de tomate"};
    final String[] macarrao_arom ={"Macarrão","Cebola","Manjericão","Salsa(ou salsinha)"};
    final String[] maminha_assada ={"Maminha","Manjericão"};
    final String[] costela_mandioca ={"Costela Suína","Mandioca"};
    final String[] lombo_batata ={"Lombo Suíno","Batata","Maionese"};
    final String[] macarro_salame ={"Macarrão","Salame","Cebola","Extrato de Tomate","Margarina ou Manteiga"};
    final String[] macarro_calabresa ={"Macarrão","Calabresa","Cebola","Molho de Tomate","Creme de Leite"};
    final String[] pao_calabresa ={"Ovo","Calabresa","Farinha de Trigo","Fermento biológico"};
    final String[] rocambole_carne ={"Carne Moída","Cebola","Queijo Muçarela"};
    final String[] siricaia ={"Ovo","Açucar","Farinha de Trigo","Margarina ou Manteiga"};
    final String[] abacaxi_gelado ={"Abacaxi","Açucar","Gelatina em pó","Creme de Leite"};














    public ArrayList<String> pesquisa(String tipo,ArrayList<String> itensSelecionadosTotais) {
        final ArrayList<String> receitasSelecionadas = new ArrayList<String>();



       switch (tipo){
           case "cafe_da_manha":

               final String[][]  receitas = {misto_quente, cachorro_quente, sanduiche_frango_pasta, cachorro_quente_de_forno, omelete_de_forno, cuscuz_de_tapioca,
                       ovos_mexidos_com_leite, waffle, crepe_suico, torrada_que_pre_ovo, panqueca_americana, cafe_cremoso, pao_de_queijo_liquidificador,
                       pao_de_queijo_sanduicheira, bolinho_de_chuva, bolinhos_de_batata, tiras_frango_mostarda, panquecas_nutella, pizza_enrolada, batata_doce_frita, hamburguer,
                       pizza_hamburguer, pao_alho, bolinhas_queijo, sanduiche_beirute, sanduiche_sem_gluten, bolo_mandioca, bolo_liquidificador, bolo_chocolate_sem_farinha, capuccino, bolo_laranja,pao_batata,salada_camarao,
                       panqueca4queijos,hamburger_cebola,coccote_ovo,bolinho_carne,pao_calabresa,rocambole_carne};
               final String[] nomeReceitas = {"Misto Quente", "Cachorro Quente", "Sanduíche de frango com pasta de queijo", "Cachorro quente de forno", "Omelete de forno", "Cuscuz de Tapioca",
                       "Ovos Mexidos", "Waffle", "Crepe Suiço", "Torrada com queijo, presunto e ovo", "Torrada com queijo, presunto e ovo", "Panqueca Americana", "Café Cremoso", "Pão de queijo no liquidificador",
                       "Pão de queijo de sanduicheira", "Bolinhos de Chuva", "Bolinhos de batata", "Tiras de frango crocantes com molho de mostarda", "Panquecas americanas recheadas de nutella", "Pizza enrolada", "Batata doce frita"
                       , "Hambúrguer", "Pizza de hambúrguer", "Pão com alho", "Bolinhas de queijo", "Sanduíche Beirute", "Sanduíche sem Glúten", "Bolo de Mandioca", "Bolo Rápido de Liquidificador", "Bolo de Chocolate sem Farinha"
                       , "Capuccino", "Bolo de Cenoura com Cobertura de Chocolate", "Bolo de Laranja","Pão de Batata","Salada de Melão e Camarão","Panqueca aos Quatro Queijos","Hambúrguer com Cebola","Cocotte de ovo","Bolinho de Carne",
                        "Pão de Calabresa","Rocambole de Carne"};
               for (int i = 0; i < receitas.length; i++) {
                   Procura(receitas[i], itensSelecionadosTotais, receitasSelecionadas, nomeReceitas[i]);
               }

               break;
           case "almoco":

               final String[][] receitasAlmoco = {macarrao_molho_queijo, carne_panela_simples, macarrao_pressao, frango_molho_tomate, risoto_frango, moqueca_ovos, almodegas_carne_moida, salmao_alema,
                       file_frango_recheado, farofa_carne_sol, bife_milanesa, carne_assada_pressao, carne_panela, bife_acebolado_maionese, bacalhau_desfiado, frango_cacadora, file_merluza_frito, yakissoba,
                       estrogonofe_frango, sobrecoxa_frango, baguetinha_frango_requeijao, lasanha_bolonhesa_frango, risoto_pressao, frango_oriental_laranja, frango_parmefiana_fritura, frango_xadrez_forno, frango_xadrez,
                       macarrão_coco_frango, espaguete_bacon_abobrinha,estrogonofe_carne,atum_forno,coxa_ervas,macarrao_requeijao_maionese,pizza_dois_queijos,salada_camarao,lasanha4queijos,panqueca4queijos,hamburger_cebola,
                       coccote_ovo,bolinho_carne,carne_panela2,arroz_muss,talharim_abob,espaguete_bol,macarrao_arom,maminha_assada,costela_mandioca,lombo_batata,macarro_salame,macarro_calabresa,rocambole_carne};
               final String[] nomeReceitasAlmoco = {"Macarrão com molho de queijo", "Carne de Panela Simples", "Macarrão de panela de pressão", "Frango ao molho de tomate", "Risoto simples de frango",
                       "Moqueca de ovos", "Almôdegas de carne moída", "Salmão à moda Alemã", "Filé de frango recheado", "Farofa de Carne do Sol", "Bife à Milanesa", "Carne assada na panela de pressão", "Carne de Panela",
                       "Bife Acebolado com molho de Maionese", "Bacalhau Desfiado", "Frango à caçadora", "Filé de Merluza frito", "Yakissoba", "Estrogonofe de Frango", "Sobrecoxa de Frango", "Baguetinha de Frango com Requeijão",
                       "Lasanha de Frigideira com Molho Bolonhesa de Frango", "Risoto de Panela de Pressão", "Frango Oriental ao Molho de Laranja", "Frango à Parmegiana sem Fritura", "Frango Xadrez de Forno", "Frango Xadrez",
                       "Macarrão com Leite de Coco e Frango", "Espaguete com Bacon e Abobrinha","Estrogonofe de Carne","Atum ao Forno","Coxa de frango com ervas","Macarrão com molho de requeijão e maionese","Pizza dois queijos"
                       ,"Salada de Melão e Camarão","Lasanha aos Quatro Queijos(o outros 3 são variados)","Panqueca aos Quatro Queijos","Hambúrguer com Cebola","Cocotte de ovo","Bolinho de Carne","Carne de Panela(Alcatra)","Arroz de Forno",
                       "Talharim com Abobrinha","Espaguete à bolonhesa","Macarrão aromático","Maminha Assada","Costela com Mandioca","Lombo assado com batata e maionese","Macarrão com Salame","Macarrão com Calabresa","Rocambole de Carne"};
               for (int i = 0; i < receitasAlmoco.length; i++) {
                   Procura(receitasAlmoco[i], itensSelecionadosTotais, receitasSelecionadas, nomeReceitasAlmoco[i]);
               }

               break;
           case "sobremesa":
               final String[][] receitasSobremesa = {musse_pe_cho, bolo_mandioca, bolo_liquidificador, danoninho_caseiro, nega_maluca, nega_maluca2, torta_leite_avela, bolinho_de_chuva, mousse_chocolate
                       , bolo_chocolate_sem_farinha, bombom_aberto, smoothie_morango, chocolate_quente_creme, mousse_limao, capuccino, sorvete, brigadeirao, bolo_cenoura, bolo_laranja,pipoca_doce,pe_de_moleque_cond,mousse_abacaxi,prestigio,
                       torta_bis,bombocado,torta_gelada_amendoim,taca_chocolate_bolacha,cremoso_morango,arroz_doce_crem,brigadeiro_micro,smoothie_frutas,flan_pessego,torta_brig_choc_bis,beijinho_micro,frape_cafe,waffle,siricaia,abacaxi_gelado};
               final String[] nomeReceitasSobremesa = {"Musse com Pé de Moleque e Chocolate", "Bolo de Mandioca", "Bolo Rápido de Liquidificador", "Danoninho Caseiro", "Nega Maluca", "Nega Maluca", "Torta de Leite em Pó com Creme de Avelã",
                       "Bolinhos de Chuva", "Mousse de chocolate", "Bolo de Chocolate sem Farinha", "Bombom Aberto", "Smoothie Bowl de Morango", "Chocolate Quente Cremoso", "Mousse de Limão", "Capuccino", "Sorvete", "Brigadeirão",
                       "Bolo de Cenoura com Cobertura de Chocolate", "Bolo de Laranja","Pipoca Doce","Pé de Moleque de Leite Condensado","Mousse de Abacaxi","Prestígio Gelado","Torta Gelada de Bis","Bombocado","Torta Gelada de Amendoim"
                        ,"Taça de Chocolates, Bolachas e Chantilly","Super Cremoso de Morango","Arroz Doce Cremoso","Brigadeiro de Microondas","Smoothie de Frutas","Flan de Pêssego","Torta de Brigadeiro, Chocolate e Bis","Beijinho de Microondas",
                        "Frapê de Café","Waffle","Siricaia","Abacaxi Gelado"};
               for (int i = 0; i < receitasSobremesa.length; i++) {
                   Procura(receitasSobremesa[i], itensSelecionadosTotais, receitasSelecionadas, nomeReceitasSobremesa[i]);
               }
               break;
           case "lanche":
               final String[][] receitasLanche = {torta_salgada_liq,torta_frango,coxinha,bolinho_de_chuva,pipoca_doce,empadao,torta_frango_crem,coxinha_frango,misto_quente,joelho,lanche_rapido,biscoito_amanteigado,
                       pao_batata,sanduiche_natural, enroladinho_salsicha,pao_mel,risolis,cachorro_quente,cookies,rosquinhas,torta_sardinha,biscoito_maizena,quibe_frito,bolinhas_queijo,empadao2,cueca_virada,waffle,
                       pizza_hamburguer,pao_de_queijo_liquidificador,torta_salgada_frango,lanche_agridoce,sanduiche_de_forno,biscoito_polvilho,sanduiche_cremoso_forno,rosca_leite_condensado,esfirra,hamburger_cebola,coccote_ovo,bolinho_carne};
               final String[] nomeReceitasLanche = {"Torta Salgada de Liquidificador","Torta de Frango","Coxinha","Bolinho de chuva","Pipoca Doce","Empadão","Torta de Frango Cremosa","Coxinha de Frango","Misto Quente","Joelho","Lanche Rápido",
               "Biscoitos Amanteigados","Pão de Batata","Sanduíche Natural","Enroladinho de Salsicha","Pão de Mel","Risólis","Cachorro Quente","Cookies","Rosquinhas","Torta de Sardinha","Biscoito de Maizena","Quibe Frito","Bolinhas de queijo",
               "Massa de Empadão","Cueca Virada","Waffle","Pizza de hambúrguer","Pão de queijo no liquidificador","Torta Salgada de Frango","Lanche Agridoce","Sanduíche de Forno","Biscoito de Polvilho","Sanduíche Cremoso de Forno","Rosca de Leite Condensado"
                       ,"Esfirra","Hambúrguer com Cebola","Cocotte de ovo","Bolinho de Carne"};
               for (int i = 0; i < receitasLanche.length; i++) {
                   Procura(receitasLanche[i], itensSelecionadosTotais, receitasSelecionadas, nomeReceitasLanche[i]);
               }
               break;
       }
        return receitasSelecionadas;

    }
    public void Procura(final String[] receitaProcurada,ArrayList<String> itensSelecionadosTotais,final ArrayList<String> receitasSelecionadas,String nomeDaReceita){
        int i,igual=0;

        for(i=0;i<receitaProcurada.length;i++){
            if(itensSelecionadosTotais.contains(receitaProcurada[i])){
                igual++;
            }
        }
            if (igual == (receitaProcurada.length)) {
                receitasSelecionadas.add(nomeDaReceita);
            }

    }
}
