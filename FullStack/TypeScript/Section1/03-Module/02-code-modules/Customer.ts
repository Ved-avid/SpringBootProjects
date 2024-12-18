export class Customer {
  constructor(private _firsName: string, private _lastName: string) {}

  public set firstName(value: string) {
    this._firsName = value;
  }

  public set lastName(value: string) {
    this._lastName = value;
  }

  public get firstName(): string {
    return this._firsName;
  }

  public get lastName(): string {
    return this._lastName;
  }
}
