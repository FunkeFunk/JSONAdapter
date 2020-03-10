import java.util.*

fun main(args: Array<String>) {

    val parsedJsonObject = getJsonDataFromAsset("example.json")

    println("Parsed JSONObject: ${parsedJsonObject.toJsonString(true)}")

    val reader = Scanner(System.`in`)
    print("Enter your key: ")

    val jsonKey:String = reader.nextLine()
    if(!parsedJsonObject.containsKey(jsonKey)){
        println("Requested key does not exist, please specify value for new key")
        print("Enter your value: ")
        val jsonValue:String = reader.nextLine()
        parsedJsonObject.putIfAbsent(jsonKey, jsonValue)
    } else {
        println("Found requested key in JSON Map, please specify new value for key")
        print("Enter your value: ")
        val jsonValue:String = reader.nextLine()
        parsedJsonObject.replace(jsonKey, jsonValue)
    }

    println("Saving your json edit!")
    printJsonDataToAsset(parsedJsonObject, "edited.json")
    println("Edited file composed, enjoy!")
}