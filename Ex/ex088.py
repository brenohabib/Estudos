#criar um jogo da mega sena
from random import randint
lista = list()
lista2 = list()
cont2 = 1
#perguntar quantos jogos serão sorteados
quantidade = int(input('Quantos jogos serão sorteados?  '))
print('='*20,'MEGA SENA', '='*20)

#sortear 6 números aleatórios
while cont2 <= quantidade:
    cont = 0
    while True:
        n = randint(1,60)
        if n not in lista:
            lista.append(n)
            cont += 1
        if cont >= 6:
            break
    lista.sort()
    lista2.append(lista[:])
    lista.clear()
    cont2 += 1

print(lista2)
    