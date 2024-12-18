console.log("Hello World from TypeScript Syntax");
console.log("Coding is fun" + ", " + "Code makes life so beautiful");

let firstName: string = "Ved";
let lastName: string = "Singh";

//firstName = 1;

// If want to compile only when there is no error in the typeScript then please use the below command for compilation
// tsc -noEmitOnError sample.ts
// The above command does not create the js file when there is any error in the compilation of typeScript

console.log(`Hi, ${firstName} ${lastName}`);
