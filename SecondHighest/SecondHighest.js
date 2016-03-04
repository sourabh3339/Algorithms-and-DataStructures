/*second highest in array*/

var arr = [-1, 0, 14, 13, 11,14, 2, 34];

arr = arr.sort(function(a, b) {
    return b - a; });

var len = arr.length;
console.log("array is: "+arr);
for (var i = 0; i < len - 1; i++) {
    if (arr[i + 1] != arr[i]) {
        console.log(arr[i + 1]);
        break;
    }
}
