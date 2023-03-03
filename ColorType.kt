enum class ColorType {
    RED {
        override fun colorName() = "Red"
        override val rgb = "0xFF0000"
    },
    BLUE {
        override fun colorName() = "Blue"
        override val rgb = "0x0000FF"
    },
    GREEN {
        override fun colorName() = "Green"
        override val rgb = "0x00FF00"
    },
    YELLOW{
        override fun colorName() = "Yellow"
        override val rgb = "0xFFFF00"
    },
    ORANGE{
        override fun colorName() = "Orange"
        override val rgb = "0xFF7F00"
    },
    PURPLE{
        override fun colorName() = "Purple"
        override val rgb = "0x4B0082"
    };
    abstract fun colorName(): String
    abstract val rgb: String

    open fun Rainbow(){
        println(RED)
        println(ORANGE)
        println(YELLOW)
        println(GREEN)
        println(BLUE)
        println(PURPLE)
    }
    open fun FallColor(){
        println(RED)
        println(ORANGE)
        println(YELLOW)
    }
    open fun ColdColor(){
        println(GREEN)
        println(BLUE)
        println(PURPLE)
    }
    open fun TrafficLight(){
        println(RED)
        println(YELLOW)
        println(GREEN)
    }
}