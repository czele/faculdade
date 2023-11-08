public class TesteProjeto {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Camila", "35353535", "Rua 1", "999999999");
        Atendente atendente = new Atendente("Lucas", "2020202020", 3);
        Tecnico tecnico = new Tecnico("Maria", "555555555", "888888888888", 100);
        SolicitacaoServico solicitacao = new SolicitacaoServico(50000, "30/10/2023", "31/10/2023", "10/11/2023");
        Servico servico = new Servico(1, "teste",800);  
        Material material = new Material(1, "teste2", 2500);
        
        System.out.println("Informações do Cliente:");
        cliente.exibeInformacoes();

        System.out.println("Informações do Atendente:");
        atendente.exibeInformacoes();

        System.out.println("Informações do Técnico:");
        tecnico.exibeInformacoes();
        
        System.out.println("Informações da Solicitação de Serviço:");
        solicitacao.exibeInformacoes();

        System.out.println("Informações de Serviço:");
        servico.exibeInformacoes();
        
        System.out.println("Informações de Material:");
        material.exibeInformacoes();
    }
}
