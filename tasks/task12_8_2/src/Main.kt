// Task 12.8.2: program to manipulate playing cards
fun main() {
    val deck = mutableListOf<Card>()

    for (suit in Suit.values()) {
        for (rank in Rank.values()) {
            deck.add(Card(rank, suit))
        }
    }

    deck.shuffle()
    deck.forEach { card -> println(card.fullName) }
}
