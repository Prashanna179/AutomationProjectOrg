const a = [10,20,30,40,50,60];

console.log(a);

console.log(a.includes(100));

console.log(a.slice(1,4));
console.log(a);

a[1]=100;
console.log(a);

console.log("*******Reduce********")
let marks = [10,20,30,40,50];
let total = marks.reduce((sum,mark)=>sum+mark,0)
console.log("total mark is " + total);



console.log("*******Filter********")
var scores = [12,13,14,16]
var evenscores =[]
for(let i=0;i<scores.length;i++)
{
    if(scores[i]%2==0)
    {
        evenscores.push(scores[i])
    }
}
console.log(evenscores)

let filterarray = scores.filter(score=>score%2==0)
console.log(filterarray)


console.log("*******Map********")

let mappedArray = filterarray.map(score=>score*3);
console.log(mappedArray)


console.log("*******Sort********")

let cars = ["BMW","Volvo","Audi"];
cars.sort();
console.log(cars);
cars.reverse();
console.log(cars);

var numbers = [12,3,19,16,14]
numbers.sort((a,b)=>a-b)
console.log(numbers);

numbers.sort((a,b)=>b-a)
console.log(numbers)


