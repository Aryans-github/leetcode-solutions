/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
    }
};
// let f = createHelloWorld();
// f();
/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */