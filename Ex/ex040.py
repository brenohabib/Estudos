#formar um triângulo e dizer se ele é equilátero, isósceles ou escaleno
a1 = float(input('Digite o primeiro ângulo: '))
a2 = float(input('Digite o segundo ângulo: '))
a3 = float(input('Digite o terceiro ângulo: '))

if a1 + a2 > a3 and a2 + a3 > a1 and a1 + a3 > a2:

    print('Sim, isso forma um triângulo! ')
    if a1 == a2 and a2 == a3 and a3 == a1:
        print('Isso é um triângulo Equilátero')

    elif a1 - a2 == 0 or a2 - a3 == 0 or a1 - a3 == 0:
        print('Isso é um triângulo Isósceles')

    else:
        print('Isso é um triângulo Escaleno')
else:
    print('Não, isso não forma um triângulo')
