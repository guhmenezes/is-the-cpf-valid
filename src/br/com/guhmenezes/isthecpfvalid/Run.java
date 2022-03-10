package br.com.guhmenezes.isthecpfvalid;

import javax.swing.*;

public class Run {

    public static void main(String[] args) {
        while (true) {

            String cpf = JOptionPane.showInputDialog(null,
                    "Digite o CPF:", "O CPF é Válido?", JOptionPane.PLAIN_MESSAGE);

            if (cpf == null)
                break;

            String[] vector = cpf.split("");

            CheckCpf requestedCpf = new CheckCpf();
            requestedCpf.check(vector);

        }
    }
}
