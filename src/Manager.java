public class Manager extends Dipendente {

    public Manager(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcolaSalarioAnnuo() {
        return getSalario() * 12 + 500;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Nome: " + getNome() + " - salario: " + getSalario());
    }
}
