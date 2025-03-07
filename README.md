# Projeto: Cofrinho de Moedas em Java

## Introdução

Este projeto consiste na implementação de um sistema que emula um "Cofrinho de Moedas" desenvolvido em Java utilizando a IDE Eclipse. O objetivo principal é aplicar os conceitos de **herança** e **polimorfismo**, pilares fundamentais da programação orientada a objetos (POO), para criar uma estrutura flexível e reutilizável.

O sistema permite ao usuário gerenciar moedas de diferentes valores e países, oferecendo as seguintes funcionalidades:

- **Adicionar moedas**: O usuário pode adicionar moedas de diversos países, como Dólar, Euro e Real, ao cofrinho.
- **Remover moedas**: É possível remover moedas específicas do cofrinho.
- **Listar moedas**: O sistema lista todas as moedas armazenadas no cofrinho.
- **Calcular total em Real**: O valor total das moedas é convertido para a moeda Real (BRL), proporcionando uma visão consolidada do conteúdo do cofrinho.

A estrutura do projeto é baseada em uma hierarquia de classes, onde a classe **Moeda** é uma classe abstrata que serve como base para as classes específicas de cada tipo de moeda (Dolar, Euro, Real, etc.). A classe **Cofrinho** contém uma coleção de moedas, que pode ser implementada utilizando um `ArrayList` ou outra estrutura de dados adequada.

Além disso, o projeto inclui uma classe **Principal** que gerencia a interação com o usuário por meio de um menu intuitivo. A implementação de classes extras, métodos e atributos adicionais fica a critério do desenvolvedor, permitindo a customização e expansão do sistema conforme necessário.

Este trabalho visa não apenas reforçar os conceitos de POO, mas também demonstrar a aplicação prática desses conceitos em um contexto real, proporcionando uma experiência de desenvolvimento completa e desafiadora.
