fun main(){
    //1
    val sword = Weapon()
//    sword.name = "Стальной меч"
//    sword.damage = 25
//    sword.durability = 80
//    sword.type = "Рубящее"
//    sword.use()
//    sword.use()
//    sword.showInfo()
//    sword.upgrade(15)
//    sword.showInfo()
    //2
//    val student = Student("Денис", 18)
//    student.introduce()
//    student.haveBirthday()
    //3
//    val ivan = Student("Иван", 19)
//    val denis = Student("Денис", 20)
//    val group = Group("ИСП-231")
//    group.addStudent(ivan)
//    group.addStudent(denis)
//    group.listStudents()
//    group.celebrateBirthdays()
//    group.listStudents()

    //4
    val calculator = GeometryCalculator()

    println("=== ПРЯМОУГОЛЬНИКИ ===")
    calculator.rectangleInfo(4, 5)
    calculator.rectangleInfo(3, 6)

    println("=== ОКРУЖНОСТИ ===")
    calculator.circleInfo(5)
    calculator.circleInfo(10)

    println("=== ТРЕУГОЛЬНИКИ ===")
    calculator.triangleInfo(3, 4, 5)
    calculator.triangleInfo(5, 5, 5)
    calculator.triangleInfo(2, 3, 4)
}

