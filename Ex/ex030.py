#saber se o ano vai ser bissexto ou não
from datetime import date
n = int(input('Digite o ano (0 para analizar ano atual): '))
if n == 0:
    ano = date.today().year
if n % 4 == 0 and n % 100 != 0 or n % 400 == 0:
    print('Sim, esse ano é bissexto! ')
else:
    print('Não, esse ano não é bissexto! ')
