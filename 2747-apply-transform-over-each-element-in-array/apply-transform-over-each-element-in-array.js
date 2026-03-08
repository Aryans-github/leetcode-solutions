/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let myArray = new Array(arr.length); 
    for(let i = 0; i < arr.length; i++){
        myArray[i]=fn(arr[i],i);
    }
    return myArray;
};