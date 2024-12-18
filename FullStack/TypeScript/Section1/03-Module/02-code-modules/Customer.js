"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Customer = void 0;
class Customer {
    constructor(_firsName, _lastName) {
        this._firsName = _firsName;
        this._lastName = _lastName;
    }
    set firstName(value) {
        this._firsName = value;
    }
    set lastName(value) {
        this._lastName = value;
    }
    get firstName() {
        return this._firsName;
    }
    get lastName() {
        return this._lastName;
    }
}
exports.Customer = Customer;
