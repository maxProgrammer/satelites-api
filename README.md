# ๐กsatelites-api๐ก

> Status: Construction ๐ง


### It's a REST API that uses RestTemplate to consume an external REST API to retrieve satellite data and save the result in its database.

<h1 align="center">
  <img alt="Readme" title="Readme" src="https://user-images.githubusercontent.com/87916631/170592637-adbade7a-a155-4259-bb83-726a2b7dbe6a.png"/>
</h1>

## ๐ Fields of SateliteModel are:
+ id
+ name
+ latitude
+ longitude
+ velocity
+ visibility
+ footprint
+ timestamp
+ daynum
+ solar_lat
+ solar_lon
+ units

## ๐ Features
+ GET Rote to consume a external API
+ POST Rote to save the result in it's database

## ๐ค๐ฝ Business Rules

+ In the Get rote can be used to return all satelites or an especific satelite by it's id.

## โ๏ธ Technologies
+ Java 11
+ Spring Boot
+ Maven
+ H2 Database


## ๐ฑ Starters
+ Spring WEB
+ Validation
+ H2 Database
+ Spring Data JPA
+ Lombok
+ Swagger UI

## ๐ช Patterns
+ MVC
+ IOC
+ DTO

## ๐ฒ contact
+ linkedin: https://www.linkedin.com/in/maxwneto/

