class Weapon {
        var name: String = "Оружие"
        var damage: Int = 10
        var durability: Int = 100
        var type: String = "Обычное"

        fun showInfo() {
            println("Оружие: $name | Урон: $damage | Прочность: $durability | Тип: $type")
        }

        fun use() {
            if (durability <= 0) {
                println("Оружие сломано!")
            } else {
                durability -= 10
                if (durability <= 0) {
                    durability = 0
                    println("Оружие сломано!")
                } else {
                    println("Оружие использовано. Осталось прочности: $durability")
                }
            }
        }

        fun upgrade(bonus: Int) {
            damage += bonus
            println("Урон увеличен на $bonus. Теперь урон: $damage")
        }
    }
