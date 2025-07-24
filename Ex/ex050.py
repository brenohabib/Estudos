#pegar os últimos 2 números primos e saber a quantidade de números entre eles
a = int(input('Digite um número inteiro: '))

c = 0

for b in range(1, a + 1):
    if a % b  == 0:
        print('\033[32m', end= ' ')
        c += 1
    else:
        print('\033[31m', end= ' ')

    print(b, end= '\033[m')

if c == 2:
    print(f'\nO número \033[32m{a}\033[m foi divisível um total de \033[32m{c}\033[m vezes, ele é \033[32mprimo \033[m')
else:
    print(f'\nO número \033[32m{a}\033[m foi divisível um total de \033[32m{c}\033[m vezes, ele \033[31mnão é primo \033[m')
