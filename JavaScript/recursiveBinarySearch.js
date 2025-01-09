let numbers = [1, 2, 3, 4, 5, 6, 7];

function recursiveBinarySearch(arr, target) {
  if (arr.length === 0) return false;

  let mid = Math.floor(arr.length / 2);

  if (arr[mid] === target) return true;
  else if (arr[mid] < target) {
    return recursiveBinarySearch(arr.slice(mid + 1), target);
  } else {
    return recursiveBinarySearch(arr.slice(0, mid), target);
  }
}

console.log(recursiveBinarySearch(numbers, 12));
console.log(recursiveBinarySearch(numbers, 4));
