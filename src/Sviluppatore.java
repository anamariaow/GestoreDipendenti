public class Sviluppatore extends Dipendente {
    public Sviluppatore(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcolaSalarioAnnuo() {
        return getSalario() * 13;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Nome: " + getNome() + " - salario: " + getSalario());
    }
}
