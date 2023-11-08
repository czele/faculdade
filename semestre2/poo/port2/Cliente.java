public class Cliente extends Pessoa {
    String endereco;
    String telefone;

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
    }
}
