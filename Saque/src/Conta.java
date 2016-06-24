
public class Conta {
	    int numero;
		String dono;
		double Saldo;
		double limite;

	public void transfere(Conta destino, double valor) {
           this.Saldo = this.Saldo - valor; 
           destino.Saldo = destino.Saldo + valor;
           System.out.println("Saldo da conta que foi depositada -------->" + destino.Saldo);
           System.out.println("Saldo da conta que foi retirada -------->"+this.Saldo);
        		  
	}      
	}
       



