# Movie-Management-Spring-Boot-application
Java Development Bootcamp Assignment-2 wherein I created a Spring Boot application which follows the MVC architecture,  uses a Movie model (id, title, genre), stores data in a List&lt;Movie> (no database), implements:  GET /movie, POST /movie and uses @RestController, @Autowired, and @RequestBody.

## Technologies Used
- Java
- Spring Boot
- Maven
- Eclipse IDE

## Features
- Add a movie
- View all movies

## API Endpoints

### GET
GET /getMovie

Returns the list of movies.

### POST
POST /addMovie

Request Body:
{
  "id": 1,
  "title": "Interstellar",
  "genre": "Sci-Fi"
}

## Run the Project

1. Clone the repository.
2. Open it in Eclipse.
3. Run `Nion1Application.java`.
4. Open:
   `http://localhost:8081/getMovie`
   
<img width="960" height="600" alt="Screenshot 2026-06-30 163931" src="https://github.com/user-attachments/assets/f45761cf-78e9-45cd-8f7f-3c4b4bcef0a7" />
