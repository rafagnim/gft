package gft.pessoas;

public class Main {

    public static void main(String[] args) {
        double salario_inicial = 1000;
        double aumento2019 = 1.5;
        String nome = "Paulo da Silva";
        String rg = "1.945.623-8";

        Funcionario funcionario = new Funcionario(nome, rg);
        funcionario.setSalario_inicial(salario_inicial);
        funcionario.setSalario_total(salario_inicial);
        funcionario.setPercentual(aumento2019);

        funcionario.atualizaSalario(aumento2019);
        double aumento2020 = aumento2019 * 2;
        funcionario.atualizaSalario(aumento2020);
        double aumento2021 = aumento2020 * 2;
        funcionario.atualizaSalario(aumento2021);
        System.out.println("Nome do Funcionário: " + funcionario.nome);
        System.out.println("RG fo funcionário: " + funcionario.getRG());
        System.out.println("Salario em 2021 = " + funcionario.getSalario_total());  
    }
}
