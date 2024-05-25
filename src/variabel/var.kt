package variabel

// reminder

// val = imuttable
// var = muttable

fun main() {
   println(greeting("rifky"))
    println(sum(200 , 100))
    data("rifky" , "tanggerang").forEach { (i , v),  -> println("$i : $v")  }
    println(iteration(10))
    println(login("rifky" , "1243"))
}

fun greeting (name : String) : String {
    return "hello $name";
}

fun sum (a : Int  , b : Int) : Int {
    return a + b;
}

fun data (name : String , place : String) : Map<String , Any> {
    return  mapOf(
        "name" to name ,
        "place" to place
    );
}


fun iteration (sum : Int) :Int {
    var i : Int = 0;
    while (i < sum) {
        println("index ke : $i")
        i++;
    }
    println("\n");
    return  i;
}

fun  login (email : String , password : String) : Boolean {
    return  email.isNotEmpty() && password.isNotEmpty();
}