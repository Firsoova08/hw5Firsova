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
    val ivan = Student("Иван", 19)
    val denis = Student("Денис", 20)
    val group = Group("ИСП-231")
    group.addStudent(ivan)
    group.addStudent(denis)
    group.listStudents()
    group.celebrateBirthdays()
    group.listStudents()

}