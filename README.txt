PROJECT WAS CREATED  BY USING ( HTML, JAVA, SPRING BOOT[framework],Mysql[database]
PROCESS:
  Step:1 Get the data from user by using front-end page.
  Step:2 Using springboot  framework to proces the data to store the data in Mysql database
    1.In springBoot use (entity,Controller,Respotry, Service, application ) java files to process the data 
    2.In this project file names and Dependancy
    
    java files as
    --------------
        1.data.java
        2.dataController.java
        3.FileStorageService.java
        4.ResponseFile.java
        5.ResponseMessage.java
        6.ResumeApplication.java
        7.studentRespotry.java
      
      HTML file as
      -------------
          1.studentwebsit.html    // Front-end page for get the data from the user 
          2.studentlist.html      //This HTML page display the data 
      Dependency as
      ---------------
        X.Thymeleaf
        X.Mysql driver
        X.springData JDBC
        X.spring web service
        X.springweb
      
  Step:3 In this project  use the localhost to database
  step:4 In Mysql database  create a database name as "student" and table name as "data"
  setp:5 Using the springBoot framework to connect the database by "applicationproperty" file in that (localhost:3306/student) 
