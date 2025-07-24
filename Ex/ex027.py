#a velocidade de um carro mas caso ultrapassar 80KM/h ele paga 7.00 reais por KM acima do limite
n = int(input ('Digite a velocidade atual do carro: '))
m = int(n - 80)
if n >= 80:
    print (f'Você pagará uma multa de R${m * 7}! ')
else:
    print ('Tenha um bom dia!')
