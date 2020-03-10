import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import java.io.BufferedReader
import java.io.File

fun getJsonDataFromAsset(s:String): JsonObject {
    return Parser().parse(s) as JsonObject
}

fun printJsonDataToAsset(passedJson:JsonObject, s:String){
    val file = File(s)
    file.writeText(passedJson.toJsonString(true))
}