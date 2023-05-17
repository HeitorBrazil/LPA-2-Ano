import java.util.ArrayList;
import java.util.Scanner;
import objects.*;

public class Main {

	static ArrayList<Item> objetosDaLista = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Master lista telefonica by IFBirds");
		while(true) {
			ShowMenu();
			int selectedOption = GetMenuOption();
			switch (selectedOption) {
				case 1: {
					System.out.println("Opção 1.");
					listarTelefones();
					break;
				}
				case 2: {
					System.out.println("Opção 2.");
					cadastrarTelefone();
					break;
				}
				case 3: {
					System.out.println("Opção 3.");
					editarTelefone();
					break;
				}
				case 4: {
					System.out.println("Opção 4.");
					removerTelefone();
					break;
				}
				case 5: {
					System.out.println("Opção 5.");
					procurarTelefone();
					break;
				}
				case 6: {
					break;
				}
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}		
	}

	private static void procurarTelefone() {
		Scanner tec = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-\nInsira o telefone de busca: ");
        String tel = tec.nextLine();

        for (Item item : objetosDaLista) {
            
            if (item.getTelefone().equals(tel)) {
                System.out.println("Contato encontrado!");
                System.out.println(item);
                return;
            }
        }
        System.out.println("Contato não encontrado!");
		
	}

	private static void removerTelefone() {
		Scanner tec = new Scanner(System.in);
        System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-\nInsira o nome do contato que gostaria de remover: ");
        String removed = tec.nextLine();
        for (Item item : objetosDaLista) {
            
            String nome = item.getDonoEndereco();
            
            if (nome.equals(removed)) {
                objetosDaLista.remove(item);
                System.out.println("Contato removido!");
                return;    
            }
        }
        System.out.println("Contato não foi encontrado!");
	}

	private static void editarTelefone() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrarTelefone() {
        Scanner tec = new Scanner(System.in);
        System.out.print("-=-=-=-=-=-=-=-=-=-=-=-=-\nInsira o nome do contato: ");
        String donoEndereco = tec.nextLine();
        
        System.out.print("Insira o endereço do contato: ");
        String endereco = tec.nextLine();
        
        System.out.print("Insira o telefone do contato: ");
        String telefone = tec.nextLine();

        int id = objetosDaLista.size() + 1;
        
        Item cad = new Item(id, telefone, endereco, donoEndereco);

        objetosDaLista.add(cad);
	}

	private static void listarTelefones() {
        for (Item item : objetosDaLista) {
            System.out.println(item);
        }
	}

	private static void ShowMenu() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-\nPor favor selecione uma das opções");
		System.out.println("1 - Listar");
		System.out.println("2 - Cadastrar");
		System.out.println("3 - Editar");
		System.out.println("4 - Remover");
		System.out.println("5 - Procurar");
	}
	
	private static int GetMenuOption(){
		Scanner tec = new Scanner(System.in);
	    return tec.nextInt();
	}

}
