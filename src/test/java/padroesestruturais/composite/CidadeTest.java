package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarCEPCidade() {
        Bairro bairro1 = new Bairro("Zona Norte");

        Bairro bairro2 = new Bairro("Zona Sul");
        Rua rua21 = new Rua("372312", "Banana Lima");
        bairro2.addConteudo(rua21);

        Bairro bairro3 = new Bairro("COHAB");
        Rua rua31 = new Rua("234823", "Florenca de Minas");
        Rua rua32 = new Rua("123982", "Divinopolis do Araguaia");
        bairro3.addConteudo(rua31);
        bairro3.addConteudo(rua32);

        Bairro regiao = new Bairro("Nobre");
        regiao.addConteudo(bairro1);
        regiao.addConteudo(bairro2);
        regiao.addConteudo(bairro3);

        Cidade cidade = new Cidade();
        cidade.setCEP(regiao);

        assertEquals("Bairro: Nobre\n" +
                "Bairro: Zona Norte\n" +
                "Bairro: Zona Sul\n" +
                "Rua: 372312 - nome: Banana Lima\n" +
                "Bairro: COHAB\n" +
                "Rua: 234823 - nome: Florenca de Minas\n" +
                "Rua: 123982 - nome: Divinopolis do Araguaia\n", cidade.getCEP());
    }

    @Test
    void deveRetornarExecacaoCidadeSemCEP() {
        try {
            Cidade cidade = new Cidade();
            cidade.getCEP();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cidade sem CEP!", e.getMessage());
        }
    }
}