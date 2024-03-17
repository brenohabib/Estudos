---
tags: 
referências: 
data: 2024-03-10
---
## Criptografia

A criptografia é um processo de transformar dados legíveis em um código indecifrável para aqueles sem a chave para desbloqueá-lo.

Imagine um baú trancado com um segredo: apenas quem possui a chave pode acessar o conteúdo dentro.


### Criptografia Simétrica

- Uma única chave é usada para criptografar e descriptografar dados.
- É como um cadeado com a mesma chave para abrir e fechar.
- Vantagens:
    - Rápida e eficiente para grandes volumes de dados.
    - Ideal para comunicação em tempo real.
- Desvantagens:
    - Compartilhar a chave pode ser arriscado, como entregar a chave do cadeado.
    - Se a chave for comprometida, toda a segurança é perdida.

**Exemplos de uso:**

- **Transferências bancárias online:** A criptografia simétrica protege as informações financeiras durante a transação.
- **Mensagens instantâneas:** Apps como WhatsApp e Signal usam criptografia simétrica para garantir a privacidade das conversas.
- **Armazenamento em nuvem:** Seus arquivos na nuvem podem ser criptografados antes do upload, garantindo que apenas você possa acessá-los.

**Exemplo de falha:**

Em 2013, a NSA (Agência de Segurança Nacional dos EUA) foi acusada de espionar comunicações online através da coleta de chaves de criptografia simétrica.

### Criptografia Assimétrica

- Utiliza um par de chaves: pública e privada.
- A chave pública é usada para criptografar dados, enquanto a privada é usada para descriptografá-los.
- É como um cadeado com duas chaves diferentes: qualquer um pode enviar uma mensagem (chave pública), mas apenas o destinatário pode abri-la (chave privada).
- Vantagens:
    - Mais segura para troca de chaves e autenticação.
    - Permite assinaturas digitais para garantir a integridade dos dados.
- Desvantagens:
    - Mais lenta que a criptografia simétrica.
    - Requer um gerenciamento cuidadoso das chaves.

**Exemplos de uso:**

- **Navegação segura na web:** O protocolo HTTPS usa criptografia assimétrica para garantir a comunicação segura entre o navegador e o site.
- **Comércio eletrônico:** As compras online são protegidas por criptografia assimétrica durante o processo de pagamento.
- **Assinaturas digitais:** Documentos eletrônicos podem ser assinados digitalmente para garantir a autenticidade e não repúdio.

### Exemplo

Em 2014, o Heartbleed, uma vulnerabilidade no OpenSSL, permitiu que hackers roubassem chaves privadas de servidores, comprometendo a segurança de milhões de usuários.