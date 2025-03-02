
# **ChatApp using Kafka**  

## **Overview**  
This project demonstrates a simple **real-time chat system** built using **Apache Kafka**. The application follows a **publisher-subscriber** model, where one user sends messages (producer) and others receive them (consumer) in a decoupled and scalable manner.  

## **Technologies Used**  
- **Programming Language:** Java  
- **Framework:** Spring Boot  
- **Messaging System:** Apache Kafka  

## **Principles of Kafka**  

### **What is Apache Kafka?**  
Apache Kafka is a **distributed event streaming platform** used for real-time data pipelines and messaging systems. It allows applications to **publish**, **store**, **process**, and **subscribe** to streams of records efficiently.  

### **Key Concepts in Kafka**  

1. **Producer**: Sends messages to a Kafka topic.  
2. **Consumer**: Reads messages from a Kafka topic.  
3. **Topic**: A logical channel to which producers publish messages and consumers subscribe.  
4. **Broker**: A Kafka server that stores data and handles message distribution.  
5. **Partition**: A way to split a topic into multiple logs to enable parallelism.  
6. **Consumer Group**: A group of consumers that collectively consume messages from a topic in a load-balanced manner.  

## **Features of ChatApp**  
✅ Real-time message exchange between users  
✅ Scalable and fault-tolerant architecture using Kafka  
✅ Asynchronous and event-driven communication  
✅ Multiple users can subscribe to chat topics  

## **Project Setup**  

### **1. Clone the Repository**  
```sh
git clone <repository-url>
cd chatapp-kafka
```

### **2. Install Dependencies**  
Make sure you have **Java 17+** and **Apache Kafka** installed. Then, install required dependencies via **Maven**:  
```sh
mvn clean install
```

### **3. Start Kafka and Zookeeper**  
Kafka requires **Zookeeper** to manage brokers. Start both:  
```sh
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
```

### **4. Create Kafka Topics**  
```sh
bin/kafka-topics.sh --create --topic chat-messages --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1
```

### **5. Run the Application**  
```sh
mvn spring-boot:run
```
The chat service is now up and running!  

### **6. Send Messages**  
Use an API tool like **Postman** or `curl` to send messages to the Kafka topic:  
```sh
POST http://localhost:8080/api/chat/send
Content-Type: application/json

{
  "sender": "Alice",
  "message": "Hello, how are you?"
}
```

### **7. Receive Messages**  
Consumers subscribed to the Kafka topic will receive messages in real time.  

## **Future Enhancements**  
🚀 Add WebSocket support for real-time chat UI  
🔗 Integrate with a front-end (React, Angular, or Vue)  
🛡️ Implement authentication and user management  
