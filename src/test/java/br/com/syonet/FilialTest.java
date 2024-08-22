package br.com.syonet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilialTest {

    @Test
    public void testCalcularMediaMensal() {
        List<Integer> visitas = Arrays.asList(100, 150, 200, 120, 180, 130, 140, 170, 160, 110, 190, 210);
        Filial filial = new Filial("Filial A", "Rua A", "Cidade A", "12345", visitas, 0, "Geo A");
        
        double mediaEsperada = visitas.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        assertEquals(mediaEsperada, filial.calcularMediaMensal());
    }
}
