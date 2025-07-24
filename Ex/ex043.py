#jokenpo
from random import randint

print ('{:=^120}'.format(' JOKENPO '))
n = int(input('''Selecione:
 [ 1 ]PEDRA
 [ 2 ]PAPEL
 [ 3 ]TESOURA
   '''))

m = randint(1,3)

if m == 1:
    print('O computador selecionou PEDRA!')
if m == 2:
    print('O computador selecionou PAPEL!')
if m == 3:
    print('O computador selecionou TESOURA!')

if n == m:
    print('EMPATE!')
elif n == 1 and m == 2 or n == 2 and m == 3 or n == 3 and m == 1:
    print('VOCÊ PERDEU!')
else:
    print('VOCÊ GANHOU!')
