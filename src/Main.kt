fun main (){
    pets("cat","dog","cow","rabbit")
    towns("harare","mumbai","dodoma","jakarta")
    values(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))

}
fun pets (a:String,b:String,c:String,d:String){
    var animal = arrayOf(a,b,c,d)
    println(animal.contentToString())
    team("hope","jude","rehema")

}
fun towns (a:String,b: String,c: String,d: String){
    var cities = arrayOf(a,b,c,d)
    cities.forEach { cities->
    println(cities.capitalize())

    }

}
fun values(number:Array<Int>){
    var add = number[1]+number[4]
    println(add)
    println(number.indexOf(158))
    var sortedNumber = number.sortedArray()
    println(sortedNumber.contentToString())

}
fun team(a:String,b: String,c: String){
    val people= arrayOf(a,b,c)
    println(people.contentToString())
}