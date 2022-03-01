<h2 align="center">Uma aplicação Java web para Blogs!</h2>

<p align="center">
 <a href="#-sobre">Sobre</a> •
 <a href="#-requisitos">Pré requisitos</a> • 
 <a href="Execução">Execução</a> • 
 <a href="#-tecnologias">Tecnologias</a> • 
</p>


## 🎯 Sobre 

 Construção de um Blog onde o usuário vai poder publicar conteúdos pessoais e escrever sobre qualquer tipo de assunto do seu interesse e conhecimento.

<h2 align="center">Página Principal.</h2>

![print projeto](https://user-images.githubusercontent.com/82779533/156189871-c183b0e6-4a4b-4e6a-abdc-78ebdca7dadb.png)
<br><br>

<h2 align="center">Página para novos Posts.</h2>

![print projeto 2](https://user-images.githubusercontent.com/82779533/156190389-7b39dd8e-d993-42a8-bd05-9dd0706d1044.png)
<br><br>

 ## 🚀 Requisitos
1. Baixe uma IDE de sua preferência, recomendo o [Intellij](https://www.jetbrains.com/pt-br/idea/download/).
2. Baixe o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR).
3. Instale o [JDK](https://www.oracle.com/java/technologies/downloads/).
4. E por fim Baixe o [PostgreSQL](https://www.postgresql.org/download/).
<br><br>

## 🏁 Execução
- Primeiramente crie um banco no postgreSQL
```
create database codeblog;
```
- Depois disso vá até a classe **DummyData** e retire o comentário da anotação **@PostConstruct** para adicionar os dois usuários dessa classe, depois disso Rode o projeto. Para visualizar se deu certo a inserção dê um select!
```
select * from tb_post;
```
- Agora com o banco de dados configurado, você vai poder visualizar as principais funcionalidades do blog. OBS: Lembre-se de comentar novamente a anotação **@PostConstruct** para não inserir novamente os mesmos usuários.

- É importante lembrar também que essa aplicação contem o **Spring Security**! Para fazer novos posts é preciso fornecer o usuário e senha que estão na classe **SecurityConfig**
<br><br><br>

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/)
- [Bootstrap](https://getbootstrap.com/)
- [Thymeleaf](https://www.thymeleaf.org/)
