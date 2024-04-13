---
tags:
  - atividade
referências: 
data: 2024-04-11
---
1. Modelo computacional do programa imperativo
![[Drawing 2024-04-12 22.50.59.excalidraw|800]]

2. Binário em C
```C
#include <stdio.h>

int main() {
  int a, b, c;
  for (a = 0; a <= 1; a++) {
    for (b = 0; b <= 1; b++) {
      for (c = 0; c <= 1; c++) {
        printf("%d%d%d\n", a, b, c);
      }
    }
  }
  return 0;
}
```

1. **biblioteca:** `#include <stdio.h>` inclui a biblioteca padrão de entrada e saída, como `printf()`.
2. **variáveis:** As variáveis `a`, `b` e `c` são declaradas como inteiros para armazenar os valores dos dígitos binários.
3. **Laços:** O laço `for (a = 0; a <= 1; a++)` itera sobre os valores possíveis de `a` (0 e 1); Dentro do laço principal, o laço `for (b = 0; b <= 1; b++)` itera sobre os valores possíveis de `b` para cada valor de `a`; Dentro do segundo laço aninhado, o laço `for (c = 0; c <= 1; c++)` itera sobre os valores possíveis de `c` para cada valor de `a` e `b`.
6. **Imprimir número:** A função `printf("%d%d%d\n", a, b, c)` imprime o número binário atual dos valores de `a`, `b` e `c`.
7. **Retorno:** `return 0;` mostra que o programa foi executado sem nenhum problema.