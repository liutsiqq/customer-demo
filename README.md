This is a microservices API demo for MINT.

It has 2 controllers
A: ConsumerController which has 
  1. List customers
  
  
B: CustomerController which has
  2. Create a new customer
  3. Update a customer
  4. Deletes a customer   

I just use the H2 db for simple demo.
And corrensponding test cases are located under src/test.
Should add an AOP layer to deal with the user authentication and authorization.
