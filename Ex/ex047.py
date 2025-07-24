#fazer a tabuada
peg = int(input('''Digite qual tabuada deseja selecionar: 
[ 1 ] Adição
[ 2 ] Subtração
[ 3 ] Divisão
[ 4 ] Multiplicação
  :'''))
pog = int(input('Digite o número da tabuáda que deseja verificar (recomendo de 1 a 10): '))


if peg == 1:
    for num in range (1, 11):
        adic = pog + num
        print(f'{pog} + {num} = ', adic)

if peg == 2:
    for num in range (1, 11):
        sub = pog - num
        print(f'{pog} - {num} = ', sub)

if peg == 3:
    for num in range (1, 11):
        div = pog / num
        print (f'{pog} / {num} = ', div)

if peg == 4:
    for num in range (1, 11):
        mult = pog * num
        print (f'{pog} * {num} =', mult)