#saber se a pessoa vai se alistar no serviço militar ou se já passou o tempo
temp = int(input('digite o ano em que você nasceu: '))


if 2023 - temp <= 17:
    print(f'Essa pessoa ainda vai se alistar em {temp + 18 - 2023} anos')
elif 2023 - temp == 18:
    print('Essa pessoa já pode se alistar ')
else:
    print(f'Essa pessoa já devia ter se alistado há {temp + 18 - 2023} anos')
