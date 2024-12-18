"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const Customer_1 = require("./Customer");
let myCustomer = new Customer_1.Customer("Ved", "Singh");
console.log(`Customer is called from different module`);
console.log(`Name of the Customer is ${myCustomer.firstName}  ${myCustomer.lastName}`);
