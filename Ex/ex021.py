#mostrar a unidade, dezena, centena e milhar de um número
n = input('Digite um número com 4 digitos: ')

print (f'A unidade vale: {n[0]}')

m = int(n)
if m>=10:
    print (f'A dezena vale: {n[1]}')
else:
    print ('A dezena vale: 0')

if m>=100:
    print (f'A centena vale: {n[2]}')
else:
    print ('A centena vale: 0')

if m>=1000:
    print (f'O milhar vale: {n[3]}')
else:
    print('O milhar vale: 0')
