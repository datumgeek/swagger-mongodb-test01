# swagger-mongodb-test01

project illustrating Java swagger rest api, mongodb persistence, and angular4 client

> * See Also: [Generating REST web api service from api.yaml using maven plugin](https://github.com/datumgeek/swagger-codegen-test01#swagger-codegen-test01)
> * See Also: [Java Jersey REST Swagger Angular4+ Recipe](https://github.com/datumgeek/jersey-rest-test03/edit/master/README.md)

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

### Return Resource Data for Planets and Moons

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

Add Menu Template (HTML)

![image](https://user-images.githubusercontent.com/22680176/27941070-dd4d3d0c-628b-11e7-8e2a-aab8c07cde32.png)

Add Menu and Router Outlet to App Template (HTML)

![image](https://user-images.githubusercontent.com/22680176/27941104-22ff8a58-628c-11e7-9f5a-28cf2083f0bb.png)

Generate Planets Component

![image](https://user-images.githubusercontent.com/22680176/27941255-f2ba0eb2-628c-11e7-851f-eb12ec818dd4.png)

Look at Generated Components

![image](https://user-images.githubusercontent.com/22680176/27941534-3657b178-628e-11e7-9edd-b6e8d77a570a.png)

Add Menu and Planet Components to App Module.  Add Routes also.

![image](https://user-images.githubusercontent.com/22680176/27941181-9197f540-628c-11e7-927e-2c1ab8f46708.png)

And VOILA !! :)

![image](https://user-images.githubusercontent.com/22680176/27941318-530a9d9a-628d-11e7-8055-7e0656238d92.png)

### Add ***Deep Linking*** Support

> Angular2+ does client-side routing.  The Angular app interprets the routes and displays the correct page.  An issue can arrise when the user starts at one of these client-side routes.  The web server tries to perform the route and fails.  What we want is to redirect such routes to the `index.html` page that loads the Angular app, and then when the Angular app loads, it will correctly route the request.

Easy solution (but a bit clunky since it still returns the 404) is to add the following to the `web.xml`:

```
<error-page>
    <error-code>404</error-code>
    <location>/</location>
</error-page>
```

A better solution is described [here](http://javaee.ch/2017/04/12/how-to-solve-the-redirection-404-error-in-angular-using-java/) using a spring controller.  A filter is probably the correct solution, but isn't explored here.

### Setup CSS Flexbox for Layout

> Flexbox solves the difficult problem of making a recursive division of the display that can grow to fill the remaining space.  This works vertically and horizontally.  In this section, we'll setup the application styles and component styles for the planets component so that when we place the ag-grid in the planets component (in the next section), it will grow to fill the available space.

> We'll be looking at the main style sheet, the app component and the planets componnet and showing how to set up a div that can contain our ag-grid.  This div will resize to fill the available space, and so will our ag-grid that is contained within it (as we'll see in the next section).

![image](https://user-images.githubusercontent.com/22680176/27979517-eaca7550-6333-11e7-81f9-e444b1c170aa.png)

> * ***styles.scss***

![image](https://user-images.githubusercontent.com/22680176/27979273-dee667fa-6331-11e7-945f-2c7aea97edab.png)

> * app component (***app.component.html*** and ***app.component.scss***)

![image](https://user-images.githubusercontent.com/22680176/27979361-ac0898ac-6332-11e7-999b-c500648c3982.png)

![image](https://user-images.githubusercontent.com/22680176/27979381-e4eccfc6-6332-11e7-8941-dce28ba1d9e4.png)

> * planets component (***planets.component.html*** and ***planets.component.scss***)

![image](https://user-images.githubusercontent.com/22680176/27979407-1e4f05f4-6333-11e7-9c97-dd5c3c1ab662.png)

![image](https://user-images.githubusercontent.com/22680176/27979457-77203086-6333-11e7-9a79-f25ae290b215.png)

### Generate TypeScript proxy client for our REST Web API

Install [NSwag Studio](https://github.com/NSwag/NSwag#nswag-the-swagger-open-api-toolchain-for-net-web-api-and-typescript)

Run the project in IntelliJ IDEA (we need a URL to our swagger.json file)

Inspect the ***swagger.json*** data (this is metadata for our REST Web API)
> * http://localhost:8080/swagger/
> * http://localhost:8080/rest/swagger.json

Run NSwag Studio, and enter ***swagger.json*** URL, and save the NSwag project

![image](https://user-images.githubusercontent.com/22680176/27984780-9e133982-639b-11e7-94e4-c86bf619d34d.png)

Edit NSwag TypeScript generator settings, then Generate TypeScript client

![image](https://user-images.githubusercontent.com/22680176/27984845-753e7c68-639d-11e7-8981-29143ba9a2ca.png)

See the generated TypeScript client in the project

![image](https://user-images.githubusercontent.com/22680176/27984930-2174a290-639f-11e7-961d-471e7a9ad92c.png)

### Angular Client - use Dependency Injection to fetch and display Planets list

To use Angular ***Dependency Injection*** (***DI***), we have to register our TypeScript client as a ***Provider***

![image](https://user-images.githubusercontent.com/22680176/27989593-4701887a-63f9-11e7-9832-93d1eaa02326.png)

Now we can inject our generated TypeScript client (***universe-web-api-client.ts***) into the Planets component.  Then we can use the injected client to call the web api and retrieve the planets data.

![image](https://user-images.githubusercontent.com/22680176/27989579-dc088a8c-63f8-11e7-8b36-17a050918887.png)

Once we have the data in the component's ***view model***, we can modify the template to display the data.  We'll use the ag-grid next, but for now we'll keep it simple to focus on the data itself.

![image](https://user-images.githubusercontent.com/22680176/27989646-6cee0c60-63fa-11e7-9474-ab5062683f9d.png)

And the stunning results !! ;)

![image](https://user-images.githubusercontent.com/22680176/27989657-ca375886-63fa-11e7-9ce4-9071fd2e28ce.png)

### Angular Client - ag-grid to display Planets

Right click ***spa*** folder and copy the path.  Launch ConEmu and `cd ` (paste)

Install ag-grid (and its angular helper)

![image](https://user-images.githubusercontent.com/22680176/27984672-f9adf74e-6398-11e7-9db4-1f1eb7a4c34b.png)

Add ag-grid styles to ***angular-cli.json***



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
