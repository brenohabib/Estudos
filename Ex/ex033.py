#pegar 3 retas e informar se ela consegue formar um triângulo
a = float(input('Digite o primeiro lado do triângulo: '))
b = float(input('Digite o segundo lado do triângulo: '))
c = float(input('Digite o terceiro lado do triângulo: '))

if a + b > c and c + b > a and a + c > b:
    print('Sim, isto forma um triângulo')
else:
    print('Não, isto não forma um triângulo')