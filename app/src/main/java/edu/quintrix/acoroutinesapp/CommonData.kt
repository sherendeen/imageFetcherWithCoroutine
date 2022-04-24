package edu.quintrix.acoroutinesapp

val commonData : CommonData = CommonData()

class CommonData {

    public fun getImageUrls() : Array<String> {
        return this.imageUrls
    }

    public fun getImageUrlAtIndex(index : Int) : String {

        return if ( index > -1 && index < 11) {
            this.imageUrls[index]
        } else {
            // return default
            this.imageUrls[0]
        }

    }

    public fun getImageDescriptions() : Array<String> {
        return this.imageDescriptions
    }

    public fun getImageDescriptionAtIndex(index : Int) : String {
        return if ( index > -1 && index < 11) {
            this.imageDescriptions[index]

        } else {
            this.imageDescriptions[0]
        }
    }

    private val imageUrls : Array<String> = arrayOf(
        "https://images.unsplash.com/photo-1649239293842-266bc3268525?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=682&q=80",
        "https://images.unsplash.com/photo-1649784709457-2b18913a31a7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=688&q=80",
        "https://images.unsplash.com/photo-1649147735150-dd77ff9a3d47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80",
        "https://images.unsplash.com/photo-1648863224645-a896e7d2dda3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=735&q=80",
        "https://images.unsplash.com/photo-1649608118930-70b0a62cdf62?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=627&q=80",
        "https://images.unsplash.com/photo-1649380889122-279dcc068c0e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80",
        "https://images.unsplash.com/photo-1645933228796-c58c0a723475?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80",
        "https://images.unsplash.com/photo-1649400277426-062b73ae7095?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=678&q=80",
        "https://images.unsplash.com/photo-1647636277270-3d56f257411e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=522&q=80",
        "https://images.unsplash.com/photo-1649088379614-cbe3e3b41b1a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=626&q=80"
    )

    private val imageDescriptions : Array<String> = arrayOf(
        "snow-covered mountain peak",
        "a pink flower",
        "a waterfall amidst a lush forest cliff",
        "dew covered leaves",
        "abstract, dark waves",
        "arctic pine needles",
        "a blurry, maybe abstract, photo that shows a canopy of trees",
        "abstract red, green, light blue, and other gradient colors",
        "Sydney Opera House with a purple and pink sky",
        "a scorching fire with billowing smoke around it"
    )

}