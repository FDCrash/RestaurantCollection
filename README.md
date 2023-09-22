# Restaurant Collection
## API

You can check API in swagger docs

- /restaurant - adding a new restaurant.
  Body:
```
  {
    "id": "1",
    "city": "Miami",
    "name": "Byg Company",
    "estimatedCost": 1600,
    "averageRating": "4.9",
    "votes": "16203"
  }
```
- /restaurant/{id} - updating restaurant rating - averageRating and votes.
  Body:
```
  {
    "averageRating": "4.9",
    "votes": "16203"
  }
```
- /restaurant - getting all restaurants.
- /restaurant/query?city={city} - getting all restaurants in a particular city.
- /restaurant/query?id={id} - getting restaurant by id - return the details of the singular restaurant.
- /restaurant/{id} - deleting restaurant by id.
- /restaurant/sort - sort the restaurants according to rating.

## Getting Started

### Dependencies

* Java 11
* SpringBoot 2.7.15
* Liquibase 4.6.2
* PostgreSQL

### Installing

#### Requirements

* PostgreSQL
* Docker

#### Download
``` 
git clone https://github.com/FDCrash/RestaurantCollection.git
```

### Executing program

```
cd RestaurantCollection
```
Describe application file parameteres:
* spring.datasource.url
* spring.datasource.username
* spring.datasource.password
```
mvn clean install
docker build -t restaurant:latest .
docker run restaurant:latest
```

## Authors

[@FDCrash](https://github.com/FDCrash)
