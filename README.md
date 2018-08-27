# testeml
teste ml Leandro

### Installing

Efetue o download do mongoDB 

Na bin do diretorio do mongoDB execute o comando: 

  ./mongod --dbpath /data/mongo 
  
Acesse a raiz do projeto 

execute o comando: 

  mvn clean install 
  
Navegue ate a pasta target 

  execute o comando 
  
    java -jar teste-ml-1.0.0.jar

### URLs API

POST 

http://127.0.0.1:8080/mutant 

Enviar JSON no formato: 
{ 
"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"] 
} 

GET 

http://127.0.0.1:8080/stats 








