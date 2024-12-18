"use strict";
class Customer1 {
    // Traditional way to create a constructor
    //private _firstName: string;
    //private _lastName: string;
    //constructor(firstName: string, lastName: string) {
    //  this._firstName = firstName;
    //  this._lastName = lastName;
    //}
    constructor(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    get firstName() {
        return this._firstName;
    }
    get lastName() {
        return this._lastName;
    }
    set firstName(firstName) {
        this._firstName = firstName;
    }
    set lastName(lastName) {
        this._lastName = lastName;
    }
}
let myCustomer = new Customer1("ved", "Singh");
console.log(`The Customer name is ${myCustomer.firstName} ${myCustomer.lastName}`);
