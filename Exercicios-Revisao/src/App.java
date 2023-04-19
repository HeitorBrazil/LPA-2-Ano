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
    }
}
