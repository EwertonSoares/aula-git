programa {
  inclua biblioteca Matematica 
  funcao inicio() {
    real nota1, nota2, nota3, nota4, media
    escreva ("\n", "escreva sua nota 1: ")
    leia (nota1)
    escreva ("\n", "escreva sua nota 2: ")
    leia (nota2)
    escreva ("\n", "escreva sua nota 3: ")
    leia (nota3)
    escreva ("\n", "escreva sua nota 4: ")
    leia (nota4)

    media = (nota1 + nota2 + nota3 + nota4) / 4 
    escreva ("sua média é: ", Matematica.arredondar(media, 1))
  }
}
