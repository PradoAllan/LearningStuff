class Song (val name: String,
            val artist: String)
{
    fun play()
    {
        println("The ${this.name} music by the ${this.artist} is playing!!!")
    }
    fun stop()
    {
        println("Stopping the ${this.name}...")
    }
}