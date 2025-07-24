#ler três números e dizer qual o maior e o menor
n = int(input('Digite o primeiro valor: '))
m = int(input('Digite o segundo valor: '))
p = int(input('Digite o terceiro valor: '))


if n > m:
    if n > p:
        print(f'O número {n} é o maior! ')
if m > n:
    if m > p:
        print(f'O número {m} é o maior! ')
if p > n:
    if p > m:
        print(f'O número {p} é o maior! ')


if n < m:
    if n < p:
        print(f'O número {n} é o menor! ')
if m < n:
    if m < p:
        print(f'O número {m} é o menor! ')
if p < n:
    if p < m:
        print(f'O número {p} é o menor! ')

