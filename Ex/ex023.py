#saber se o nome do cara possui 'Silva'
n = input ('Digite seu nome completo: ')
m = n.find('Silva')
if m>=0:
    print (f'Seu nome completo é {n} e possui sim, Silva. ')
else:
    print (f'Seu nome completo é {n} e não possui Silva. ')