# Restaurants in Baltimore

This is a full stack web application, that uses data provided by OpenBaltimore, specifically, the Restaurants data.
The data is loaded from the URL end point, through their REST API.

This data is then loaded to an RDS instance that I created on AWS.

This data is then used for CRUD operations in Hibernate.

You can do the following through the User Interface:

1. Load data to the database

2. Perform Insert/Update

3. View data

4. Sort data

5. Perform search on data
## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 
### Prerequisites

What things you need to install the software and how to install them
1. IDE - Preferrably Eclipse IDE

2. Jdk-1.8 configured in the IDE - Or Configure the jdk version that you have in settings.xml file of your .m2 in maven
   -> I have included the sample settings.xml file
   -> Change the JAVA_1_8_HOME path with your jdk path in settings.xml in your .m2 folder
   ->settings.xml will be located in your maven .m2 folder. If not create a settings.xml in .m2 folder
   
3. Server - type the command "tomcat7:run" if using IDE or "mvn tomcat7:run" if using command line


### Installing

Download the zip or clone the project
1. Import the project as existing Maven Project in your IDE
2. Update Maven project, so that all dependencies are up to date
3. Clean the project
4. Run maven - "clean install"
5.Run the command "tomcat7:run" with maven
This will start the server
7. Copy the URL that is shown when the server starts up and run it on your browser



