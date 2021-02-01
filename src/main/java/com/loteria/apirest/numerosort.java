package com.loteria.apirest;

import java.util.*;

public class numerosort {
    Random random = new Random();

    public String GerarNumero() {

        List<Integer> sorteio  = new ArrayList<Integer>(60);//
        for (int i = 1; i <= 60; i++)
            sorteio.add(i);

        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            Collections.shuffle(sorteio);
            int index = random.nextInt(sorteio.size());
            numeros[i] = (int) sorteio.remove(index);
        }
        return Arrays.toString(numeros).replace("[", "").replace("]", "");
    }

}
