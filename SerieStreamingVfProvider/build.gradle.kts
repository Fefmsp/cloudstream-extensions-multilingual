// use an integer for version numbers
version = 1


cloudstream {
    language = "fr"
    // All of these properties are optional, you can safely remove them

     description = "Serie streaming en plus d'être un site efficace et plaisant dispose d'un contenu visuel diversifié"
     authors = listOf("Sarlay", "Eddy976")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://voir.seriestreaming.vip/images/logo_small.webp"
}