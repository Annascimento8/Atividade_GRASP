# 💻 Projeto Java - Aplicando Princípios GRASP

## 🎯 Tema
Sistema simples de loja (e-commerce) que permite cadastrar e listar produtos.

## 👥 Dupla
- Anna Beatriz Nascimento Reis  
- Anna Júlia Correa

---

## 🧠 Padrões GRASP aplicados

### 🧩 1. Creator (Criador)
- **Aplicado na classe `Loja`**.
- Responsável por **criar e gerenciar produtos**.
- Segue o princípio de que uma classe que contém ou controla objetos de outra deve ser responsável por criá-los.

### 📊 2. Information Expert (Especialista da Informação)
- **Aplicado na classe `Produto`**.
- A classe possui as informações necessárias (preço e quantidade) para calcular o valor total do estoque.
- Mantém a lógica de negócio dentro da classe que detém os dados.

### 🎮 3. Controller (Controlador)
- **Aplicado na classe `SistemaController`**.
- Controla o fluxo do programa, recebendo entradas e acionando métodos das outras classes.
- Funciona como o “maestro” do sistema.

### 🔗 4. Low Coupling e High Cohesion
- **Baixo Acoplamento**: as classes são independentes e se comunicam por meio de métodos públicos.
- **Alta Coesão**: cada classe tem uma única responsabilidade bem definida, facilitando manutenção e legibilidade.

---

## 🧰 Execução
1. Compile e execute `SistemaController.java`.
2. No menu, escolha:
   - `1` para adicionar produtos
   - `2` para listar os produtos cadastrados
   - `0` para sair

---

## 🗃️ Banco de Dados
O arquivo `script_criacao_bd.sql` contém a estrutura base de um sistema de e-commerce, usada como inspiração para o projeto.
