function binarySearch(arr, target) {
  let first = 0;
  let last = arr.length - 1;

  while (first <= last) {
    let mid = Math.floor((first + last) / 2);

    if (arr[mid] === target) {
      return mid;
    } else if (arr[mid] < target) {
      first = mid + 1;
    } else last = mid - 1;
  }
}

console.log(binarySearch([1, 2, 3, 4, 5], 4));
