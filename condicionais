//EXERCICIO1
programa {
  funcao inicio() {
    
    inteiro numero

    escreva ("Digite um n�mero: ")
    leia (numero)

    se (numero % 2 == 0) { 
      escreva ("\n O n�mero " + numero + " � par")
      se (numero > 0) {
        escreva ("\n O n�mero " + numero + " � positivo")
      }
      senao {
        escreva ("\nO n�mero " + numero + " � negativo")
      }
    } 
      senao {
        escreva ("\nO n�mero " + numero + " � �mpar")
        se (numero > 0) {
        escreva ("\nO n�mero " + numero + " � positivo")
      }
      senao {
        escreva ("\nO n�mero " + numero + " � negativo")
      }
      }
  }
}

//EXERC�CIO2
programa {
  funcao inicio() {
    inteiro codigo
    inteiro qtd
    cadeia nome
    real pc
    real total

    escreva("# ## ### #### #########   Menu   ########## #### ### ## #\n")
		
		escreva("--Digite 1 para Cachorro-Quente\n")
		escreva("--Digite 2 para X-Salada--\n")
		escreva("--Digite 3 para X-Bacon--\n")
    escreva("--Digite 4 para Bauru--\n")
    escreva("--Digite 5 para Refrigerante--\n")
    escreva("--Digite 6 para Suco de laranja--\n")

    escreva("Digite o c�digo do produto escolhido ")
    leia(codigo)

    escolha(codigo)
		{
			caso 1:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Cachorro-Quente"
        pc = 10.00
        total = qtd * pc
        
				pare

			caso 2:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "X-Salada"
        pc = 15.00
        total = qtd * pc
        
				pare
			caso 3:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "X-Bacon"
        pc = 18.00
        total = qtd * pc
        
				pare

        caso 4:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Bauru"
        pc = 12.00
        total = qtd * pc
        
				pare

        caso 5:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Refrigerante"
        pc = 8.00
        total = qtd * pc
        
				pare

        caso 6:
				escreva("Digite a quantidade desejada ")
        leia(qtd)
        nome = "Suco de laranja"
        pc = 13.00
        total = qtd * pc
        
				pare

        caso contrario:
				escreva("C�digo inv�lido!")
			
		}
        se((codigo <= 6) e (codigo > 1))
        {
        escreva("\nO valor total do produto " + nome + " � de " + total + " reais")
        }
  }

}

//EXERC�CIO03
programa {
  funcao inicio() {

    inteiro idade
    
    escreva ("Digite sua idade e descubra se voc� deve votar: \n")
    leia (idade)

    se (idade >= 16 e idade < 18)
    escreva ("Voc� est� apte a votar, mas o voto n�o � obrigat�rio.")

    se (idade >= 18 e idade < 65)
    escreva ("Voc� est� apte a votar e o voto � obrigat�rio.")

    se (idade <16)
    escreva ("Voc� n�o est� apte a votar.")

    senao se  (idade >=65)
    escreva ("Voc� est� apte a votar, mas seu voto n�o � obrigat�rio.")

  }
}

//EXERC�CIO4
programa {
  inclua biblioteca Matematica

  funcao inicio() {
    real salario
    
    escreva ("Digite seu sal�rio: ")
    leia(salario)
    salario = Matematica.arredondar(salario,2)

    se(salario <=2000.00)
    escreva("Voc� est� isento e n�o precisa pagar o Imposto de Renda. ")

    senao se(salario >= 2000.01 e salario <= 3000.00)
    escreva("O imposto a ser pago � de: \nR$", (salario * (8/100)))

    senao se(salario >=3000.01 e salario <= 4500.00)
    escreva ("O imposto a ser pago � de: \nR$", (salario * (18/100)))

    senao 
    salario = Matematica.arredondar(salario * (28/100),2)
    escreva("O imposto a ser pago � de: \nR$", salario)
  }
}

//EXERC�CIO5
programa {
  funcao inicio() {
  cadeia tipoAnimal, classeAnimal, tipoAlimentacao

  escreva("O animal � vertebrado ou invertebrado? ")
  leia(tipoAnimal)

  se ((tipoAnimal == "vertebrado") ou (tipoAnimal == "VERTEBRADO")) {
    escreva("O animal � uma ave ou um mam�fero? ")
    leia(classeAnimal)

    se ((classeAnimal == "ave") ou (tipoAnimal == "AVE")) {
      escreva ("O animal � carn�voro ou on�voro? ")
      leia(tipoAlimentacao)

      se ((tipoAlimentacao == "carn�voro") ou (tipoAlimentacao == "CARN�VORO")){
        escreva ("�guia")
      }
      senao se ((tipoAlimentacao == "on�voro") ou (tipoAlimentacao == "ON�VORO")) {
        escreva("Pomba")
      }
    }
    senao se ((classeAnimal == "mam�fero") ou (classeAnimal == "MAM�FERO")) {
    escreva("O animal � on�voro ou herb�voro? ")
    leia(tipoAlimentacao)

    se ((tipoAlimentacao == "on�voro") ou (tipoAlimentacao == "ON�VORO")){
        escreva ("Homem")
      }
      senao se ((tipoAlimentacao == "herb�voro") ou (tipoAlimentacao == "HERB�VORO")) {
        escreva("Vaca") }
      }

    }
    senao se ((tipoAnimal == "invertebrado") ou (tipoAnimal == "INVERTEBRADO")) {
      escreva("O animal � um inseto ou um anel�deo? ")
      leia (classeAnimal)

      se ((classeAnimal == "inseto") ou (tipoAnimal == "INSETO")) {
      escreva ("O animal � hemat�fago ou herb�voro? ")
      leia(tipoAlimentacao)

      se ((tipoAlimentacao == "hemat�fago") ou (tipoAlimentacao == "HEMAT�FAGO")){
        escreva ("Pulga")
      }
      senao se ((tipoAlimentacao == "herb�voro") ou (tipoAlimentacao == "HERB�VORO")) {
        escreva("Lagarta")
      }
    }
    senao se ((classeAnimal == "anel�deo") ou (classeAnimal == "ANEL�DEO")) {
    escreva("O animal � hemat�fago ou on�voro? ")
    leia(tipoAlimentacao)

    se ((tipoAlimentacao == "hemat�fago") ou (tipoAlimentacao == "HEMAT�FAGO")){
        escreva ("Sanguessuga")
      }
      senao se ((tipoAlimentacao == "on�voro") ou (tipoAlimentacao == "ON�VORO")) {
        escreva("Minhoca")
      }
    }
  }
  }
}
