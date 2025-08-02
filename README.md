# DesafioPractio01DWF
  _________            .__              __________               __   
 /   _____/____________|__| ____    ____\______   \ ____   _____/  |_ 
 \_____  \\____ \_  __ \  |/    \  / ___\|    |  _//  _ \ /  _ \   __\
 /        \  |_> >  | \/  |   |  \/ /_/  >    |   (  <_> |  <_> )  |  
/_______  /   __/|__|  |__|___|  /\___  /|______  /\____/ \____/|__|  
        \/|__|                 \//_____/        \/                    

This is a small project about a bookstore in API REST on SpringBoot Java framework what has search facture add facture on data base h2 what save tables of h2 and can display database information in index.html

<h1>Requeriments</h1>
- Java Azul Zulu 17+
- Maven
- IntelliJ IDEA (optional)
<h1>How to Run</h1>
bash
git clone https://github.com/tuusuario/DesafioPractico01DWF.git
cd DesafioPractico01DWF
   
Run the project in inteliji IDEA or type  mvn spring-boot:run in terminal

then in your browser go to http://localhost:8080/ to display index.html page what has al the factures and go to http://localhost:8080/api/books if you whant to see the api and the data what is stored in ./data directory

<h3>To see want to see the database</h3>
Go to search bar and type http://localhost:8080/h2-console
the credentials, driver, datasource and password are:
url=jdbc:h2:./data:bookdb
driverClassName=org.h2.Driver
.username=sa
password=(leave empty)

<h1></h1>
    Ever Gabriel Cabezas Alfaro
    Luis Enrique Cartagena Arteaga

