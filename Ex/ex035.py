#ler um número inteiro e converter ele para binário, octal ou hexadecimal
main = int(input('Digite um número inteiro para ser convertido: '))
main2 = int(input('1 - Hexadecimal, 2 - Octadecimal, 3 - Binário: '))

if main2 == 1:
    print(hex(main))
if main2 == 2:
    print(oct(main))
if main2 == 3:
    print (bin(main))
