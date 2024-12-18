"use strict";
class Customer {
    constructor(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    getFirstName() {
        return this.firstName;
    }
    getLastName() {
        return this.lastName;
    }
}
let customer2 = new Customer("John", "Doe");
console.log(`Our first customer to Buy the MacBook is ${customer2.getFirstName()} ${customer2.getLastName()}`);
// To Generate the tsconfig.json file run tsc --init command in the parent folder.
