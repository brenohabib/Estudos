---
tags:
  - estimativa
referências: 
data: 2025-07-28
---
# **Estimativa de Custos de Software - Resumo Didático**

## **1. Modelos de Software**

- **SaaS (Software as a Service)**: Software entregue como serviço (assinatura, cloud-based).
    Google Workspace, Netflix, WoW.

- **SAP (Software as a Product)**: Software vendido como produto (licença única, instalável).
    Microsoft Office (versão tradicional), Photoshop.

---

## **2. Métodos de Estimativa**

### Métodos Imprecisos (Equivalentes)

- Baseado em projetos similares já realizados.
    
- **Vantagem**: Rápido.
    
- **Desvantagem**: Pouco preciso, depende de referências.

### Estimativa por Funcionalidades

- Analisa cada funcionalidade do sistema e estima tempo/custo individualmente.
    
- **Ex**: Cadastro de usuário (5h), Relatório de vendas (10h).

### Estimativa por Tempo Gasto

- Baseado no tempo que a equipe levará para desenvolver.
    
- **Desafio**: Depende da produtividade da equipe.

### Estimativa por KLOC (Linhas de Código)

- Calcula custo com base no número de linhas de código (KLOC = mil linhas).
    
- **Problema**: Linguagens diferentes têm densidades distintas.

### Estimativa por Custo de Desenvolvimento

- Considera salários da equipe, infraestrutura, licenças, etc.

### Estimativa por Empresas Especializadas

- Contratação de consultorias para avaliar custos.
Estimativa por Juízes (Especialistas)

- Profissionais experientes avaliam e estimam o projeto.

### Estimativa por Prototipage

- Criação de um MVP (Mínimo Produto Viável) para validar esforço real.

---

## **3. Modelo COCOMO II**

- **COCOMO (Constructive Cost Model)**: Método robusto para estimar custo, tempo e equipe.
    
- **COCOMO II**: Versão mais moderna, adaptável a metodologias ágeis.
    
- **Fatores considerados**:
    
    - Tamanho do projeto (KLOC).
        
    - Complexidade.
        
    - Experiência da equipe.
        
    - Ferramentas utilizadas.
        

---

## **4. Pontos de Função (Análise de Pontos de Função - APF)**

Mede a funcionalidade do software com base em:

1. **Entradas ou Saídas Externas**: Telas, relatórios.
    
2. **Consultas Externas**: Buscas em bancos de dados.
    
3. **Arquivos Internos**: Dados armazenados no sistema.
    
4. **Arquivos Externos**: Dados compartilhados com outros sistemas.
    

**Vantagem**: Independe da linguagem de programação.

---

## **5. Gerações de Linguagem**

|Geração|Tipo|Exemplo|
|---|---|---|
|1ª|Linguagem de Máquina|Código binário|
|2ª|Assembly|Linguagem de baixo nível|
|3ª|Alto nível (estruturada)|C, Pascal|
|4ª|Muito alto nível (orientada a objetos)|Java, Python|
|5ª|Linguagem natural/IA|SQL, Prolog|

Quanto maior a geração, mais abstrata e produtiva.

---

## **6. Tipos de Sistemas**

- **Sistemas Embarcados**: Software integrado a hardware (eletrodomésticos, carros).
    
- **Sistemas em Tempo Real**: Resposta imediata (controle de tráfego aéreo).

---

## **7. Tipos de Programas**

| Tipo            | Característica                  | Exemplo             |
| --------------- | ------------------------------- | ------------------- |
| **Iterativos**  | Estruturas de repetição         | For ou While        |
| **Monolíticos** | Código único, sem modularização | Sistemas legados    |
| **Recursivos**  | Funções que chamam a si mesmas  | Cálculo de fatorial |

---

## **8. Formas de Solução de Problemas**

| Método                      | Descrição                                              | Aplicação                |
| --------------------------- | ------------------------------------------------------ | ------------------------ |
| **Dividir para Conquistar** | Divide o problema em partes menores                    | Merge Sort, Quick Sort   |
| **Método Guloso**           | Escolhe a melhor opção local (nem sempre ótima global) | Algoritmo de Dijkstra    |
| **Programação Dinâmica**    | Armazena resultados intermediários                     | Fibonacci com memoização |
| **Backtracking**            | Testa possibilidades e retrocede se falhar             | Resolução de labirintos  |
