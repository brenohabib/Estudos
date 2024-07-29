---
tags:
  - banco_de_dados
referências: 
data: 2024-07-25
---
### Modelo Conceitual

Um modelo conceitual está mais próximo da visão que o usuário tem dos dados, descrevendo quais dados devem ser armazenados pela aplicação e como esses dados se relacionam.

Entidades possuem propriedades e **comum**:

- **Cardinalidade** nos modelos: Cardinalidade refere-se ao número de entidades que participam de um relacionamento. Por exemplo, um departamento pode ter muitos funcionários (relação um-para-muitos), mas um funcionário pertence a um único departamento (relação muitos-para-um).
    
- **Entidades** são representadas por retângulos, as entidades possuem atributos. Por exemplo, uma entidade "Aluno" pode ter atributos como "Nome", "Matrícula", "Data de Nascimento".
    

### Tipos de Atributos

Existem 6 tipos de atributos:

- **Simples e Monovalorado**: Um atributo que não pode ser dividido em subpartes significativas. Por exemplo, "Idade" de uma pessoa.
    
- **Atributo Chave**: Um atributo que identifica unicamente uma entidade dentro de um conjunto de entidades. Por exemplo, "Matrícula" de um aluno.
    
- **Atributo Composto**: Um atributo que pode ser subdividido em partes menores. Por exemplo, "Endereço" pode ser subdividido em "Rua", "Número", "Cidade", "Estado".
    
- **Multivalorado**: Um atributo que pode ter mais de um valor. Por exemplo, "Telefones" de uma pessoa pode incluir vários números de telefone.
    
- **Atributo Derivado**: Um atributo cujo valor pode ser derivado de outros atributos. Por exemplo, "Idade" pode ser derivada do atributo "Data de Nascimento".
    

### Chave Primária

> [!hint] O que é?
> 
> - **Chave Primária** é um atributo ou conjunto de atributos que identificam unicamente uma entidade dentro de um conjunto de entidades. Por exemplo, o número de matrícula de um aluno em uma universidade.

### Entidades Fracas

> [!hint] O que são?
> 
> - **Entidade Fraca** não possui atributo chave primária por si só, não é possível definir uma chave primária, nem simples, nem composta e depende de outra entidade. Por exemplo, "Dependente" é uma entidade fraca porque não faz sentido sem a entidade "Empregado". Um dependente depende da existência de um empregado para existir no banco de dados.

### Exemplo Prático

#### Entidades e Relacionamentos

Imagine um sistema de gerenciamento de uma escola. Nele, temos as seguintes entidades e relacionamentos:

- **Entidade Aluno**
    - Atributos: Matrícula (Chave Primária), Nome, Data de Nascimento
- **Entidade Curso**
    - Atributos: Código (Chave Primária), Nome, Duração
- **Relacionamento Matricula**
    - Relacionamento entre Aluno e Curso, com atributos como Data de Matrícula

