#calcular a hipotenusa de um triângulo
import math
n = float(input('Digite o valor dos Catetos: '))
m = float(input('Digite o valor do Cateto: '))
s = math.hypot(n, m)
print (f'O valor da hipotenusa vale {s:.2f}')