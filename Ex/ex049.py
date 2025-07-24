#progressão aritmética

a = int(input('Digite o primeiro número de uma PA: ')) # _> início da PA

b = int(input('Digite a razão desta PA: ')) #_>De quanto em quanto ele pula

d = b * 11

for c in range(a, d, b):
    print(c, end=' \ ')