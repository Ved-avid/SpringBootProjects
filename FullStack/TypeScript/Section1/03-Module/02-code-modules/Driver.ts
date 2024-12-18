import { Customer } from "./Customer";
let myCustomer = new Customer("Ved", "Singh");

console.log(`Customer is called from different module`);
console.log(
  `Name of the Customer is ${myCustomer.firstName}  ${myCustomer.lastName}`
);
