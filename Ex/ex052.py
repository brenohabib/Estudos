#ler a data de sete pessoas e mostrar quantas são maioridade
c = 0
d = 0
for a in range(0, 7):
    b = int(input('Digite sua data de nascimento: '))
    if b >= 2005:
        c += 1
    else:
        d += 1

print(f'Um total de \033[32m{d}\033[m pessoas está acima de 18 anos e\033[m \033[31m{c}\033[m são menores de 18 anos')
