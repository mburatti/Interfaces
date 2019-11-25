public class Gerente implements CalculoAumento{
	Funcionario func;
	
	public Gerente(double salario) {
		func = new Funcionario();
		func.setSalario(salario);
		func.setListener(this);
		func.novoSalario();
	}
	
	

	@Override
	public String toString() {
		return "Gerente [" + (func != null ? "func=" + func.getSalario() : "") + "]";
	}



	@Override
	public double CalcularAumento(double salario) {
		salario *= 1.2;
		System.out.println(salario);
		return salario;
	}

}
