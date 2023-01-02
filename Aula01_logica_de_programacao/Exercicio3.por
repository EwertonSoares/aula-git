programa {
  funcao inicio() {
    real salarioBruto, adicionalNoturno, horasExtras, desconto, salarioLiquido

    escreva ("Digite o salário bruto: ")
    leia (salarioBruto)
    
    escreva ("Digite o valor de adicional noturno: ")
    leia (adicionalNoturno)

    escreva ("Digite a quantidade de horas extras: ")
    leia (horasExtras)

    escreva ("Digite o valor do desconto: ")
    leia (desconto)

    salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - desconto
    escreva ("Salário Líquido: ", salarioLiquido)


  }
}
