package br.com.msa.comida3;

/**
 * Created by Familia SA on 18/03/2017.
 */

public class Receitas implements Comparable<Receitas>{
    private String Nome;

    private String link;
    public Receitas(String Nome) {
        // TODO Auto-generated constructor stub
        this.Nome= Nome;


    }
    public Receitas(String Nome, String link){
        // TODO Auto-generated constructor stub
        this.Nome= Nome;
        this.link = link;
    }
    public String getNome() {
        return Nome;
    }

    public String getLink() {
        return link;
    }
    @Override
    public int compareTo(Receitas o) {
        if(this.Nome.compareTo(o.getNome())<0){
            return -1;
        }else if(this.Nome.compareTo(o.getNome())>0){
            return 1;

        }
        return 0;
    }
}
