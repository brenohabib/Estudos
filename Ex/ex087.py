#mostrar a matriz em 3x3
par = col = 0

matriz = [[],[],[]]
for x in range (3):
    
    for y in range(3):
        matriz[x].append(int(input(f'Digite um valor para [{x}][{y}]: ')))
        if matriz[x][y] % 2 == 0:
            par += matriz[x][y]
        if y == 2:
            col += matriz[x][y] 

print('-='*6)
print('',matriz[0],'\n',matriz[1],'\n',matriz[2])
print('-='*6)
print(f'A soma dos números pares é de {par}')
print(f'A soma da 3º coluna é de {col}')
print(f'O maior valor da segunda linha é {max(matriz[1])}')