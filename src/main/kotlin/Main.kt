import kotlin.random.Random

fun main(){
    oddNums()
    fizzBuzz()
    guestAge(30)
    guestAge(6)
    guestAge(4)
    println(arrNames(arrayOf("Ndemo", "Veronica", "Hopper Lab", "AkiraChix", "Vee")))
    }
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddNums(){
    for (num in 1..100) {
        if (num % 2 != 0) {
            println(num)
//            println(numbers{.Random.nextInt(0, 100) })
        }
    }

}

//Takes in arrays of names and returns the number of names longer than 5 chars
fun arrNames(names: Array<String>): Int {
    var number = 0
    for (name in names) {
        if (name.length > 5) {
            println(name)
           number ++
        }
    }
    return number
}
//For making decisions depending on age
    fun guestAge(age: Int) {
        when (age) {
            in 0..5 -> println("Milk")
            in 7..14 -> println("Fanta Orange")
            else -> println("Bottle of Coca Cola")
        }
    }

//prints each number from 1 to 100 on a new line."Fizz" for multiples of three "Buzz" for 5 and "FizzBuzz"
//for multiples of both 3 and 5.
    fun fizzBuzz() {
        for (num in 1..100) {
            if(num % 15 === 0){
                println("FizzBuzz")
            }
            else if (num % 3 == 0) {
                println("Fizz")
            }
            else if (num % 5 == 0) {
                println("Buzz")
            }
            else {
                println(num)
            }
        }
    }
