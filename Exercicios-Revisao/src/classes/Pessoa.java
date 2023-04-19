package classes;

import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;

public abstract class Pessoa {
    private String nome;
    private Calendar dtNasc;
    private char[] uf = new char[2];
    private int[][] numeros = new int[2][2];
    private boolean validado;
    
    public Pessoa(String nome, Calendar dtNasc, char[] uf, int[][] numeros) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.uf = uf;
        this.numeros = numeros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Calendar dtNasc) {
        this.dtNasc = dtNasc;
    }

    public char[] getUf() {
        return uf;
    }

    public void setUf(char[] uf) {
        this.uf = uf;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[][] numeros) {
        this.numeros = numeros;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    @Override
    public String toString() {
        String numeros = "";
        for (int i = 0; i < numeros.length(); i++) {
            numeros += " - ";
            for (int j = 0; j < this.numeros[0].length; j++) {
                numeros += this.numeros[i][j] + " ";
            }
        }

        return "Nome: " + nome + 
        "\nData Nascimento: " + dtNasc.get(Calendar.DAY_OF_MONTH) + "/" + dtNasc.get(Calendar.MONTH) + "/" + dtNasc.get(Calendar.YEAR) +
        "\nNumeros: " + numeros +
        "\nUF: " + Arrays.toString(uf);
    }
    
    public abstract boolean validaCad();

    protected boolean vencerPromo() {
        int idade = this.calcIdade();
        if(idade >= 21 && this.validaCad()) {
            if((this.numeros[0][0] + this.numeros[1][1]) == (this.numeros[0][1] + this.numeros[1][0]))
                return true;
            else
                return false;
        }

        return false;
    }

    private int calcIdade() {
        int idade, anoAtual, anoNasc;
        Calendar dtAtual = Calendar.getInstance();
        anoAtual = dtAtual.get(Calendar.YEAR);
        anoNasc = this.dtNasc.get(Calendar.YEAR);
        return idade = anoAtual - anoNasc;
    }
}
