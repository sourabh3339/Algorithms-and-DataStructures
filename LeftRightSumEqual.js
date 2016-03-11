/*left and right sum of elements in a array equal to which element*/


var inputArr = [1, 2, 3, 5, 1, 5];


function findElement(arr) {
    var len = arr.length;
    var sumLeft = 0;
    var sumRight = 0;
    for (var i = 1; i < len - 2; i++) {

        for (var left = 0; left < i; left++) {
            sumLeft = sumLeft + arr[left];
        }

        for (var right = len - 1; right > i; right--) {
            sumRight = sumRight + arr[right];
        }

        if (sumLeft == sumRight) {
            console.log('equality at element ' + sumLeft + ':' + sumRight + ':: ' + arr[i]);
        }

        sumLeft = 0;
        sumRight = 0;

    }


}

findElement(inputArr);
