#mostrar se um valor é maior, menor ou igual a outro
n1 = int(input('Digite um valor inteiro: '))
n2 = int(input('Digite outro valor: '))

if n1 > n2:
    print(f'O valor {n1} é maior do que o {n2}!')
elif n1 < n2:
    print(f'O valor {n2} é maior do que o {n1}!')
else:
    print(f'Os dois valores são iguais! ')