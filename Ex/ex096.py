#calcular a área de um terreno
def area():
    a = float(input('digite a largura: '))
    b = float(input('digite o comprimento: '))
    return a * b

def esc():
    
    print(f'a área total de é de {area()}m²')


esc()