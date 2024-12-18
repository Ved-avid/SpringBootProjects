class Customer1 {
  // Traditional way to create a constructor

  //private _firstName: string;
  //private _lastName: string;
  //constructor(firstName: string, lastName: string) {
  //  this._firstName = firstName;
  //  this._lastName = lastName;
  //}

  constructor(private _firstName: string, private _lastName: string) {}

  public get firstName(): string {
    return this._firstName;
  }

  public get lastName(): string {
    return this._lastName;
  }

  public set firstName(firstName: string) {
    this._firstName = firstName;
  }

  public set lastName(lastName: string) {
    this._lastName = lastName;
  }
}

let myCustomer = new Customer1("ved", "Singh");

console.log(
  `The Customer name is ${myCustomer.firstName} ${myCustomer.lastName}`
);
