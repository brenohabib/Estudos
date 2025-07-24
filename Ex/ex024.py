#ler uma frase e mostrar quantas vezes aparece a letra 'A' e onde ela aparece na primeira vez e na última vez
n = input('Digite uma frase: ').strip()
s = n.lower()
m = s.count('a')
z = s.find('a')
x = s.rfind('a')

print (f'A frase {n} possui {m} letras A escritas. ')
print (f'A frase {n} começa com A na primeira posição número {z + 1}. ')
print (f'A frase {n} termina com o último A na posição número {x + 1}. ')