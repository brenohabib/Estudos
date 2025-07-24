#adaptar textos no tamanho
def escreva(a):
    print(len(a) * '~')
    print(a)
    print(len(a) * '~')

escreva(str(input('Digite qualquer frase: ')))