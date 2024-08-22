package com.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    public static List<String[]> lerCSV(String caminhoArquivo) throws IOException {
        List<String[]> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");
                linhas.add(valores);
            }
        }
        return linhas;
    }
}
