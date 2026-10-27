// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = { items.filter { it.status == ItemStatus.NotStarted }.size }()
    val inProgress get() = { items.filter { it.status == ItemStatus.InProgress }.size }()
    val done get() = { items.filter { it.status == ItemStatus.Done }.size }()
    val overdue get() = { items.filter { it.isOverdue() }.size }()

    constructor(filename: String) : this() {
        load(filename)
    }

    fun load(filename: String) {
        Path(filename).forEachLine { line ->
            val (dueDate, status, description) = line.split(": ")
            items.add(ToDoItem(LocalDate.parse(dueDate), ItemStatus.valueOf(status), description))
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean = items.removeAll { it.status == ItemStatus.Done }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> =
        if (status == null) items.toList() else items.filter { it.status == status }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> =
        items.filter { it.dueDate == date }
}
