# Zemoga Tweeter Test

This is a project to get information from tweeter and save data in the database

## How to build

To build all the modules run in the project root directory the following command with Maven 3.3.9:

    mvn clean install

## Testing

In EMC we only manage one level of testing contained in the project:

* unit test in core: this show-cases classic unit testing of the code contained in the bundle. To test, execute:

    mvn clean test

## Test ZemogaTestApplicationGetData
Select file and click on run option. it will connect to twwter and publish or get data from tweeter.

## Test ZemogaTestApplication
Select file and click on run option. it will get the data and store into the MySQL database.