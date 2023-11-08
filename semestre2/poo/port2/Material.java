public class Material{
    int idMaterial;
    String descricaoMat;
    float valor;
    
    public Material(int idMaterial, String descricaoM, float valor){
        this.idMaterial = idMaterial; 
        this.descricaoMat = descricaoMat;
        this.valor = valor;
    }
    
    public void exibeInformacoes(){
        System.out.println("ID do Material: " + this.idMaterial);
        System.out.println("Descrição: " + this.descricaoMat);
        System.out.println("Valor: " + this.valor);
        
        SolicitacaoServico solicitacaoServico; 
    }
    
}
