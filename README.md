# 🖥️ Helpdesk Java

Sistema de gerenciamento de chamados de suporte técnico (N1) via linha de comando, desenvolvido em Java puro — sem frameworks e sem banco de dados.

![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen?style=for-the-badge)
![Interface](https://img.shields.io/badge/interface-CLI-4B5563?style=for-the-badge&logo=gnubash&logoColor=white)

---

## 📌 Sobre o projeto

Projeto de estudo criado para praticar **orientação a objetos** e **estruturas de dados** em Java, simulando o fluxo básico de um helpdesk: o funcionário relata um problema, o chamado é registrado com data e status, e pode ser consultado ou encerrado depois.

O sistema roda inteiramente no terminal e mantém os chamados em memória durante a execução.

---

## ✨ Funcionalidades

- [x] **Abrir chamado** — registra nome do funcionário e descrição do problema
- [x] **Listar chamados** — exibe todos os chamados com número, data, funcionário, problema e status
- [x] **Consultar chamado** — busca um chamado específico pelo número
- [x] **Encerrar chamado** — altera o status de `Aberto` para `Encerrado`
- [x] **Data de abertura automática** — capturada no momento do registro e formatada como `dd/MM/yyyy HH:mm:ss`
- [x] **Validações** — impede consultar/encerrar chamados com número inválido e evita encerrar um chamado duas vezes

---

## 🚀 Como executar

### Pré-requisitos

- **JDK 8 ou superior** instalado (`java -version` para conferir)

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/Rocksd2/helpdask-java.git

# 2. Entre na pasta do código-fonte
cd helpdask-java/helpdask-java/src

# 3. Compile as classes
javac Chamado.java Main.java

# 4. Execute
java Main
```

Alternativa, compilando a partir da raiz do repositório:

```bash
javac -d out helpdask-java/src/*.java
java -cp out Main
```

---

## 🖱️ Como usar

Ao executar, o menu principal é exibido:

```
===================================
          HELPDESK JAVA
===================================
1 - Abrir chamado
2 - Listar chamados
3 - Consultar chamado
4 - Encerrar chamado
0 - Sair
```

**Exemplo de sessão:**

```
Escolha uma opção:
1
Digite o nome do funcionário:
Ana Souza
Digite o problema encontrado:
Impressora não imprime em rede
Chamado aberto!
```

Depois, ao listar:

```
Chamado #1
Data: 21/10/2026 14:32:07
Funcionário: Ana Souza
Problema: Impressora não imprime em rede
Status: Aberto
-----------------------------------
```

---

## 🗂️ Estrutura do projeto

```
helpdask-java/
├── README.md
└── helpdask-java/
    └── src/
        ├── Chamado.java   # Modelo: funcionário, problema, status e data de abertura
        └── Main.java      # Menu, entrada do usuário e regras do fluxo
```

**`Chamado.java`** — classe de modelo com encapsulamento via getters/setters. O status nasce como `"Aberto"` e a data é definida no construtor da instância, com formatação feita por `DateTimeFormatter`.

**`Main.java`** — laço `do/while` com menu numerado, `switch` para as ações e `ArrayList<Chamado>` como armazenamento em memória.

---

## 🧠 O que foi praticado

- **Orientação a objetos**: classe de modelo com atributos privados e acesso por getters/setters
- **Encapsulamento**: o status só muda por meio do método `setStatus`
- **Collections**: `ArrayList` para manter a lista de chamados
- **API de datas**: `LocalDateTime` e `DateTimeFormatter` para registrar e exibir a abertura
- **Controle de fluxo**: `do/while`, `switch` e validação de índices antes de acessar a lista
- **Entrada de dados**: `Scanner` com tratamento do `nextInt()` + `nextLine()` (evitando o problema de quebra de linha pendente)

---

## ⚠️ Limitações conhecidas

Este é um projeto de estudo, não um sistema pronto para produção:

- **Sem persistência** — os chamados existem apenas em memória e são perdidos ao fechar o programa
- **Sem identificador único** — o "número" do chamado é a posição na lista, então muda se houver remoção
- **Sem prioridade ou categoria** — todo chamado é tratado igual
- **Sem autenticação** — qualquer pessoa que abrir o terminal pode encerrar chamados

---

## 🛣️ Próximos passos

- [ ] Salvar e carregar chamados de um arquivo (`.txt`, `.csv` ou SQLite)
- [ ] Criar um `enum` para o status (`ABERTO`, `EM_ANDAMENTO`, `ENCERRADO`)
- [ ] Adicionar prioridade (baixa, média, alta) e filtro por status
- [ ] Gerar ID único por chamado
- [ ] Separar as regras de negócio do menu, criando uma classe de serviço
- [ ] Escrever testes com JUnit

---

## 👤 Autor

**Alexander Protasio**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/alexander-protasio-26a84222a/)
[![GitHub](https://img.shields.io/badge/GitHub-121011?style=flat-square&logo=github&logoColor=white)](https://github.com/Rocksd2)
[![Email](https://img.shields.io/badge/Email-D14836?style=flat-square&logo=gmail&logoColor=white)](mailto:alexanderprotasio@gmail.com)
