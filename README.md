# swagger-mongodb-test01

project illustrating Java swagger rest api, mongodb persistence, and angular4 client

### Project Setup

Add Maven Support

> * [Edit pom.xml](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/pom.xml)
> * [Edit web.xml](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/web/WEB-INF/web.xml)
> * [SwaggerBootstrap.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/SwaggerBootstrap.java)
> * [ApiOriginFilter.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/ApiOriginFilter.java)
> * [AllAuthorizationFilterImpl.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/AllAuthorizationFilterImpl.java)

### Bring in Generated Code - api

> * [factories / PlanetsApiServiceFactory.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/factories/PlanetsApiServiceFactory.java)
> * [impl / PlanetsApiServiceImpl.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/impl/PlanetsApiServiceImpl.java)
> * [ApiException.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/ApiException.java)
> * [ApiOriginFilter.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/ApiOriginFilter.java)
> * [ApiResponseMessage.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/ApiResponseMessage.java)
> * [Bootstrap.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/Bootstrap.java)
> * [JacksonJsonProvider.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/JacksonJsonProvider.java)
> * [NotFoundException.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/NotFoundException.java)
> * [PlanetsApi.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/PlanetsApi.java)
> * [PlanetsApiService.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/PlanetsApiService.java)
> * [RFC3339DateFormat.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/RFC3339DateFormat.java)
> * [StringUtil.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/api/StringUtil.java)

### Bring in Generated Code - model

> * [Moon.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/model/Moon.java)
> * [Planet.java](https://github.com/datumgeek/swagger-mongodb-test01/blob/master/src/main/java/com/technicalmedia/data/universe/model/Planet.java)

### Project Structure - Add dependent packages

### Project Structure - Add swagger web contents

### Return Hardwired Resrouce Data for Planets and Moons

### Angular Client - ag-grid to display Planets

### Angular Client - ag-grid to expand a Planet to display its Moons

### MongoDB Install

### Resource Method to Create Sample Data in MongoDB

### Return MongoDB Resource Data for Planets and Moons

### Resource Method to Add Planet

### Angular Client - Add Planet

### Enhance Add Planet to Add Moons also

### Enhance Angular Client - Add Moons with Planet

### Aggregation Resource for Planet Stats

### Angular Client - Display Stats
