package classes;

import java.util.Calendar;

public class PessoaFisica extends Pessoa {
    private int[] CPF = new int[14];

    public PessoaFisica(String nome, Calendar dtNasc, char[] uf, int[][] numeros, int[] CPF) {
        super(nome, dtNasc, uf, numeros);
        this.CPF = CPF;
        this.setValidado(this.validaCad());
    }

    @Override
    public boolean validaCad() {
        int soma = 0;
        int numMult = 2;
        int digito1, digito2;
        for (int i = 0; i < 9; i++) {
            soma += this.CPF[i] * numMult;
            numMult++;
        }
        int rest = soma % 11;

        if(rest < 2)
            digito1 = 0;
        else
            digito1 = 11 - rest;

        if(digito1 == CPF[9]) {
            numMult = 3;
            soma = digito1 * 2;

            for (int i = 0; i < 9; i++) {
                soma += this.CPF[i] * numMult;
                numMult++;
            }

            rest = soma % 11;

            if(rest < 2)
                digito2 = 0;
            else
                digito2 = 11 - rest;
            
            if(digito2 == CPF[10])
                return true;
            else
                return false;
                
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String cpf = "";
        for (int i = 0; i < CPF.length; i++) {
            cpf = cpf + CPF[i];
        }

        return super.toString() +
        "\nValidado: " + this.isValidado() + 
        "\nGanhou o Sorteio: " + this.vencerPromo() + 
        "\nCPF: " + cpf;
    }
    
}
