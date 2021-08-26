package gft.pessoas;

public class Funcionario extends Pessoa {
    private double salario_inicial;
    private double percentual;
    private double salario_total;
    
    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRG() {
        return this.rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atualizaSalario(double percentual){
        this.salario_total = this.salario_total + (this.getSalario_total() * percentual/100);
    }

    public double getSalario_inicial() {
        return salario_inicial;
    }

    public void setSalario_inicial(double salario_inicial) {
        this.salario_inicial = salario_inicial;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getSalario_total() {
        return salario_total;
    }

    public void setSalario_total(double salario_total) {
        this.salario_total = salario_total;
    }
}