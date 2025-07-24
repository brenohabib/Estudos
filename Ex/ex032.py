#aumento de salário de 10% para acima de 1,250.00 e 15% para abaixo desse valor
sal = float(input('Digite o valor do salário: R$'))
if sal > 1250:
    novo_sal = sal * 1.10
else:
    novo_sal = sal * 1.15
print (f'Seu novo salário tem o valor atualizado de R${novo_sal:.2f}')