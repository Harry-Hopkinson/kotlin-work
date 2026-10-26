// Task 12.8.3: program to manipulate playing cards
fun main() {
    val deck = mutableListOf<Card>()

    for (suit in Card.Suit.values()) {
        for (rank in Card.Rank.values()) {
            deck.add(Card(rank, suit))
        }
    }

    deck.shuffle()
    deck.forEach { card -> println(card.fullName) }
}
