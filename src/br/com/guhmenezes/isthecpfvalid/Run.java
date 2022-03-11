package br.com.guhmenezes.isthecpfvalid;

import javax.swing.*;

public class Run {

    public static void main(String[] args) {
        while (true) {

            String input = JOptionPane.showInputDialog(null,
                    "Digite o CPF:", "O CPF é Válido?", JOptionPane.PLAIN_MESSAGE);

            if (input == null)
                break;

            String cpf = input.replaceAll("[^0-9]","");
            String[] vector;
            CheckCpf requestedCpf = new CheckCpf();

            if (cpf.length() == 11){

                vector = cpf.split("");
                requestedCpf.check(vector);

            } else {

                JOptionPane.showMessageDialog(null,
                        "Insira um CPF com 11 dígitos.", "Ops!", JOptionPane.ERROR_MESSAGE);

            }

        }

    }

}
