class GeometryCalculator {
    fun rectangleInfo(width: Int, height: Int) {
        val perimeter = 2 * (width + height)
        val area = width * height

        println("Прямоугольник $width х $height:")
        println("Периметр: $perimeter")
        println("Площадь: $area")

        if (perimeter == area) {
            println("Удивительно! Периметр равен площади!")
        }
    }
    fun triangleInfo(a: Int, b: Int, c: Int) {
        val perimeter = a + b + c
        val sides = listOf(a, b, c).sorted()
        val isRightTriangle = sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]
        println("Треугольник со сторонами: $a, $b, $c")
        if (isRightTriangle) {
            println("Это прямоугольный треугольник!")
        } else {
            println("Это не прямоугольный треугольник")
        }
        println("Периметр: $perimeter")
    }
    fun circleInfo(radius: Int) {
        val circumference = 2 * Math.PI * radius
        val area = Math.PI * radius * radius

        println("Окружность с радиусом $radius:")
        println("Длина окружности: $circumference")
        println("Площадь круга: $area")
        println()
    }
}