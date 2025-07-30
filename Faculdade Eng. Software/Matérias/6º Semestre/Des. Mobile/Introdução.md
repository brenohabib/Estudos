## O que é o Flutter?

**Flutter** é um **framework de código aberto**, criado e mantido pelo **Google**. Ele é utilizado principalmente para **criar interfaces de usuário (UI)**. Ele é **multiplataforma**, ou seja, permite criar um único código que pode ser executado em vários outros dispositivos

---

## Desenvolvimento Nativo vs. Multiplataforma

### Desenvolvimento Nativo

Significa desenvolver **especificamente para uma única plataforma**, por exemplo:

- Usar **Swift** para iOS
- Usar **Kotlin/Java** para Android

O código é feito sob medida para aquele sistema, aproveitando melhor o desempenho e os recursos específicos da plataforma.

### Desenvolvimento Multiplataforma (Cross-platform)

Significa criar um único aplicativo que funciona em várias plataformas. Com frameworks como o **Flutter**, você:

- Escreve **uma única base de código**
- Executa o app em Android, iOS, Web, etc.

Pode haver pequenas adaptações, mas a maior parte do código é **compartilhada**.

---

## Integração entre Nativo e Flutter

### Platform Channels (Canais de Plataforma)

Mesmo utilizando Flutter, às vezes é necessário acessar **funcionalidades específicas de uma plataforma nativa**. São **métodos de comunicação entre o código Flutter e o código nativo**. Elas permitem que o Flutter:
- Envie mensagens para o código nativo (Swift, Kotlin, etc.)
- Receba respostas de volta

Isso é útil para acessar APIs que só existem na plataforma nativa ou que ainda não têm suporte direto no Flutter.

> Exemplo: Usar uma API de câmera avançada do iOS, mesmo que o app tenha sido feito em Flutter.

| Conceito          | Explicação                                                       |
| ----------------- | ---------------------------------------------------------------- |
| Flutter           | Framework do Google para criar apps com uma única base de código |
| Multiplataforma   | Um app roda em diferentes sistemas com o mesmo código            |
| Nativo            | App feito especificamente para uma plataforma (iOS, Android)     |
| Platform Channels | Comunicação entre Flutter e código nativo da plataforma          |
