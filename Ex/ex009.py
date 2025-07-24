#mostrar a tabuada de um número
import sys

try:
    p = int(input('Digite: 1 = Multiplicar, 2 = Dividir, 3 = Adição, 4 = Subtração: '))
except NameError and ValueError:
    print('Valor inválido!')
    sys.exit(1)
  
print('-=-' * 24)

if p == 1:
 n1 = int(input('Digite um valor para ser mostrado sua tabuada de multiplicação: '))
 print('-=-' * 24)
 for i in range(11):
  
  print(f'{i}x{n1} = {n1 * i}')
    
  print('-=-' * 5)

if p == 2:
 n2 = int(input('Digite um valor para ser mostrado sua tabuada de divisão: '))
 print('-=-' * 24)
 for ii in range(1, 11):
  
  print(f'{ii}/{n2} = {n2 / ii}')

  print('-=-' * 5)

if p == 3:
 n3 = int(input('Digite um valor para ser mostrado sua tabuada de adição: ')) 
 print('-=-' * 24)
 for iii in range (11):
  
  print(f'{iii}+{n3} = {n3 + iii}')

  print('-=-' * 5)

if p == 4:
 n4 = int(input('Digite um valor para ser mostrado sua tabuada de subtração: '))
 print('-=-' * 24)
 for iiii in range(11):
  
  print (f'{iiii}-{n4} = {iiii - n4}')

  print('-=-' * 5)