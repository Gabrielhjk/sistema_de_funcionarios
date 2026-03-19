public class Desenvolvedor extends Funcionario{
    private int horasExtras;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * valorHoraExtra);
    }
}
