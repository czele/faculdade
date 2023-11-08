import java.util.ArrayList;

public class Atendente extends Pessoa {
    int idAtendente;
    ArrayList<Cliente> clientes;
    ArrayList<SolicitacaoServico> solicitacaoServicos;

    public Atendente(String nome, String cpf, int idAtendente) {
        super(nome, cpf);
        this.idAtendente = idAtendente;
        this.clientes = new ArrayList<Cliente>();
        this.solicitacaoServicos = new ArrayList<SolicitacaoServico>();
    }

    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("ID do Atendente: " + this.idAtendente);
    }

    void registraInformacao() {
        System.out.println("Registrada!");
    }

    void registraSolicitacao() {
    }

    void registraServico() {
    }
}

