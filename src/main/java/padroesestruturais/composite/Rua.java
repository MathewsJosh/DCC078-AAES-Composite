package padroesestruturais.composite;

public class Rua extends CEP {

    private String nome;

    public Rua(String cep, String nome) {
        super(cep);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return "Rua: " + this.getCEP() + " - nome: " + this.nome + "\n";
    }

    @Override
    public String getCEPContent() {
        return this.getRua();
    }
}
