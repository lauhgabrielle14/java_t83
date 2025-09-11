package helloworld;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
		
		leia.close();

	}

}

/* COMANDOS QUE USEI PARA COLOCAR ESTE PROJETO NO GITHUB PELO GIT BASH
INICIANDO
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java
$ git init
Initialized empty Git repository in C:/Users/User/Desktop/java/.git/

VENDO O QUE TEMOS (.metadata deve ser ignorada, porque poluiria nosso repositório)
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ ls -a
./  ../  .git/  .metadata/  helloworld/

CRIANDO GITIGNORE
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ touch .gitignore

VENDO SE ELE FOI CRIADO
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ ls -a
./  ../  .git/  .gitignore  .metadata/  helloworld/

VAMOS CRIAR UM NOTE PAD PARA ADICIONAR ESSE CONTEÚDO AQUI : 
.metadata
bin/
tmp/
*.tmp
*.bak
*.swp
*~.nib
local.properties
.settings/
.loadpath
.recommenders
 
# External tool builders
.externalToolBuilders/
 
# Locally stored "Eclipse launch configurations"
*.launch
 
# PyDev specific (Python IDE for Eclipse)
*.pydevproject
 
# CDT-specific (C/C++ Development Tooling)
.cproject
 
# CDT- autotools
.autotools
 
# Java annotation processor (APT)
.factorypath
 
# PDT-specific (PHP Development Tools)
.buildpath
 
# sbteclipse plugin
.target
 
# Tern plugin
.tern-project
 
# TeXlipse plugin
.texlipse
 
# STS (Spring Tool Suite)
.springBeans
 
# Code Recommenders
.recommenders/
 
# Annotation Processing
.apt_generated/
.apt_generated_test/
 
# Scala IDE specific (Scala & Java development for Eclipse)
.cache-main
.scala_dependencies
.worksheet

Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ notepad .gitignore

DEPOIS ADICIONEI OS ARQUIVOS AO NOSSO REPOSITÓRIO
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ git add .

DEI UM COMMIT DO PROJETO
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ git commit -m "Introdução ao Java"
[main (root-commit) 5700ae7] Introdução ao Java
 6 files changed, 153 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 helloworld/.classpath
 create mode 100644 helloworld/.project
 create mode 100644 helloworld/src/helloworld/HelloWorld.java
 create mode 100644 helloworld/src/helloworld/Soma.java
 create mode 100644 helloworld/src/helloworld/Variaveis.java
 
AGORA ABRI O GITHUB, LOGUEI E CRIEI UM REPOSITÓRIO POR LÁ. E DIRECIONEI NOSSO PROJETO AO LINK DO REPOSITÓRIO
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ git remote add origin https://github.com/lauhgabrielle14/java_t83.git

CONFERI SE DEU TUDO OK
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ git remote -v
origin  https://github.com/lauhgabrielle14/java_t83.git (fetch)
origin  https://github.com/lauhgabrielle14/java_t83.git (push)

AGORA FINALMENTE EMPURREI O PROJETO NO REPOSITÓRIO
Lauren Fogaça@DESKTOP-KTMJ06T MINGW64 ~/Desktop/java (main)
$ git push origin main
Enumerating objects: 11, done.
Counting objects: 100% (11/11), done.
Delta compression using up to 12 threads
Compressing objects: 100% (10/10), done.
Writing objects: 100% (11/11), 2.26 KiB | 1.13 MiB/s, done.
Total 11 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/lauhgabrielle14/java_t83.git
 * [new branch]      main -> main

*/