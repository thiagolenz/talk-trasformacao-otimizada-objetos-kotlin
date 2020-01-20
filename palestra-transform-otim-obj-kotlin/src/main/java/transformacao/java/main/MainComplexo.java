package transformacao.java.main;

import transformacao.java.dtoscomplexos.conversores.VendaConversor;

public class MainComplexo {
    public static void main(String[] args) {
        System.out.println(new VendaConversor().toDTO(null));
    }
}
