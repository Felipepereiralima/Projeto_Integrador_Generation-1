# Task 2 + Projeto Integrador – Rede Social


## 1) Mostrar o DER 

Esse link mostrará o DER -> https://dbdesigner.page.link/5WXRadPFn8FitgFh6

Link para o PDF -> https://github.com/Caroline-Calixto/Projeto-Integrador/blob/main/Task%202/Task2_Projeto_integrador.pdf

## 2) Motivo da escolha

Esse link mostrará o nosso resumo -> https://docs.google.com/document/d/1zjLeTcb5Bk8GInNubUINGyvD6O1RooczoExQeJET0S0/edit?usp=sharing

<div>

### Tb_usuario
 
* E-mail: escolhemos para ser a chave primária porque ele não se repete.

* Nome: para identificação do usuário.

* Senha : para segurança da conta.

### Tb_postagem
* id_postagem: é utilizado como a primary key da tabela.

* título: será o texto da postagem do usuário.

* texto: é a parte da tabela onde o usuário irá colocar suas postagens em forma de texto.

* curtida: é utilizado como contador para o número de curtidas de cada postagem.

* imagem: é a parte da tabela onde o usuário irá colocar suas postagens em forma de imagem, vídeo, pdf ou word...

* fk_email: chave estrangeira importada da tb_ usuário.

* fk_id_tema: chave estrangeira importada da tb_tema.

### Tb_tema
* Categoria: Escolhemos esse atributo pois ele se relacionará com a tabela de postagem e será como um identificador para facilitar a leitura do usuário.

* salvar:  É um atributo que permitirá que o usuário salve as postagens e tenha fácil acesso a elas posteriormente. Ele é do tipo binário por representar apenas as opções “SIM” ou “NÃO”.

* alta_dia: boolean: Atributo utilizado para identificar se uma postagem estará em alta ou não.


<br>

## 3) DER do Blog Pessoal 

 
 <img src = "https://github.com/Caroline-Calixto/Projeto-Integrador/blob/main/Task%202/Task2_Projeto_Integrador.png"> </img>
      

## 4) Código em SQL 

     CREATE TABLE `tb_usuario` (
      `email` varchar(100) NOT NULL,
      `nome` varchar(100) NOT NULL,
      `senha` varchar(8) NOT NULL,
       PRIMARY KEY (`email`)
    );

    CREATE TABLE `tb_postagem` (
      `id_postagem` bigint NOT NULL AUTO_INCREMENT,
      `titulo` varchar(255) NOT NULL,
      `texto` varchar(8000) NOT NULL,
      `curtida` int NOT NULL,
      `imagem` longblob NOT NULL,
      `fk_email` varchar(100) NOT NULL,
      `fk_id_tema` bigint NOT NULL,
      PRIMARY KEY (`id_postagem`)
    );

    CREATE TABLE `tb_tema` (
      `id_tema` bigint NOT NULL AUTO_INCREMENT,
      `categoria` varchar(255) NOT NULL,
      `salvar` BINARY NOT NULL,
      `alta_dia` BOOLEAN NOT NULL,
      PRIMARY KEY (`id_tema`)
    );

    ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`fk_email`) REFERENCES `tb_usuario`(`email`);

    ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`fk_id_tema`) REFERENCES `tb_tema`(`id_tema`);



