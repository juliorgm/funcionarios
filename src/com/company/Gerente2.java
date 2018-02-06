package com.company;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Gerente2 implements Comparable<Funcionario> {
    private String nome;
    private String departamento;
    private String rg;
    private List<Funcionario> funcionarios;

    public Gerente2(String nome, String departamento, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.rg = rg;
        this.funcionarios = new ArrayList<Funcionario>();
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void adicionaFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }



    public void imprimiGerenteFuncionarios(){
        System.out.println(this.nome);
        for (Funcionario f:this.funcionarios) {
            System.out.println(f.getNome());
        }
    }

    @Override
    public int compareTo(Funcionario funcionario) {
        return this.nome.compareTo(funcionario.getNome());
    }
}

class TesteGerente{
    public static void main(String[] args) throws ParseException {
        String departamento="Estrela da Morte";
        Gerente2 dartVader = new Gerente2("Dart Vader","Jedi","123");
        dartVader.adicionaFuncionario(new Funcionario("João Star Trupper ","Ti",1000,Funcionario.dataFormatada("07/01/2011"),"12332"));
        dartVader.adicionaFuncionario(new Funcionario("Maria Star Trupper ","Ti",1000,Funcionario.dataFormatada("07/01/2011"),"12332"));
        dartVader.adicionaFuncionario(new Funcionario("Eduardo Star Trupper ","Ti",1000,Funcionario.dataFormatada("07/01/2011"),"12332"));

        System.out.println(dartVader.getFuncionarios().get(0));
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("Eduardo Star Trupper ","Ti",1000,Funcionario.dataFormatada("07/01/2011"),"12332"));



        dartVader.imprimiGerenteFuncionarios();
    }
}
