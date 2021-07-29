# Taxi Service
![taxi](https://i.pinimg.com/originals/97/51/e1/9751e19970fa9e8c5c51ca18533bbb6f.jpg)

The goal of this project is to create a taxi service with authentication system, custom injector, annotations and all the features that might come in handy while managing the app:

* During the first launch you will be redirected to a login page where you have two opportunities:
    * register a new driver
    * login as a previously registered driver
* To use all features you need to create new driver and authenticate
* Driver can add himself to different cars
* All of the remaining functionality you can find by starting the app
## Implementation details and technologies
Project based on 3-layer architecture:
* Presentation layer (controllers)
* Application layer (services)
* Data access layer (DAO)
## Technologies
* Apache Tomcat
* Servlet
* JDBC
* MySQL
* JSTL
* HTML, CSS
* JSP
## Setup
1. Configure Apache Tomcat
2. Install MySQL and MySQL Workbench
3. Create a schema and all the necessary tables by using the script from resources/init_db.sql in MySQL Workbench
4. In the /util/ConnectionUtil.java class change the "user" and "password" properties to the ones you specified when installing MySQL
5. In the `src/main/resources/log4j2.xml` at line 
   `File name = "File" fileName = "logs\app.log"`
   you need to change `"logs\app.log"` with absolute path to `.log` file)   
6. Start the application
