enum class DaysType {
    MONDAY {
        override fun dayName() = "Понедельник"
        override val dayType = "1"
    },
    TUESDAY {
        override fun dayName() = "Вторник"
        override val dayType = "2"
    },
    WEDNESDAY {
        override fun dayName() = "Среда"
        override val dayType = "3"
    },
    THURSDAY{
        override fun dayName() = "Четверг"
        override val dayType = "4"
    },
    FRIDAY{
        override fun dayName() = "Пятница"
        override val dayType = "5"
    },
    SATURDAY{
        override fun dayName() = "Суббота"
        override val dayType = "6"
    },
    SUNDAY{
        override fun dayName() = "Воскресенье"
        override val dayType = "7"
    };
    abstract fun dayName(): String
    abstract val dayType: String

    open fun dayOff(){
        println(SATURDAY)
        println(SUNDAY)
    }
    open fun dayOn(){
        println(MONDAY)
        println(TUESDAY)
        println(WEDNESDAY)
        println(THURSDAY)
        println(FRIDAY)
    }
    open fun evenDay(){
        println(MONDAY)
        println(WEDNESDAY)
        println(FRIDAY)
        println(SUNDAY)
    }
    open fun oddDay(){
        println(TUESDAY)
        println(THURSDAY)
        println(SATURDAY)
    }
}