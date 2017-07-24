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
2. Jdk-1.8 configured in the IDE - Or Configure the jdk version that you have in settings.xml file 0f your .m2 in maven
3. Server - Apache Tomcat v7.0 configured to run the project in your IDE

### Installing

Download the zip or clone the project
1. Import the project as existing Maven Project in your IDE
2. Update Maven project, so that all dependencies are up to data
3. Run maven clean install
4. Build project with maven build
5. Configure the build path according your Jdk version
   -> Update the path to your jdk in settings.xml file once you build the project through Maven Build.
   ->settings.xml will be located in your maven .m2 folder
6. Clean the project
7. Run on Server
8. Copy the URL and run it on your browser



