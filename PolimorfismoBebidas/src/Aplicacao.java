
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		LeiteQuente leiteQuente = new LeiteQuente();
		Refrigerante refrigerante = new Refrigerante();
		
		preparador.prepararBebida(leiteQuente);
		preparador.prepararBebida(refrigerante);
		
		
		
	}

}
