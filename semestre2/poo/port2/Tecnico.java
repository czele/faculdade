import java.util.ArrayList;

public class Tecnico extends Pessoa {
    String telefone;
    int idTecnico;
    ArrayList<Servico> servicos;
    ArrayList<SolicitacaoServico> solicitacaoServicos;

    public Tecnico(String nome, String cpf, String telefone, int idTecnico) {
        super(nome, cpf);
        this.telefone = telefone;
        this.idTecnico = idTecnico;
        this.servicos = new ArrayList<Servico>();
        this.solicitacaoServicos = new ArrayList<SolicitacaoServico>();
    }

    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("ID do Técnico: " + this.idTecnico);
    }

    public void registraInicio() {
        System.out.println("Registrado Inicio");
    }

    public void registraConclusao() {
        System.out.println("Concluido!");
    }

    public void realizaServico() {
        System.out.println("Realizando serviço");
    }
}