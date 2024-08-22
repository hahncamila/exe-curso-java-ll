package br.com.syonet;

import java.util.List;

public class Filial {
    private String nome;
    private String endereco;
    private String cidade;
    private String codigoPostal;
    private List<Integer> visitasMensais;
    private int visitasAnuais;
    private String geolocalizacao;

    public Filial(String nome, String endereco, String cidade, String codigoPostal, List<Integer> visitasMensais, int visitasAnuais, String geolocalizacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.codigoPostal = codigoPostal;
        this.visitasMensais = visitasMensais;
        this.visitasAnuais = visitasAnuais;
        this.geolocalizacao = geolocalizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public List<Integer> getVisitasMensais() {
        return visitasMensais;
    }

    public int getVisitasAnuais() {
        return visitasAnuais;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public double calcularMediaMensal() {
        return visitasMensais.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
