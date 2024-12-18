var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Customer.prototype.getFirstName = function () {
        return this.firstName;
    };
    Customer.prototype.getLastName = function () {
        return this.lastName;
    };
    return Customer;
}());
var customer = new Customer("John", "Doe");
console.log("Our first customer to Buy the MacBook is ".concat(customer.getFirstName(), " ").concat(customer.getLastName()));
