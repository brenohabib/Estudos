#ler o nome, sexo e idade de 4 pessoas e mostrar seus dados
med = 0
f = 0
cont = 0
fnome = 0

for laco in range(1, 5):
    nome = str(input(f'Digite o nome da {laco}° pessoa: '))
    sex = str(input(f'Digite se o sexo é M ou F: ').strip().upper())
    idad = int(input('Digite a idade dessa pessoa: '))

    #média de idades
    med += idad
    #qual é o HOMEM mais velho
    if sex == 'M' and idad > f:
        fnome = nome
        f = idad
    #quantas mulheres tem menos de 20 anos
    if sex == 'F' and idad > 20:
        cont += 1


print('A média de idade de todos é ',med / 4)

if fnome == 0:
    print('Não há homens nessa lista')
else:
    print(f'O homem mais velho é o {fnome} com {f} anos')

if cont == 0:
    print('Não há mulheres nesta lista')
else:
    print(f'Há um total de {cont} mulheres acima de 20 anos nesta lista')
