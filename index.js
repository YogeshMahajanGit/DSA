console.log("Hello World~~~");

// function reverse(str) {
//   let reverseStr = "";

//   //   for (let char of str) {
//   //     reverseStr = char + reverseStr;
//   //   }

//   //   return reverseStr;

//   return str.split("").reverse().join("");
// }

// console.log(reverse("Hello World~~~"));

// function reverseNum(num) {
//   return parseInt(num.toString().split("").reverse().join("")) * Math.sign(num);
// }

// console.log(reverseNum(-1453323));

// function palindrome(str) {
//   const reverStr = str.split("").reverse().join("");

//   if (reverStr === str) return true;

//   return false;
// }

// console.log(palindrome("non"));

// function maxChar(str) {
//   let obj = {};
//   let max = 0;
//   let maxChar = "";

//   for (let char of str) {
//     obj[char] = ++obj[char] || 1;
//   }

//   for (let key in obj) {
//     if (obj[key] > max) {
//       max = obj[key];
//       maxChar = key;
//     }
//   }

//   return maxChar;
// }

// console.log(maxChar("hfifnnf lkwlmkvroooooooompvkwmv"));

// function chuck(arr, size) {
//   const output = [];
//   let index = 0;

//   while (index < arr.length) {
//     output.push(arr.slice(index, index + size));
//     index += size;
//   }
//   return output;
// }

// console.log(chuck([1, 2, 3, 4, 5], 2));

// this is me
// my word is very big

// function chapitalFirstWord(str) {
//   return str
//     .split(" ")
//     .map((ele) => ele[0].toUpperCase() + ele.slice(1))
//     .join(" ");
// }

// console.log(chapitalFirstWord("my word is very big"));
// console.log(chapitalFirstWord("this is me"));
// console.log(chapitalFirstWord("title of movies, pic, video and other word"));

// function helper(str) {
//   const obj = {};

//   const arr = str.toLowerCase().replace(/[\W]/g, "");

//   for (let ele of arr) {
//     obj[ele] = obj[ele] + 1 || 1;
//   }

//   return obj;
// }

// function anagrams(str1, str2) {
//   let obj1 = helper(str1);
//   let obj2 = helper(str2);

//   if (Object.keys(obj1).length !== Object.keys(obj2).length) return false;

//   for (let key in obj1) {
//     if (obj1[key] !== obj2[key]) return false;
//   }

//   return true;
// }

// console.log(anagrams("Guum", "muoug"));
// console.log(anagrams("RAIL! Safety!", "fairy tales"));
// console.log(anagrams("Old England", "golden land"));

// function helper(str) {
//   return str.toLowerCase().replace(/[\W]/g, "").split("").sort().join("");
// }

// function anagrams(str1, str2) {
//   return helper(str1) === helper(str2);
// }

// console.log(anagrams("Guum", "muoug"));
// console.log(anagrams("RAIL! Safety!", "fairy tales"));
// console.log(anagrams("Old England", "golden land"));

var a = "string";

if (true) {
  var a = "new string";
  console.log(a);
}
console.log(a);
