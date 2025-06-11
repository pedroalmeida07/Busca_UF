public class UF {
    String nome;
    String sigla;
    String regiao;

    public UF(String nome, String sigla, String regiao){
        this.nome = nome;
        this.sigla = sigla;
        this.regiao = regiao;
    }

    public String toString(){
        String txt = String.format("Nome: %s\nSigla: %s\nRegião: %s", nome, sigla, regiao);
        return txt;
    }
}
