package br.com.syonet;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String caminhoArquivo = "src/main/java/resources/dados.csv";

        try {
            List<Filial> filiais = FilialReader.lerFiliais(caminhoArquivo);

            Filial filialComMaiorMedia = filiais.stream()
                .max((f1, f2) -> Double.compare(f1.calcularMediaMensal(), f2.calcularMediaMensal()))
                .orElse(null);

            if (filialComMaiorMedia != null) {
                System.out.println("Filial com a maior média de visitas: " + filialComMaiorMedia.getNome());
                System.out.println("Média Mensal: " + filialComMaiorMedia.calcularMediaMensal());
            } else {
                System.out.println("Nenhuma filial encontrada.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
