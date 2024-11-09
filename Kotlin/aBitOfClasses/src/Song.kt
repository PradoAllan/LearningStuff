//class Song (val name: String,
//            val artist: String)
//{
//    fun play()
//    {
//        println("The ${this.name} music by the ${this.artist} is playing!!!")
//    }
//    fun stop()
//    {
//        println("Stopping the ${this.name}...")
//    }
//}

class Song (name: String, artist: String, duration: Double)
{
    val name = name
    val artist = artist
    val duration = duration

    fun play()
    {
        println("${this.name} from ${this.artist} is playing!!")
    }

    fun stop()
    {
        println("Stopping ${this.name}")
    }

    fun showInformation()
    {
        println("-> ${this.name}\n-> ${this.artist}\n-> ${this.duration}")
    }
}