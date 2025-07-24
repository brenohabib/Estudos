#ler se a pessoa é M ou F

f = 'M'

while f == 'M' or f == 'F':
    f = str(input('Digite seu sexo (M ou F): ').upper())
    
print('Valor inválido! ')
