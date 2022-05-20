package com.andreikingsley.ggdsl.util.color

interface Color {
    companion object {
        fun fromHex(hexString: String) = StandardColor(hexString)
        fun fromName(name: String) = StandardColor(name)
        fun fromRGB(r: Int, g: Int, b: Int) = StandardColor(
            String.format("#%02X%02X%02X", r, g, b)
        )

        // todo move to hex???

        val RED = StandardColor("red")
        val BLUE = StandardColor("blue")
        val GREEN = StandardColor("green")

        val BLACK = StandardColor("black")
        val WHITE = StandardColor("white")
        val GREY = StandardColor("grey")

        val YELLOW = StandardColor("yellow")
        val ORANGE = StandardColor("orange")
        //val PURPLE = StandardColor("purple")

        // todo not work in echarts
        val DARK_RED = StandardColor("dark_red")
        val DARK_BLUE = StandardColor("dark_blue")
        val DARK_GREEN = StandardColor("dark_green")

        val PEACH = StandardColor("#ffe5b4")
    }
}
//TODO
data class StandardColor internal constructor(val description: String) : Color
