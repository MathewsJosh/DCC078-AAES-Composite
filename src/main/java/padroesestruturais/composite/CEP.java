package padroesestruturais.composite;

public abstract class CEP {

    private String cep;

    public CEP(String cep) {
        this.cep = cep;
    }

    public String getCEP() {
        return String.valueOf(cep);
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public abstract String getCEPContent();
}
