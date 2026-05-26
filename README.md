# 🎓 Abstraindo um Bootcamp Usando Orientação a Objetos em Java

Projeto desenvolvido durante a formação **Java Developer** da **DIO (Digital Innovation One)** com o objetivo de praticar os principais conceitos de **Programação Orientada a Objetos (POO)** utilizando Java.

## 📚 Objetivo

Modelar um sistema de gerenciamento de bootcamps onde desenvolvedores podem se inscrever em conteúdos, progredir nos estudos e acumular experiência (XP).

O projeto foi criado para aplicar conceitos fundamentais de orientação a objetos, como:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo
- Collections
- Stream API
- Classes Abstratas
- Sobrescrita de Métodos

---

## 🏗️ Estrutura do Projeto

### Conteúdo
Classe abstrata que representa qualquer conteúdo educacional do bootcamp.

Atributos:
- título
- descrição

Método abstrato:
- `calcularXp()`

### Curso
Representa um curso dentro do bootcamp.

Atributos:
- carga horária

Implementa:
- cálculo de XP baseado na carga horária

### Mentoria
Representa uma mentoria realizada dentro do bootcamp.

Atributos:
- data

Implementa:
- cálculo de XP com bônus adicional

### Bootcamp
Responsável por agrupar conteúdos e desenvolvedores inscritos.

Atributos:
- nome
- descrição
- data inicial
- data final
- conteúdos
- desenvolvedores inscritos

### Dev
Representa o aluno participante do bootcamp.

Funcionalidades:
- inscrição em bootcamp
- progressão nos conteúdos
- cálculo de XP total acumulado

---

## ⚙️ Tecnologias Utilizadas

- Java 17+
- IntelliJ IDEA
- Programação Orientada a Objetos
- Collections Framework
- Stream API

---

## 🚀 Executando o Projeto

1. Clone o repositório

```bash
git clone https://github.com/marialuizakoerich/projeto-dio-poo
```

2. Abra o projeto na IDE de sua preferência.

3. Execute a classe:

```java
Main.java
```

---

## 💻 Exemplo de Execução

```text
Conteúdos Inscritos:
[Curso Java, Curso Python, Mentoria Java]

Conteúdos Concluídos:
[Curso Java, Curso Python]

XP: 140.0
```

---

## 🎯 Conceitos Aplicados

Durante o desenvolvimento foram praticados:

- Modelagem de domínio
- Relacionamento entre objetos
- Uso de Set e LinkedHashSet
- Optional
- Stream API
- Métodos equals() e hashCode()
- Sobrescrita do método toString()
- Herança e Polimorfismo

---

## 👩‍💻 Autora

Maria Luiza Koerich

