class Customer {
  private firstName: string;
  private lastName: string;

  constructor(firstName: string, lastName: string) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public getFirstName(): string {
    return this.firstName;
  }

  public getLastName(): string {
    return this.lastName;
  }
}

let customer2 = new Customer("John", "Doe");
console.log(
  `Our first customer to Buy the MacBook is ${customer2.getFirstName()} ${customer2.getLastName()}`
);
