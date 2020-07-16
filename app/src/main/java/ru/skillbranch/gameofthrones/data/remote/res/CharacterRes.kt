package ru.skillbranch.gameofthrones.data.remote.res

data class CharacterRes(
    val url: String,
    val name: String,
    val gender: String,
    val culture: String,
    val born: String,
    val died: String,
    val titles: List<String> = listOf(),
    val aliases: List<String> = listOf(),
    val father: String,
    val mother: String,
    val spouse: String,
    val allegiances: List<String> = listOf(),
    val books: List<String> = listOf(),
    val povBooks: List<Any> = listOf(),
    val tvSeries: List<String> = listOf(),
    val playedBy: List<String> = listOf()
)

//@Json(name = "url")
//val url: String,
//@Json(name = "name")
//val name: String,
//@Json(name = "gender")
//val gender: String,
//@Json(name = "culture")
//val culture: String,
//@Json(name = "born")
//val born: String,
//@Json(name = "died")
//val died: String,
//@Json(name = "titles")
//val titles: List<String> = listOf(),
//@Json(name = "aliases")
//val aliases: List<String> = listOf(),
//@Json(name = "father")
//val father: String,
//@Json(name = "mother")
//val mother: String,
//@Json(name = "spouse")
//val spouse: String,
//@Json(name = "allegiances")
//val allegiances: List<String> = listOf(),
//@Json(name = "books")
//val books: List<String> = listOf(),
//@Json(name = "povBooks")
//val povBooks: List<Any> = listOf(),
//@Json(name = "tvSeries")
//val tvSeries: List<String> = listOf(),
//@Json(name = "playedBy")
//val playedBy: List<String> = listOf()
//) : IRes {
//    lateinit var houseId: String
//    override val id: String
//    get() = url.lastSegment()
//    val fatherId
//    get() = father.lastSegment()
//    val motherId
//    get() = mother.lastSegment()
//}
//
//interface IRes {
//    val id :String
//    fun String.lastSegment(divider: String = "/"): String {
//        return split(divider).last()
//    }
//}