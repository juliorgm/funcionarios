package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Funcionario implements Comparable<Funcionario>{
    private String nome;
    private String departamento;
    private double salario;
    private GregorianCalendar dataDoUltimoAumento;
    private Date dataEntrada;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, Date dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }
    public double getSalario() {
        return salario;
    }

    public Calendar getDataDoUltimoAumento() {
        return dataDoUltimoAumento;
    }

    public double calculaGanhoAnual(){
        double ganhdoAnual = this.salario*12 + this.salario*1.3;

       return ganhdoAnual;
    }

    public void recebeAumento(double taxa){
        this.salario+=this.salario*(taxa/100);
    }
    public void recebeAumento(int valor){
        GregorianCalendar calendar = new GregorianCalendar();
        int mes = calendar.get(GregorianCalendar.MONTH);
        this.salario+=valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public static String dataFormatadaTexto(Date data){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    public static Date dataFormatada(String data) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(data);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", dataEntrada=" +  Funcionario.dataFormatadaTexto(dataEntrada) +
                ", rg='" + rg + '\'' +
                '}';
    }


    public int compareTo(Funcionario funcionario) {
        return this.nome.compareTo(funcionario.getNome());
    }

//    public void listaFuncionarioGerente(Gerente gerente){
//        while (gerente.getDepartamento())
//    }
}

class TestaFuncionario{
    public static void main(String[] args) throws ParseException {
        Funcionario funcionario = new Funcionario("Julio","TI", 1000,
                Funcionario.dataFormatada("07/01/1985"),"4446551");

        Funcionario funcionario1 = new Funcionario("Aderbal","Finaceiro", 1000,
                Funcionario.dataFormatada("07/01/1985"),"4446551");

        Funcionario funcionario2 = new Funcionario("Vitor","TI", 1000,
                Funcionario.dataFormatada("07/01/1985"),"4446551");

        Funcionario funcionario3 = new Funcionario("Belquior","TI", 1000,
                Funcionario.dataFormatada("07/01/1985"),"4446551");



        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(funcionario);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);

        Collections.sort(funcionarios);

        Gerente gerente = new Gerente("Roberval","TI",5000,Funcionario.dataFormatada("12/02/2012"),"123654");
        funcionario.recebeAumento(10d);

        for (Funcionario f:funcionarios) {
           System.out.println(f.getNome());
        }

//        for (Funcionario f:funcionarios) {
//            if (f.getDepartamento().equals(gerente.getDepartamento())) {
//                System.out.println(f.getNome());
//            }
//
//        }



//        Gerente gerente = new Gerente("Roberval","TI",5000,Funcionario.dataFormatada("12/02/2012"),"123654");
//        funcionario.recebeAumento(10d);


        System.out.println(funcionario.calculaGanhoAnual());
        System.out.println(funcionario.getSalario() +" "+ funcionario.getDataDoUltimoAumento());

    }
}
