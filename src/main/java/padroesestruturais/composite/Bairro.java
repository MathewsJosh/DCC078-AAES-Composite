package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Bairro extends CEP {

    private List<CEP> CEPS;

    public Bairro(String descricao) {
        super(descricao);
        this.CEPS = new ArrayList<CEP>();
    }

    public void addConteudo(CEP CEP) {
        this.CEPS.add(CEP);
    }

    public String getCEPContent() {
        String saida = "";
        saida = "Bairro: " + this.getCEP() + "\n";
        for (CEP CEP : CEPS) {
            saida += CEP.getCEPContent();
        }
        return saida;
    }
}
