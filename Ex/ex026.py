#criar um número entre 0 e 5, e digitar se acertou ou não
import random
print ('-=' * 27)
print ('Vou adivinhar um númeto que você digitar entre 0 e 5')
print ('-=' * 27)
game = int(input('Digite um número entre 0 e 5: '))
game2 = random.randint(0,5)
if game == game2:
    print ('Parabéns!!! Você pensou no mesmo número que eu!')
else:
    print(f'Que pena... o número que pensei foi {game2}')
