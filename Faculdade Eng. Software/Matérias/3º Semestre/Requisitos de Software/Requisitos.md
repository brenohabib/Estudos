---
tags:
  - requisitos
referências: 
data: 2024-05-20
---

## Requisitos

O sistema precisa permitir cadastrar aluno no banco de dados
O sistema precisa processa o Recebimento de pagamento do boleto do aluno
O sistema deve permitir cadastrar alunos, professores e outros funcionários
O sistema pode permitir o cadastramento por biometria
O sistema deve informar todas as disciplinas ligadas aos alunos e professores
O sistema deve permitir o professor calcular as notas por peso ou outras formas comuns
O sistema pode emitir um relatório para fins financeiros
O sistema deve ter um banco de dados com livros acadêmicos
O sistema deve permitir o aluno fazer uma requisição para qualquer departamento
O sistema pode possuir botões e ícones com cantos arredondados

## Atores

Sistema
Alunos
Professores
Financeiro

## Fluxo Principal

1. O professor solicita a alteração das notas de um aluno
2. O sistema busca no banco de dados o aluno em questão, caso não exista o aluno informado, voltar para o passo 1
3. O professor altera as notas necessárias e finaliza as alterações
4. O sistema solicita a confirmação de senha do professor
5. Ao receber a senha correta, o sistema altera as notas do aluno que foram informadas pelo professor

## Fluxo Alternativo

a. Caso o professor informe qualquer nota anormal, o sistema informa para o professor sobre o feito e sugere uma aproximação de uma nota aceitável
b. Caso o professor aceite, o sistema fará um cálculo de proximidade do valor informado pelo professor
c. Se o professor não aceitar, o sistema manterá a nota informada