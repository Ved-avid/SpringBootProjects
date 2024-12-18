console.log("Hello World from TypeScript Syntax");
console.log("Coding is fun" + ", " + "Code makes life so beautiful");

let firstName: string = "Ved";
let lastName: string = "Singh";

//firstName = 1;

// If want to compile only when there is no error in the typeScript then please use the below command for compilation
// tsc -noEmitOnError sample.ts
// The above command does not create the js file when there is any error in the compilation of typeScript

console.log(`Hi, ${firstName} ${lastName}`);

let reviews: number[] = [4, 2, 3.5, 5, 1];

// Printing the reviews
for (let i = 0; i < reviews.length; i++) {
  console.log(reviews[i]);
}

// Computing the average
let total: number = 0;
for (let i = 0; i < reviews.length; i++) {
  total += reviews[i];
}

let averageOfReviews = total / reviews.length;
console.log(`The Avergae of the movie reviews is ${averageOfReviews}`);

// Other way for FOR LOOP

let sports: string[] = ["Cricket", "VolleyBall", "FootBall"];
for (let tempSport of sports) {
  if (tempSport == "Cricket") {
    console.log(`My favorite sports is ${tempSport}`);
  } else {
    console.log(tempSport);
  }
}
