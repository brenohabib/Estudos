#saber se o empréstimo de uma casa vai ser aprovada
val = float(input('Digite o valor da casa a ser comprada: R$'))
val2 = float(input('Digite o salário do pagador: R$'))
val3 = int(input('Digite em quantos anos ele irá pagar a casa: '))

#converter anos para meses
conv = val3 * 12

cal = val / conv
print (f'O valor mensal a ser pago em {val3} anos será de R${cal:.2f}')
if cal > val2 * 0.30:
    print('EMPRESTIMO NEGADO!')
else:
    print('EMPRESTIMO APROVADO!')