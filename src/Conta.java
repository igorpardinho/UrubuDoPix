
import java.util.List;

public class Conta {

    private String nome;

    private Double saldo = 0.0;

    private Integer id = 0;



    public Double deposito(Double value){

        return saldo += value *(10);
    }

    public Double saque(Double value){
        Double result = 0.0;
        if(value > saldo){
            System.out.println("Valor indisponivel para saque");
        }else{
           result = saldo -= value;
        }
        return result;
    }

    public void mostrarContas(List<Conta> contas){
            for (Conta conta: contas ){
                System.out.println(conta);
            }

    }

    public Conta(){

    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", saldo=" + saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
