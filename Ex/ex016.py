#ler um ângulo e mostrar seno, cosseno e tangente
import math
n = float(input('Digite um ângulo: '))
s = math.radians (n)

seno = math.sin(s)
print (f'O SENO de {n:} é {seno:.2f}')

cos = math.cos(s)
print (f'O COSSENO de {n:} é {cos:.2f}')

tan = math.tan(s)
print (f'A TANGENTE de {n:} é {tan:.2f}')
