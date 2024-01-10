
# Challenge Description
Create a service that accepts the necessary information and sends emails. It should provide an abstraction between two different email provider services. If one of them goes down, your service should quickly tolerate the outage and switch to a different provider without affecting its clients.

Email Provider Used: 

* [Amazon SES](http://aws.amazon.com/ses/) - [Simple Send Documentation](http://docs.aws.amazon.com/ses/latest/APIReference/API_SendEmail.html)

  
## Installation

1. Clone the repository:

```bash
git clone https://github.com/allen-21/desafio-Uber-backend.git
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=user
aws.secretKey=user
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "Valteranibal1@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```
*************
Most of the content was taken from [Fernanda Kipper's video](https://youtu.be/eFgeO9M9lLw), which I am using for my studies on clean architecture and microservices with Java.
