# LOMBOK 
1.Avoid Repetitive Code jar : org.projectlombok
2.Getters/Setters, Constructors – So Repetitive : @Getter @Setter @NoArgsConstructor
3.Value Classes/DTO’s : @RequiredArgsConstructor @Accessors(fluent = true) @Getter
4.Core Java Boilerplate : @ToString  @EqualsAndHashCode
5.The Builder Pattern : @Builder
6.Checked Exceptions Burden : @SneakyThrows
7.Ensure Your Resources are Released : @Cleanup
8.Annotate Your Class To Get a Logger : @Slf4j
9.Write Thread-Safer Methods : @Synchronized
10.Automate Objects Composition : @Delegate(types = {HasContactInformation.class})

# Pre Requesting 
 
1.JDK 1.8

2.IDE (eclipse or Netbeans)

3.Maven 

4.apache tomcat 8+

5.MySql server

6.REST client (eg. Postman )

# How  project works.

Step 1:open project form any Spring pluging enable Ide 
Step 2: change databse configurate at application context file
Step 3:run spring boot application via command line or form Ide
If run from Ide then   run spring main file under packge com.payment


# Send file via rest client 

Api url: http://localhost:8080/upload

Http Metohd :POST

Content:From-Data


Other Rest Api

For Cutomer Info:

API=http://localhost:8080/customer/list

billing information

API =http://localhost:8080/customer/bills

Http Method:GET

billing Pay information

API=http://localhost:8080/customer/bill/payments

Http Method:GET

