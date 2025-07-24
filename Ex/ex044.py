#fogos de artifício
import time

print('{:=^40}'.format(' FOGOS DE ARTIFÍCIO '))
for c in range(10, 0, -1):
    print('{:-^40}'.format(c))
    time.sleep(1)
print ('{:^40}'.format('BOOOOOOOOOM'))
