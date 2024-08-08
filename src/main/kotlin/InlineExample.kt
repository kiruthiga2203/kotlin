class InlineExample {

    inline fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    fun sum(a: Int, b: Int): Int {
        return performOperation(a, b) { x, y -> x + y }
    }

    fun multiply (a:Int,b:Int):Int{
        return (a * b)
    }

}

fun main() {
    val inlineExample = InlineExample()

    val addition = inlineExample.sum(2,3)
    val multi = inlineExample.multiply(3,4)

    val subtract = inlineExample.performOperation(13, 4) { x, y -> x - y }

    println("The sum of a and b is $addition")
    println("The multiply of a and b is $multi")
    println("The mSubtraction of a and b is $subtract")

}


//Learnings:

//inline function: instead of calling the function and having it do the work separately,
//the instructions (or code) of the function are directly placed where you need them.
//This can save time and effort, especially if you're calling functions very often!

//Where and when to use
//1.When we have small tasks that to be called frequently
//2.Logging
//3. Lambda or Higher order function
//4.Utility class, Helper clas and extension class

//Advantages:
//Efficiency and performance

//Donot use for complex logic and larger functions which makes the function bloat

// inline will optimize the code and we could not see that while debugging
