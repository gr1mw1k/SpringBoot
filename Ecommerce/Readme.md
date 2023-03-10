# FrameWorks and Language Used
* SpringBoot
* Java

# Data Flow
* Controller - Rest Controller

Used with @GetMapping, @RequestMapping, @PutMapping, @RequestBody, @RequestParam, @Nullable, @DeleteMapping and @AutoWired and linked with the business logic in the Service Class

* Services

1. Create users
2. Create products
3. Create Address
4. Place an order (Create Order) using userId, productId, addressId
5. Get order by order id
6. Get user by userid
7. Get all products
    - Get products based on category (query params)
8. delete products based on product id.

* Repository

  Jpa Repository is used which extends CRUD Respository
  
* DataBase Design

 ###### We have a tables of Users, Products, Address and Order 
 ###### It has all the attributes of user, product, address and order class as table columns
 ###### We have used foreign keys to join our tables to create link between Address with User, also Order with Product, Address and User 
 

# Data Structure Used

H2 Database

# Project Summary 
* This a simple Ecommerce API
* You can add and manage User details
* You can add and manage product details
* You can add and manage Address details
* You can create Orders
* All the details are added in the H2 for easier data viewing via table of User 
  
