#calcular o IMC 
IMC = list([18.5, 25, 30, 40])
n = float(input('Digite a sua altura: '))
h = float(input('Digite seu peso: '))

calc = h / (n * 2)

if calc < IMC[0]:
    print('\033[36m Magreza \033[m')
elif calc == IMC[0] or calc < IMC[1]:
    print('\033[32m Saudável / Peso ideal \033[m')
elif calc == IMC[1] or calc < IMC[2]:
    print('\033[33m Sobrepeso \033[m')
elif calc == IMC[3] or calc > IMC[3]:
    print('\033[31m Obesidade \033[m')
