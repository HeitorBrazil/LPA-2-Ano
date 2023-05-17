package objects;

public class Item {

	private int id;
	private String telefone;
	private String endereco;
	private String donoEndereco;

    public Item(int id, String telefone, String endereco, String donoEndereco) {
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
        this.donoEndereco = donoEndereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDonoEndereco() {
        return donoEndereco;
    }

    public void setDonoEndereco(String donoEndereco) {
        this.donoEndereco = donoEndereco;
    }

    @Override
    public String toString() {
        return "-=-=-=-=-=-=-=-=-=-=-=-=-\nNome: " + donoEndereco + "\nEndereco: " + endereco + "\nTelefone: " + telefone;
    }	

}
