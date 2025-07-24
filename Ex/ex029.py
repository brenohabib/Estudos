#uma viagem que cobra 0.50 por KM até 200KM ou 0.45 para viagens mais longas
n = int(input('Digite quantos KM de viagem: '))
if n > 200:
    print(f'Então sua viagem custará R${n * 0.45}! ')
else:
    print(f'Então sua viagem custará R${n * 0.5}! ')
    