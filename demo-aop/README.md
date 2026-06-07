# Sprng AOP Demo

[![Spring Boot](https://shields.io)](https://spring.io)
[![Maven](https://shields.io)](https://apache.org)
[![Java](https://shields.io)](https://oracle.com)

This project has been created to learn and practice Spring Aspect functionality. It also serves as a poc project for advanced concepts which can be used later in complex projects.

---

##Detailed explanation
 * 1. The class annotated with @Aspect is an aspect which handles cross cutting concerns.
 * 2. @Before @After @Around @AfterReturning and @AfterThrowing are Advices. 
 * Corresponding annotated methods will be executed accordingly.
 * 3. Argument in the Advice methods are the @PointCut expressions.
 * The expressions determine where the Advice execution point will be mapped for execution.</br>
 * 4. The argument of the implemented method accepts a JoinPoint and it determines the point 
 * where the Advice method and the method in execution are joined together for invoking advice method.
 * 5. The argument have various types, "execution" is used most commonly.
 * 6. Syntax, "execution(* com.learn.aop.demo_aop..*.*(..))" signifies,
 * 	a. First * signifies access modifier(public/private etc. * means all)
 *  b. Second package,  com.learn.aop.demo_aop..* signifies all classes inside demo_aop directory and sub-directories.
 *  c. Third, ..*.* signifies all methods inside those classes.
 *  d. Fourth, (..) indicates any number or arguments/types inside those methods.
 * 7. If more than one advice has same joint point, then, more generic is executed first and then, in order.

## 🚀 Features

*   **Advice**: Determines at which point in execution the aspect methods(advice) will be executed.
*   **RESTful APIs**: Exposes secure, well-documented endpoints.
*   **Database Integration**: As of now, No database integration has been added.

## 🛠️ Tech Stack & Prerequisites

Before running this project, ensure you have the following installed:

*   **Java Development Kit (JDK)**: Version 17 or 21
*   **Apache Maven**: Version 3.x+ (or use the included Maven Wrapper `./mvnw`)
*   **Database**: [NA]
*   **IDE**: Eclipse

## ⚙️ Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/shku3824/Spring-Learning-Projects.git
cd your-repo-name
```

### 2. Configure Environment Variables
No environment variables set yet.


### 3. Build the Application
Compile the project and download all necessary Maven dependencies:

```bash
# On Linux/macOS
./mvnw clean install

# On Windows
mvnw.cmd clean install
```

### 4. Run the Application
Start the Spring Boot embedded Tomcat server:

```bash
# On Linux/macOS
./mvnw spring-boot:run

# On Windows
mvnw.cmd spring-boot:run
```
The application will start on port `8080` by default: `http://localhost:8080`

---

## 🛣️ API Endpoints

Once the application is running, you can access the following primary endpoints.


| Method | Endpoint | Description | Auth Required |
| :--- | :--- | :--- | :--- |
| **GET** | `/checkOut` | For checkout message | No |
| **POST** | `/payment` | For payment message | No |
| **GET** | `/shipment` | For shipment message | No |

> 💡 **API Documentation**: If Swagger/OpenAPI is integrated, the UI dashboard can be accessed at `http://localhost:8080/swagger-ui/index.html` while the app is running.

---

## 🧪 Testing

To execute unit and integration tests using JUnit 5 and Mockito, run:

```bash
./mvnw test
```

## 📦 Deployment

To package the application into a single executable production JAR file:

```bash
./mvnw clean package -DskipTests
```
The generated JAR file will be located in the `target/` directory:
```bash
java -jar target/your-app-name-0.0.1-SNAPSHOT.jar
```

---

## 👥 Contributors

*   **Shrey Kumar** - *Initial Work* - (https://github.com/shku3824/)
