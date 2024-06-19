### User Registration API Endpoint

**Endpoint:** `/api/user/register`  
**Method:** `POST`

This endpoint is used to register a new user. The client must send a POST request with the user's details in the request body. The necessary details include `username`, `email`, and `password`. Upon successful registration, the server will automatically generate a unique user ID and return it in the response along with the provided username and email.

**Request Body:**
- `username` (string): The desired username for the new user.
- `email` (string): The email address of the new user.
- `password` (string): A secure password chosen by the user.

**Response:**
- `userId` (string): A unique identifier generated by the server for the new user.
- `username` (string): The username provided in the request.
- `email` (string): The email address provided in the request.
- `message` (string): A confirmation message indicating successful registration.
---

### User Fetch API Endpoint

**Endpoint:** `/api/user/fetch`  
**Method:** `GET`

This endpoint is used to fetch details of a registered user. The client must send a GET request to this endpoint. The server will respond with the user's information, including the user ID, username, and email.

**Response:**
- `userId` (string): The unique identifier of the user.
- `username` (string): The username of the user.
- `email` (string): The email address of the user.


By using these endpoints, clients can efficiently register new users and retrieve user information as needed. The automated generation of user IDs ensures that each user has a unique identifier, enhancing the integrity and management of user data.
