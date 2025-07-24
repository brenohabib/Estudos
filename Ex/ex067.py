n = m = 0
while True:
    s = int(input('Digite um valor para ser mostrado sua tabuada: '))
    if s > 0:
        print('-'*20)
        for a in range(1,11):
            print (s, f'x {a} = {s * a}')
        print('-'*20)
    else:
        break
print('Programa encerrado!')
