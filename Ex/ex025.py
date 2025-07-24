#ler o nome completo de uma pessoa e mostrar o primeiro e último nome dela
n = input('Digite seu nome completo: ').strip()
m = n.split()
print ('Seu primeiro e último nome é:', m[0], m[-1])