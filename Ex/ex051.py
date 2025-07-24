#saber se a palavra é palíndrome
a = str(input('Digite uma palavra: '))

d = a.strip().replace(' ','')

b = (d[::-1])

c = (b[::-1])

if d == b:
    print(f'A palavra \033[32m{a}\033[m é palíndrome!')
else:
    print(f'A palavra \033[31m{a}\033[m não é palíndrome!')
