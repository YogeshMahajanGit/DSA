// This file contain an simple example of LS;

const arr = [1, 2, 3, 4, 5, 6, 7];

function linearSearch(arr, target) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      return i;
    }
  }
  return "Not found";
}

console.log(linearSearch(arr, 10));
console.log(linearSearch(arr, 3));
