var s = "Prashanna ";
console.log(s.length);
s= s.trim();
console.log(s.length);

let splitString = s.split("h")
console.log(splitString)
console.log(splitString[0]);
console.log(splitString[1]);

let a = "6"
let b ="98"

let diff = parseInt(b)-parseInt(a);
console.log(diff);
console.log(typeof(diff));

let diff1 = diff.toString();
console.log(diff1);
console.log(typeof(diff1));


let z = "Tuesday" + " is a funday";
console.log(z);

let value = z.indexOf("day")
count =0;
while(value!==-1)
{
    count++
    value = z.indexOf("day",value+1)

}

console.log(count);

//Email Validation

ValidateEmail("prashannarg@gmail.com")

function ValidateEmail(input) {

    var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
  
    if (input.value.match(validRegex)) {
  
      alert("Valid email address!");
  
      document.form1.text1.focus();
  
      return true;
  
    } else {
  
      alert("Invalid email address!");
  
      document.form1.text1.focus();
  
      return false;
  
    }
  
  }