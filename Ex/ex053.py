#ler o peso de 5 pessoas e mostrar o maior e menor



for a in range(0, 5):
    b = float(input(f'Digite o peso da {a + 1}° pessoa: '))
    if a == 0:
        c = b
        d = b
    else:
        if c < b:
            c = b
        if d > b:
            d = b

print (f'O maior valor entre os pesos é {c} Kg, e o menor {d} Kg')