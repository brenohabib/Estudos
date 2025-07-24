#categorizar as pessoas conforme sua idade
idade = list([9, 14, 19, 20])
data = int(input('Digite sua data de nascimento: '))

#até 8 anos
if 2023 - data <= idade[0]:
    print('MIRIM')
#até 14 anos
elif 2023 - data > idade[0] and 2023 - data <= idade[1]:
    print('INFANTIL')
#até 19 anos
elif 2023 - data > idade[1] and 2023 - data <= idade[2]:
    print('JUNIOR')
#até 20 anos
elif 2023 - data > idade[2] and 2023 - data <= idade[3]:
    print('SÊNIOR')
#acima de 20 anos
elif 2023 - data >= idade[3]:
    print('MASTER')
