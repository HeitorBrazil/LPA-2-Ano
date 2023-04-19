import java.util.Calendar;
import java.util.Scanner;

import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        Calendar dtNasc = Calendar.getInstance();
        
        System.out.print("Insira o ano de nascimento: ");
        int anoNasc = tec.nextInt();
        System.out.print("Insira o mes de nascimento: ");
        int mesNasc = tec.nextInt();
        System.out.print("Insira o dia de nascimento: ");
        int diaNasc = tec.nextInt();
        dtNasc.set(Calendar.YEAR, anoNasc);
        dtNasc.set(Calendar.MONTH, mesNasc);
        dtNasc.set(Calendar.DAY_OF_MONTH, diaNasc);

        char[] uf = new char[2];

        uf[0] = 's';
        uf[1] = 'p';

        int[] CPF = {5,1,5,6,7,0,0,6,8,3,3};

        int[][] numeros = new int[2][2];

        numeros[0][0] = 2;
        numeros[1][0] = 2;
        numeros[0][1] = 2;
        numeros[1][1] = 2;

        PessoaFisica pf = new PessoaFisica("Naur", dtNasc, uf, numeros, CPF);

        System.out.println(pf.toString());
    }
}
