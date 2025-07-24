from random import randint
c = 0
n = randint(1,10)
print('-='*20,'Jogo de Adivinhar', '-='*20)
ad = int(input('Digite um número que você acha que o computador pegou: '))
while ad != n:
    ad = int(input('Você errou, digite outro número: '))
    c += 1

print('Você acertou! mas foi necessário um total de', c, 'chutes')