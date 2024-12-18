console.log("Hello World from TypeScript Syntax");
console.log("Coding is fun" + ", " + "Code makes life so beautiful");
var firstName = "Ved";
var lastName = "Singh";
//firstName = 1;
// If want to compile only when there is no error in the typeScript then please use the below command for compilation
// tsc -noEmitOnError sample.ts
// The above command does not create the js file when there is any error in the compilation of typeScript
console.log("Hi, ".concat(firstName, " ").concat(lastName));
var reviews = [4, 2, 3.5, 5, 1];
// Printing the reviews
for (var i = 0; i < reviews.length; i++) {
    console.log(reviews[i]);
}
// Computing the average
var total = 0;
for (var i = 0; i < reviews.length; i++) {
    total += reviews[i];
}
var averageOfReviews = total / reviews.length;
console.log("The Avergae of the movie reviews is ".concat(averageOfReviews));
// Other way for FOR LOOP
var sports = ["Cricket", "VolleyBall", "FootBall"];
for (var _i = 0, sports_1 = sports; _i < sports_1.length; _i++) {
    var tempSport = sports_1[_i];
    if (tempSport == "Cricket") {
        console.log("My favorite sports is ".concat(tempSport));
    }
    else {
        console.log(tempSport);
    }
}
// Arrays are growable in TypeScript
sports.push("BasketBall");
sports.push("Golf");
sports.push("Cycling");
console.log("After adding few more sports");
for (var _a = 0, sports_2 = sports; _a < sports_2.length; _a++) {
    var tempSports = sports_2[_a];
    console.log(tempSports);
}
