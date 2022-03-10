package br.com.guhmenezes.isthecpfvalid;

import javax.swing.*;

public class CheckCpf {

    private int firstVerify;
    private int secondVerify;

    public void check(String[] vector){
        for (int i = 0; i < vector.length -2; i++ )
            firstVerify += Integer.parseInt(vector[i])*(i+1);

        if (firstVerify % 11 == 10) firstVerify = 0;
        boolean firstDigit = firstVerify % 11 == Integer.parseInt(vector[9]);

        for (int i = 0; i < vector.length -1; i++ )
            secondVerify += Integer.parseInt(vector[i])* i;

        if (secondVerify % 11 == 10) secondVerify = 0;
        boolean secondDigit = secondVerify % 11 == Integer.parseInt(vector[10]);

        if (firstDigit && secondDigit)
            JOptionPane.showMessageDialog(null,
                    "O CPF informado é válido.", "CPF Válido", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                    "O CPF informado NÃO é válido.", "CPF Inválido", JOptionPane.ERROR_MESSAGE);
    }


}
