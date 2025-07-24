#mostrar todos os tipos de um objeto

n = input('Digite algo: ')

print(f'O tipo primitivo desse valor é {type(n)}')
print(f'Possui espaços? ', {n.isspace()})
print(f'Somente número? ', {n.isnumeric()})
print(f'Somente letras? ', {n.isalpha()})
print(f'Possui número/Letras? ', {n.isalnum()})
print(f'Todas maiúsculas? ',{n.isupper()})
print(f'Todas minúsculas? ',{n.islower()})
print(f'Está capitalizada? ',{n.istitle()})
