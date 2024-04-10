public class Clientes {
	
	private String nome;
	private String cpf;
	private DataListaDois dataNascimento;
	
	public Clientes(String n, String c, DataListaDois dn) {
		this.nome = n;
		this.cpf = c;
		this.dataNascimento = dn;
	}
	
	public String getnome() {
		return nome;
	}
	public String getcpf() {
		return cpf;
	}
	
	public DataListaDois getdataNascimento() {
		return dataNascimento;
	}
	
	public void setnome(String n) {
		this.nome = n;
	}
	
	public void setcpf(String c) {
		this.cpf = c;
	}
	
	public void setdataNascimento(DataListaDois dn) {
		this.dataNascimento = dn;
	}
		
}
