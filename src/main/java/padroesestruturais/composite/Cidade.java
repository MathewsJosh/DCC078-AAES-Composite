package padroesestruturais.composite;

public class Cidade {

    private String nome_cidade;
    private CEP cep;

    public void setCEP(CEP cep) {
        this.cep = cep;
    }

    public void setNomeCidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public String getCEP() {
        if (this.cep == null) {
            throw new NullPointerException("Cidade sem CEP!");
        }
        return this.cep.getCEPContent();
    }

    public String getNomeCidade() {
        if (this.nome_cidade == null) {
            throw new NullPointerException("Cidade sem nome!");
        }
        return this.nome_cidade;
    }
}
