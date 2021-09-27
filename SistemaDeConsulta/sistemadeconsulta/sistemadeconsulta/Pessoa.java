public class Pessoa {

    private String nome;
    private String cpf;
    private byte interesse;

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public byte getInteresse() {
        return interesse;
    }

    
    public void setInteresse(byte interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString() {
     String texto;
     switch(this.interesse){
         case 1:
            texto = "Pagamento de Conta";
            break;
        case 2:
            texto = "Recebimento de Salário";
            break;
        default:
            texto = "Outra Operação";
     }
     return "\nNome: " + nome + ". CPF: " + cpf + ". interesse: " + texto + "}";
    }
}
