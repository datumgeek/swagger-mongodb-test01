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

### Run it

![image](https://user-images.githubusercontent.com/22680176/27684934-4d3ec7e2-5c89-11e7-9d63-7797a1c67b5e.png)

### Return Resrouce Data for Planets and Moons

![image](https://user-images.githubusercontent.com/22680176/27786634-2a0db102-5f9f-11e7-8628-d2af68a410d3.png)

### Angular Client - create angular project

Copy Path

![image](https://user-images.githubusercontent.com/22680176/27790862-abd88e40-5faf-11e7-81e7-c90c3194ce5a.png)

(install Git for Windows & ConEmu)

Run ConEmu - Change to Folder - Install Angular CLI

![image](https://user-images.githubusercontent.com/22680176/27791122-c82ef1e6-5fb0-11e7-881d-acfdec3106b6.png)

Create the project

![image](https://user-images.githubusercontent.com/22680176/27791204-2c9ecb24-5fb1-11e7-98c4-1b147e45f3aa.png)

![image](https://user-images.githubusercontent.com/22680176/27791381-f5011ef0-5fb1-11e7-9746-320452f4dc1a.png)

Invoke Angular CLI build (in ConEmu) - watch mode will rebuild the bundle whenever the .ts, .scss, and .html files change

![image](https://user-images.githubusercontent.com/22680176/27792188-c5f93ed6-5fb5-11e7-8e58-b0b49b4eab05.png)

Add Angular bundle "dist" folder to web folder output

![image](https://user-images.githubusercontent.com/22680176/27792499-3ba73916-5fb7-11e7-8996-20c4d2ea385f.png)

Run it and view the output

![image](https://user-images.githubusercontent.com/22680176/27792585-b53da2c4-5fb7-11e7-8e42-724f151db1ca.png)

### Install bootstrap 4 alpha and ng-bootstrap

![image](https://user-images.githubusercontent.com/22680176/27895396-b8fa0c30-61cf-11e7-8042-24e0f4e438dd.png)

update styles in `angular-cli.json`

![image](https://user-images.githubusercontent.com/22680176/27906468-e04cd57a-6200-11e7-90e5-a64b0f7c32b8.png)

### Install FontAwesome Icons

![image](https://user-images.githubusercontent.com/22680176/27907323-761c5226-6204-11e7-816e-64cf365d74e8.png)

![image](https://user-images.githubusercontent.com/22680176/27907358-8f816030-6204-11e7-8a3f-ff69dd0f0e2c.png)

![image](https://user-images.githubusercontent.com/22680176/27907411-ca83116a-6204-11e7-91c7-7c5c8b013c46.png)

![image](https://user-images.githubusercontent.com/22680176/27907554-55180ef2-6205-11e7-8f51-f3fb37298878.png)

### Add Menu and Routes

Generate Main Menu component

![image](https://user-images.githubusercontent.com/22680176/27908390-c3969896-6208-11e7-86e6-48a65fd47806.png)

Add Main Menu component to App Component

![image](https://user-images.githubusercontent.com/22680176/27908390-c3969896-6208-11e7-86e6-48a65fd47806.png)

Add Menu Template (HTML)

![image](https://user-images.githubusercontent.com/22680176/27941070-dd4d3d0c-628b-11e7-8e2a-aab8c07cde32.png)

Add Menu and Router Outlet to App Template (HTML)

![image](https://user-images.githubusercontent.com/22680176/27941104-22ff8a58-628c-11e7-9f5a-28cf2083f0bb.png)

Add Planets Component

![image](https://user-images.githubusercontent.com/22680176/27941255-f2ba0eb2-628c-11e7-851f-eb12ec818dd4.png)

Add Menu and Planet Components to App Module.  Add Routes also.

![image](https://user-images.githubusercontent.com/22680176/27941181-9197f540-628c-11e7-927e-2c1ab8f46708.png)

And VOILA !! :)

![image](https://user-images.githubusercontent.com/22680176/27941318-530a9d9a-628d-11e7-8055-7e0656238d92.png)

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
