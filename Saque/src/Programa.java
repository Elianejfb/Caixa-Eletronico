public class Programa {
double Salario;
public static void main(String[] args) {
// TODO Auto-generated method stub
	Conta minhaConta;
	minhaConta = new Conta();
	minhaConta.Saldo = 1800;
	Conta Continha;
	Continha = new Conta();
	minhaConta.transfere(Continha, 700);	
	minhaConta.transfere(Continha, 100);
	//Continha.saca(200);
    //System.out.println("Objeto Continha -------->"+Continha.saldo);

}
}
	
