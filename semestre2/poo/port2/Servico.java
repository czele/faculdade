import java.util.ArrayList;

public class Servico{
    int idServico;
    String descricaoS;
    float valor;
    
   public Servico(int idServico, String descricaoS,float valor){
        this.idServico = idServico;
        this.descricaoS = descricaoS;
        this.valor = valor;
    }
   
   public void exibeInformacoes(){
        System.out.println("Serviço: " + this.idServico);
        System.out.println("Descrição: " + this.descricaoS);
        System.out.println("Valor: " + this.valor);
        
        Tecnico tecnico;
        ArrayList<SolicitacaoServico> solicitacaoServicos; 
    }
   public void registrarMaterial(){
       System.out.println("Material:" + " registrado");
    }
   public void registrarTecnico(){
       System.out.println("Técnico:" + " registrado");
    }
    
}
