package klondike.cards

import scala.util.Random

object Cards  {

  //clumsy enumeration definition
  sealed abstract class Suite
  case object Spade extends Suite
  case object Heart extends Suite
  case object Club extends Suite
  case object Diamond extends Suite

  sealed abstract class Rank
  case object Two extends Rank
  case object Three extends Rank
  case object Four extends Rank
  case object Five extends Rank
  case object Six extends Rank
  case object Seven extends Rank
  case object Eight extends Rank
  case object Nine extends Rank
  case object Ten extends Rank
  case object Jack extends Rank
  case object Queen extends Rank
  case object King extends Rank
  case object Ace extends Rank

  val suites = Set(Spade, Heart, Club, Diamond)
  val ranks = List(Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace)

  //the interesting part
  case class Card(rank: Rank, suite: Suite)

  class Deck(pCards: List[Card] = for (r <- ranks; s <- suites) yield Card(r, s)) {

    val cards = if (isValidDeck(pCards)) pCards
    else throw new RuntimeException("Deck is invalid!")

    def shuffle() = new Deck(Random.shuffle(cards))

    def pullFromTop() = (cards.head, new Deck(cards.tail))

    def addToTop(card: Card) = new Deck(card :: cards)

    def addToTop(cardsToAdd: List[Card]) = new Deck(cardsToAdd ::: cards)

    private def isValidDeck(cards: List[Card]) = cards.size <= 52 && cards.distinct.size == cards.size

  }

}