#pegar 6 números e somar apenas os pares
c = 0

for a in range(0,6):
    b = int(input('Digite um número: '))
    if b % 2 == 0:
        c = c + b


print (c)