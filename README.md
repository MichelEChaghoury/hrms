# HRMS (Human Resource Management System)

HRMS is a web application built with Spring Boot that provides a comprehensive solution for managing human resources within an organization. It offers features such as employee management, leave management, performance tracking, and more.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Oracle 21C
- JUnit5

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher (jAVA 17 LTS preferable)
- Oracle Database or any compatible relational database management system
- Gradle (or use the Gradle Wrapper included in the project)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/MichelEChaghoury/hrms.git
    ```

2. Navigate to the project directory:

    ```bash
    cd hrms
    ```

3. Configure the database:

    - Open `src/main/resources/application.properties`
    - Update the database connection properties according to your setup

4. Build and run the application:

    - Using Gradle Wrapper

    ```bash
    ./gradlew spring-boot:run
    ```

    - Using Gradle

    ```bash
    mvn spring-boot:run
    ```

5. Access the application:
    - Open your web browser and visit [!http://localhost:8080](http://localhost:8080) (or the port configured in `application.yml`)
