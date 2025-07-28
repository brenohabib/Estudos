---
tags:
  - web
referências: 
data: 2025-07-24
---
Neste semestre, exploraremos diversas tecnologias e conceitos fundamentais para o **desenvolvimento web** moderno, com foco tanto no front-end quanto no back-end. A seguir, apresentamos um panorama geral dos principais tópicos que serão estudados.
### React e o Virtual DOM

React é uma biblioteca JavaScript criada pelo Facebook para construção de interfaces de usuário (UI). Um de seus principais diferenciais é o **Virtual DOM**, uma representação virtual da estrutura real da página (DOM). Isso permite que o React atualize apenas os elementos que realmente mudaram, otimizando a performance das aplicações web.

### DOM – Document Object Model

O **DOM (Document Object Model)** é a estrutura em árvore que representa todos os elementos HTML de uma página. Ele permite que linguagens como JavaScript interajam dinamicamente com os elementos da página, alterando conteúdos, estilos e comportamentos em tempo real.

### Hooks e Context API

Dentro do React, os **Hooks** são funções especiais que permitem o uso de estado e outros recursos do React em componentes funcionais. Os mais comuns são `useState`, `useEffect` e `useContext`. Este último se integra com a **Context API**, que facilita o compartilhamento de dados entre componentes sem a necessidade de prop drilling (passar props manualmente por vários níveis da árvore de componentes).

### Armazenamento Local: Cookies, Local Storage e IndexedDB

Para persistir dados no navegador, existem diferentes abordagens:

- **Cookies**: pequenos arquivos enviados pelo servidor que armazenam dados como sessões de login. São acessíveis tanto pelo navegador quanto pelo servidor.
    
- **Local Storage**: permite armazenar dados no navegador de forma simples e persistente, com acesso via JavaScript. Ideal para informações não sensíveis.
    
- **IndexedDB**: banco de dados local mais complexo, baseado em objetos. É útil para armazenar grandes quantidades de dados estruturados, como aplicações offline.

### Axios

**Axios** é uma biblioteca JavaScript baseada em Promises para fazer requisições HTTP. Usado com frequência em aplicações React, ele facilita a comunicação com APIs, permitindo envio e recebimento de dados com suporte a interceptores, tratamento de erros e muito mais.

### Node.js e Express.js

**Node.js** é uma plataforma baseada no motor V8 do Google (o mesmo usado no Chrome), que permite rodar JavaScript no servidor. Ele é **assíncrono** e **single-threaded**, o que o torna eficiente para aplicações com muitas operações de I/O (entrada/saída).

Node é organizado em **módulos**, também chamados de pacotes, que podem ser instalados via **npm (Node Package Manager)**.

Entre os módulos mais populares está o **Express.js**, um framework leve para construção de aplicações web e APIs. Com ele, é possível lidar facilmente com rotas, requisições HTTP, middleware e muito mais.