public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2000);
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário Final: " + funcionario.calcularSalario());
        
        System.out.println();

        Gerente gerente = new Gerente("Maria", 4000, 1500);
        System.out.println("Funcionário: " + gerente.getNome());
        System.out.println("Salário Final: " + gerente.calcularSalario());

        System.out.println();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 3000, 10, 50);
        System.out.println("Funcionário: " + desenvolvedor.getNome());
        System.out.println("Salário Final: " + desenvolvedor.calcularSalario());
    }
}
