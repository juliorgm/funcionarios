package com.company;

import java.util.Date;
import java.util.List;

public class Gerente extends Funcionario{

    private List<Funcionario> funcionarios;

    public Gerente(String nome, String departamento, double salario, Date dataEntrada, String rg) {
        super(nome, departamento, salario, dataEntrada, rg);
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


}
