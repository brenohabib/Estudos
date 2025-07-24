#calcular dependendo do que for usado para pagar

met = list([0.90, 0.95, 1, 1.20])


din = float(input('Digite o valor a ser pago: '))

sel = int(input('''Selecione o método de pagamento: 
A vista - 1
Cartão 1x - 2
Cartão 2x - 3
Cartão 3 a 12x - 4
Digite: '''))

if sel == 1:
    print('Tudo sairá por: R$',din * met[0],'por causa do desconto de 10%')
elif sel == 2:
    print('Tudo sairá por: R$',din * met[1], 'por causa do desconto de 5%')
elif sel == 3:
    print('Tudo sairá por: R$', din * met[2])
elif sel == 4:
    print('Tudo sairá por: R$', din * met[3], 'por conta dos juros de 20%')
