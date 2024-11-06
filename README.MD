# Repositorio de aulas Java 

Exercicios realizados durante aulas Java durante segundo semestre 2024

Os exercicios propostos podem ser vistos em [exercicios-java.pdf](exercicios-java.pdf)

# Teorias e Práticas do Java

## Introdução ao Java

Java é uma linguagem de programação orientada a objetos, baseada em classes e projetada para ser portável e fácil de usar. Ela é amplamente utilizada para criar aplicações de grande porte, desde sistemas web até dispositivos móveis, devido à sua robustez, segurança e facilidade de manutenção. O Java é conhecido pela sua característica **Write Once, Run Anywhere** (WORA), o que significa que uma aplicação Java pode ser executada em qualquer plataforma que tenha a Java Virtual Machine (JVM).

## Teorias Fundamentais do Java

### 1. **Orientação a Objetos (OO)**
   Java é uma linguagem orientada a objetos, o que significa que ela organiza o código em "objetos". Cada objeto é uma instância de uma classe e pode conter tanto dados (atributos) quanto comportamentos (métodos). Os conceitos principais da programação orientada a objetos incluem:

   - **Encapsulamento**: Esconde os detalhes internos de um objeto e expõe apenas o necessário.
   - **Herança**: Permite que uma classe herde as características e comportamentos de outra.
   - **Polimorfismo**: Permite que uma única interface seja usada para diferentes tipos de objetos.
   - **Abstração**: O processo de simplificar sistemas complexos, focando no que é essencial e escondendo os detalhes.

### 2. **Tipos de Dados e Tipagem Estática**
   Java possui tipagem estática, o que significa que o tipo de cada variável deve ser definido no momento da declaração. Isso ajuda a evitar erros em tempo de execução e melhora a performance.

   - **Tipos primitivos**: int, float, char, double, etc.
   - **Referências**: Objetos e arrays são tipos de referência e são manipulados por meio de ponteiros.

### 3. **Controle de Fluxo**
   O controle de fluxo no Java é feito por meio de estruturas de decisão (if, switch), laços de repetição (for, while) e controle de exceções (try, catch, throw).

### 4. **Java Collections Framework**
   O Java Collections Framework oferece uma estrutura abrangente para armazenar e manipular grupos de objetos. As coleções são amplamente utilizadas para manipular dados de forma eficiente.

   - **Listas**: `ArrayList`, `LinkedList`.
   - **Conjuntos**: `HashSet`, `TreeSet`.
   - **Mapas**: `HashMap`, `TreeMap`.

### 5. **Concorrência e Multithreading**
   A programação multithread é um aspecto importante em Java, onde múltiplos threads de execução podem ser usados para realizar tarefas simultaneamente, melhorando o desempenho de aplicações.

   - **Thread**: Um processo independente dentro de uma aplicação.
   - **ExecutorService**: Interface para gerenciar pools de threads.

## Práticas Comuns no Desenvolvimento Java

### 1. **Boas Práticas de Codificação**
   - **Uso de convenções de nomenclatura**: Seguir convenções de nomenclatura como `camelCase` para variáveis e métodos, e `PascalCase` para classes e interfaces.
   - **Documentação de código**: Utilizar comentários Javadoc para documentar classes, métodos e atributos.
   - **Refatoração**: Melhorar a estrutura interna do código sem alterar seu comportamento externo, tornando-o mais legível e eficiente.

### 2. **Testes em Java**
   - **JUnit**: Framework popular para testes unitários em Java. Ele permite a criação de testes automatizados para garantir que o código funcione conforme esperado.
   - **Mockito**: Usado para criar mocks de objetos e testar interações sem depender de componentes externos.

### 3. **Gerenciamento de Dependências**
   - **Maven**: Ferramenta de automação de compilação que gerencia dependências e facilita o processo de construção do projeto.
   - **Gradle**: Outra ferramenta de automação de compilação, que é mais flexível e pode ser usada para projetos Java, Android e outros.

### 4. **Desenvolvimento de APIs e Microservices**
   - **Spring Boot**: Framework amplamente utilizado para criar microserviços e APIs RESTful, oferecendo convenções de configuração automática.
   - **JAX-RS**: API Java para construção de serviços RESTful.

### 5. **Gerenciamento de Exceções**
   O tratamento de exceções é essencial para garantir que o sistema lide adequadamente com erros. Exceções são usadas para capturar falhas e impedir que o programa termine inesperadamente.

   - **Exceções verificadas (checked exceptions)**: Exceções que o compilador exige que sejam tratadas ou declaradas.
   - **Exceções não verificadas (unchecked exceptions)**: Exceções que não precisam ser obrigatoriamente tratadas, como `NullPointerException`.

## Conclusão

Java continua sendo uma das linguagens de programação mais populares devido à sua robustez, flexibilidade e grande ecossistema de bibliotecas e frameworks. Ao seguir as melhores práticas de programação e entender os conceitos fundamentais da linguagem, você estará bem preparado para desenvolver aplicações escaláveis e de alto desempenho.

