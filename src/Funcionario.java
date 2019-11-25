
public class Funcionario {
	private double salario = 0;
	private CalculoAumento listener;
	
	public void novoSalario() {
		if(listener != null) {
			salario *= 1.1;	
			listener.CalcularAumento(salario);
		}		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public CalculoAumento getListener() {
		return listener;
	}

	public void setListener(CalculoAumento listener) {
		this.listener = listener;
	}

	public Funcionario(double salario) {
		super();
		this.salario = salario;
		
	}

	public Funcionario() {
		super();
		this.salario=0;
	}
	
}
