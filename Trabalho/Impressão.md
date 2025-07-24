```adoc

= SPEC-001: Plataforma de Apoio Psicológico Comunitário
:sectnums:
:toc:

== Background

A crescente preocupação com a saúde mental dos adolescentes é um tema de importância social e comunitária. Com o aumento dos desafios sociais e emocionais enfrentados por essa faixa etária, a demanda por plataformas seguras e acessíveis de apoio psicológico tem crescido. Esse projeto visa desenvolver uma plataforma de apoio psicológico comunitário voltada para adolescentes, permitindo que eles participem de grupos de conversa e sessões de suporte, com ou sem a presença de profissionais qualificados.

A plataforma terá o objetivo de proporcionar um espaço seguro e confortável para os adolescentes, onde eles possam compartilhar suas experiências, participar de discussões e buscar ajuda em momentos de necessidade. As funcionalidades principais incluem a criação de grupos de chat, com a possibilidade de realizar chamadas de voz e vídeo, para facilitar um maior engajamento e apoiar o bem-estar emocional dos usuários.

== Requirements

=== Must-Have (Essenciais)

- **Autenticação de Usuário**: Login e cadastro para garantir a segurança e integridade dos dados dos adolescentes, incluindo autenticação segura (e.g., autenticação de dois fatores).
- **Grupos de Chat Moderados**: Chats divididos em temas e moderados por profissionais ou voluntários treinados, com limites de idade para garantir um ambiente seguro.
- **Chamadas de Voz e Vídeo**: Opção para iniciar chamadas de voz e vídeo entre os participantes do grupo, com permissão para a moderação intervir, caso necessário.
- **Perfis de Usuário Básicos**: Dados limitados para garantir a privacidade dos adolescentes, exibindo apenas informações essenciais e anônimas.
- **Sistema de Notificações**: Notificações em tempo real para alertar sobre novas mensagens, convites para chamadas e sessões programadas.

=== Should-Have (Desejáveis)

- **Match de Interesses**: Sistema de recomendação para conectar adolescentes com interesses semelhantes, promovendo interações mais engajadas.
- **Relatórios de Atividade e Feedback**: Relatórios de uso anônimos e avaliações de satisfação para monitorar a qualidade das interações e o impacto da plataforma.
- **Biblioteca de Recursos de Apoio**: Artigos, vídeos e ferramentas de apoio sobre saúde mental, adaptados para adolescentes.
  
=== Could-Have (Opcional)

- **Gamificação**: Sistema de recompensas por participação ativa, como distintivos ou níveis, para incentivar o engajamento contínuo.
- **Sessões Privadas com Profissionais**: Possibilidade de sessões privadas de chat ou vídeo com psicólogos certificados.
- **Análise de Sentimento (IA)**: Monitoramento automatizado para identificar possíveis sinais de crises, alertando moderadores para intervir, quando necessário.

=== Won't-Have (Fora do Escopo)

- **Integração com Redes Sociais Públicas**: Para garantir a privacidade e segurança dos adolescentes, a plataforma não permitirá o compartilhamento de conteúdo diretamente em redes sociais.
- **Marketplace para Profissionais de Saúde**: Serviços de venda de consultas e terapias não farão parte da plataforma, mantendo o foco no apoio comunitário.

== Method

=== Arquitetura Geral

A plataforma será desenvolvida com uma arquitetura orientada a microsserviços para garantir escalabilidade e modularidade. A seguir, os principais componentes e suas funcionalidades:

[plantuml, target="arquitetura-geral", format="svg"]
----
@startuml
package "Frontend" {
  [Mobile App]
  [Web Interface]
}

package "Backend" {
  [API Gateway]
  [Autenticação e Autorização]
  [Gerenciamento de Usuários]
  [Mensagens e Chats]
  [Chamadas de Voz e Vídeo]
  [Análise de Sentimento (IA)]
  [Banco de Dados]
}

Frontend --> API Gateway
API Gateway --> Autenticação e Autorização
API Gateway --> Gerenciamento de Usuários
API Gateway --> Mensagens e Chats
API Gateway --> Chamadas de Voz e Vídeo
API Gateway --> Análise de Sentimento (IA)
Mensagens e Chats --> Banco de Dados
Gerenciamento de Usuários --> Banco de Dados
@enduml
----

=== Descrição dos Componentes

- **Frontend (Mobile e Web)**: Interfaces de usuário, incluindo aplicativos móveis e um portal web, permitirão que adolescentes acessem os grupos de suporte, realizem chamadas de voz e vídeo, e recebam notificações. A interface será adaptada para facilitar a navegação e promover um ambiente amigável.

- **API Gateway**: Centraliza as requisições para os serviços backend, facilitando a comunicação e melhorando a segurança. 

- **Autenticação e Autorização**: Gerencia o login seguro dos usuários, incluindo autenticação de dois fatores e controle de acesso para adolescentes e moderadores.

- **Gerenciamento de Usuários**: Mantém informações básicas e anônimas dos usuários, garantindo que os dados de perfil estejam de acordo com as políticas de privacidade.

- **Mensagens e Chats**: Serviço dedicado ao gerenciamento dos grupos de chat. Suporta comunicação em tempo real com a possibilidade de moderação de mensagens, além de salvar logs de conversas no banco de dados.

- **Chamadas de Voz e Vídeo**: Este módulo possibilita a criação de chamadas de voz e vídeo dentro dos grupos de chat, permitindo que os participantes possam interagir diretamente. Ferramentas como WebRTC podem ser usadas para suportar essas chamadas.

- **Análise de Sentimento (IA)**: Este serviço processa as mensagens em tempo real, usando algoritmos de análise de sentimento para identificar sinais de crise. Quando identificados, são gerados alertas automáticos para os moderadores intervirem, se necessário.

- **Banco de Dados**: Sistema de banco de dados para armazenar informações dos usuários, histórico de mensagens e relatórios de uso. Recomenda-se o uso de um banco de dados NoSQL (e.g., MongoDB) para maior flexibilidade na estrutura dos dados.

=== Algoritmos

==== 1. Moderação e Análise de Sentimento em Tempo Real

Para manter a segurança e o bem-estar dos adolescentes, a plataforma inclui um algoritmo de moderação automatizada e análise de sentimento em tempo real.

. **Pipeline de Análise de Sentimento**
   - **Entrada**: Mensagem do usuário.
   - **Pré-processamento**: O texto é tokenizado, normalizado (remoção de stop words, emojis e análise de gírias).
   - **Classificação de Sentimento**: O texto é passado por um modelo de IA, como BERT ou BERTimbau (adaptado para o português), para classificar a mensagem em positivo, neutro ou negativo.
   - **Detecção de Palavras-chave Críticas**: Se palavras de risco (e.g., relacionadas a pensamentos autodestrutivos) são detectadas, o sistema marca a mensagem para revisão.

. **Alerta para Moderador**
   - **Regras de Alerta**: Se uma sequência de mensagens negativas ou de alta intensidade emocional for detectada, um alerta é enviado automaticamente ao moderador.
   - **Notificação ao Moderador**: Um sistema de notificação em tempo real envia o alerta para o painel de controle do moderador ou para o aplicativo de monitoramento.

==== 2. Match de Interesses entre Usuários

Para melhorar a experiência de grupo, a plataforma conecta usuários com interesses semelhantes usando um algoritmo simples de similaridade. 

- **Entrada**: Dados do perfil, incluindo interesses, temas favoritos e histórico de engajamento.
- **Processo**: Calcula a similaridade entre usuários usando o índice de Jaccard para interesses ou outras métricas de similaridade.
- **Saída**: Sugestões de grupos ou novos contatos para o usuário.

=== Schema de Banco de Dados

Para suportar as funcionalidades da plataforma, vamos usar um banco de dados NoSQL para maior flexibilidade. Aqui estão os schemas sugeridos para as principais coleções:

==== 1. Coleção `Usuarios`

- **_id**: Identificador único do usuário.
- **nome**: Nome ou pseudônimo do usuário.
- **idade**: Faixa etária (p. ex.: “13-15”, “16-18”).
- **interesses**: Lista de interesses do usuário (e.g., ["ansiedade", "autoestima"]).
- **tipo**: Tipo de usuário (adolescente ou moderador).
- **sessaoAtiva**: Status da última sessão (última atividade online).
- **dadosSensiveis**: Campo criptografado para armazenar informações sensíveis, como contatos de emergência (caso de alerta crítico).

==== 2. Coleção `GruposChat`

- **_id**: Identificador único do grupo de chat.
- **nomeGrupo**: Nome ou tema do grupo de chat.
- **categoria**: Tema do grupo (e.g., “Ansiedade”, “Autoestima”).
- **usuarios**: Lista de IDs dos usuários atualmente no grupo.
- **moderador**: ID do moderador responsável.
- **historicoMensagens**: Array de mensagens associadas ao grupo (relacionado à coleção de Mensagens).

==== 3. Coleção `Mensagens`

- **_id**: Identificador único da mensagem.
- **grupoId**: ID do grupo de chat ao qual a mensagem pertence.
- **usuarioId**: ID do usuário que enviou a mensagem.
- **conteudo**: Texto da mensagem.
- **sentimento**: Classificação de sentimento da mensagem (positivo, neutro, negativo).
- **alertaModeracao**: Indicador de alerta para moderador (bool, default: false).
- **timestamp**: Data e hora da mensagem.

==== 4. Coleção `Alertas`

- **_id**: Identificador único do alerta.
- **usuarioId**: ID do usuário relacionado ao alerta.
- **grupoId**: ID do grupo onde o alerta foi gerado.
- **tipoAlerta**: Tipo de alerta (e.g., "Sentimento negativo", "Palavra crítica detectada").
- **status**: Status do alerta (pendente, em revisão, resolvido).
- **timestamp**: Data e hora da geração do alerta.
- **moderadorId**: ID do moderador responsável pelo atendimento do alerta.


```
