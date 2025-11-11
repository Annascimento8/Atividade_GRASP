# Projeto Java - Cadastro de Alunos (Padrões GRASP)

## Descrição
Este projeto foi desenvolvido em **Java** com o objetivo de aplicar na prática os princípios **GRASP (General Responsibility Assignment Software Patterns)**, aprendidos na disciplina de **Arquitetura de Software**.  

O sistema simula o **cadastro e listagem de alunos**, aplicando boas práticas de design orientado a objetos, com foco em **baixo acoplamento** e **alta coesão**.  



## Dupla

### Anna Beatriz Nascimento Reis
- Implementou as classes `Aluno` e `AlunoRepositorio`.  
- Aplicou os padrões GRASP **Information Expert**, **Creator** e **Low Coupling**.  
- Responsável pela parte de **modelagem e armazenamento de dados**.  

### Anna Júlia Correa
- Implementou as classes `AlunoController` e `Main`.  
- Aplicou os padrões GRASP **Controller** e **Low Coupling**.  
- Responsável pela **coordenação das ações do sistema e execução principal**.  

---

## Padrões GRASP aplicados

### 🟦 Information Expert (Especialista da Informação)
- **Classe:** `Aluno`  
- **Descrição:** É responsável por armazenar e exibir suas próprias informações (nome e matrícula).  
- **Justificativa:** Segue o princípio de que quem tem os dados é quem deve manipulá-los, tornando o código mais coeso e simples de manter.  

---

### 🟩 Creator (Criador)
- **Classe:** `AlunoRepositorio`  
- **Descrição:** Cria e gerencia os objetos do tipo `Aluno`.  
- **Justificativa:** É a classe que tem a relação lógica com os alunos e, portanto, é a responsável por criá-los e armazená-los.  

---

### 🟨 Low Coupling (Baixo Acoplamento)
- **Classes:** `AlunoRepositorio` e `AlunoController`  
- **Descrição:** As classes se comunicam apenas por métodos públicos e não conhecem detalhes internos umas das outras.  
- **Justificativa:** Isso reduz dependências, facilita manutenção e deixa o sistema mais flexível.  

---

### 🟥 Controller (Controlador)
- **Classe:** `AlunoController`  
- **Descrição:** Controla o fluxo principal do sistema, recebendo as ações do usuário e chamando os métodos adequados.  
- **Justificativa:** Atua como intermediário entre o modelo (`Aluno` e `AlunoRepositorio`) e a execução principal (`Main`), organizando o funcionamento geral.

---
  
 **Disciplina:** Arquitetura de Software  
 **Atividade:** Aplicação prática dos princípios GRASP  
 **Linguagem:** Java


