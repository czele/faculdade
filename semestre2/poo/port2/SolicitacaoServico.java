import java.util.ArrayList;

public class SolicitacaoServico {
    int idSolicitacao;
    String dataSolicitacao;
    String dataInicio;
    String dataTermino;
    
    public SolicitacaoServico(int idSolicitacao, String dataSolicitacao, String dataInicio, String dataTermino){
        this.idSolicitacao = idSolicitacao;
        this.dataSolicitacao = dataSolicitacao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }
    
    Tecnico tecnico;
    Atendente atendente;
    Cliente cliente;
    ArrayList<Material> materiais;
    ArrayList<Servico> servicos;

    public void exibeInformacoes() {
        System.out.println("Solicitação: " + this.idSolicitacao);
        System.out.println("Data de solicitação: " + this.dataSolicitacao);
        System.out.println("Início de solicitação: " + this.dataInicio);
        System.out.println("Término de solicitação: " + this.dataTermino);
    }

    public void materialUtilizado() {
        System.out.println("Material: ");
    }

    public void exibirCliente() {
        System.out.println("Cliente: ");
    }

    public void exibirTecnico() {
        System.out.println("Tecnico: ");
    }

    public void exibeAtendente() {
        System.out.println("Atendente: ");
    }
}
