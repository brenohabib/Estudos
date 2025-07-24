#somar todos os números ímpares múltiplos de 3
m = 0
t = 0

for c in range(0, 501, 3):
    if c % 2 != 0:
        t = t + 1
        m += c

print (f'A soma de todos os {t} números é de {m}')
