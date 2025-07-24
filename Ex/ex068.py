from random import randint
s = 0
print('-'*10,'JOGO PAR OU ÍMPAR', '-'*10)

jog = input('Digite que lado você está... (PAR ou IMPAR?): ').upper().strip()

while True:
    v = int(input('Digite um valor: '))
    n = randint(0, 10)
    print (f'O computador escolheu {n}')
    
    if (v + n) % 2 == 0 and jog == 'PAR' or (v + n + 1) % 2 == 0 and jog == 'IMPAR':
        print('O jogador ganhou!')
        s +=1
    else:
        print('A máquina venceu...')
        break
print(f'O jogador venceu um total de {s} vezes consecutivas')
