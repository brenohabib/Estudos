#pegar um valor aleatório e mostrar ele
import random
n = input('Primeiro aluno: ')
m = input('Segundo aluno: ')
p = input('Terceiro aluno: ')
q = input('Quarto aluno: ')
l = ('O escolhido foi...')

rand = random.randint(1,4)
if rand == 1:
    print(l, f'{n}!')
if rand == 2:
    print(l, f'{m}!')
if rand == 3:
    print(l, f'{p}!')
if rand == 4:
    print(l, f'{q}!')
