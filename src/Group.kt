class Group(val groupName: String) {
    private val students = mutableListOf<Student>()

    init {
        println("Создана группа")
    }

    fun addStudent(student: Student) {
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }

    fun listStudents() {
        println("Студенты группы $groupName:")
        students.forEach { it.introduce() }
    }

    fun celebrateBirthdays() {
        println("В группе $groupName празднуют дни рождения!")
        students.forEach { it.haveBirthday() }
    }
}