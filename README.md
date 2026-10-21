# 🛠️ Helpdesk Java

Um sistema simples e eficiente de gestão de chamados desenvolvido em Java. O projeto permite a abertura, listagem, consulta e encerramento de chamados de suporte técnico, simulando a operação de um Help Desk.

## 🚀 Funcionalidades

- **Abrir Chamado:** Registra o nome do funcionário e a descrição do problema.
- **Listar Chamados:** Exibe todos os chamados registrados, incluindo data, hora, funcionário, problema e status.
- **Consultar Chamado:** Permite visualizar os detalhes completos de um chamado específico através do seu número.
- **Encerrar Chamado:** Altera o status de um chamado para "Encerrado", finalizando o atendimento.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Conceitos Aplicados:**
  - Programação Orientada a Objetos (POO)
  - Encapsulamento (Getters e Setters)
  - Coleções (`ArrayList`)
  - Manipulação de Datas (`java.time.LocalDateTime`)
  - Estruturas de Controle (`Switch case`, `Do-While`)

## 📁 Estrutura do Projeto

```text
helpdask-java/
└── src/
    ├── Main.java      # Classe principal com a lógica do menu e interações
    └── Chamado.java   # Classe de modelo que representa um chamado de suporte
```

## ⚙️ Como Executar

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado em sua máquina.
2. Clone ou baixe o repositório.
3. Navegue até a pasta `src`.
4. Compile o projeto:
   ```bash
   javac Main.java Chamado.java
   ```
5. Execute a aplicação:
   ```bash
   java Main
   ```

## 📝 Exemplo de Uso

Ao iniciar o programa, você verá o seguinte menu:
```text
===================================
          HELPDESK JAVA
===================================
1 - Abrir chamado
2 - Listar chamados
3 - Consultar chamado
4 - Encerrar chamado
0 - Sair
Escolha uma opção: 
```
