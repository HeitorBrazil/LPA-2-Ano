import Classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa p = new Pessoa();
        p.setCpf("111.111.111-11");
        p.setNome("Huyra");
        p.setIdade(28);
        p.setPeso(85.6);

        System.out.println(p);
    }
}
