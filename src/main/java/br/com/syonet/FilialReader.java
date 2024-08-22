package br.com.syonet;

import com.utils.CSVUtils; 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilialReader {

    public static List<Filial> lerFiliais(String caminhoArquivo) throws IOException {
        List<Filial> filiais = new ArrayList<>();
        List<String[]> linhas = CSVUtils.lerCSV(caminhoArquivo);

        for (int i = 1; i < linhas.size(); i++) {
            String[] linha = linhas.get(i);

            String nome = linha[0];
            String endereco = linha[1];
            String cidade = linha[2];
            String codigoPostal = linha[3];

            List<Integer> visitasMensais = new ArrayList<>();
            int visitasAnuais = 0;

            for (int j = 4; j < 16; j++) {
                try {
                    int visita = Integer.parseInt(linha[j].trim());
                    visitasMensais.add(visita);
                    visitasAnuais += visita;
                } catch (NumberFormatException e) {
                    visitasMensais.add(0);
                }
            }

            String geolocalizacao = linha[16];

            Filial filial = new Filial(nome, endereco, cidade, codigoPostal, visitasMensais, visitasAnuais, geolocalizacao);
            filiais.add(filial);
        }

        return filiais;
    }
}
