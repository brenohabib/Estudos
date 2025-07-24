#saber se a frase possui na primeira palavra 'Santo'
n = input ('Digite um nome de cidade: ').strip()
m = n[:5].lower()
o = m.find('santo')

if o >= 0:
    print (f'A cidade {n} possui escrito Santo no primeiro nome. ')
else:
    print (f'A cidade {n} não possui escrito Santo no primeiro nome. ')