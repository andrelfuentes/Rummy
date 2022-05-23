public static void main(String args[])
{
  Table t = new Table();
  t.setVisible(true);
}
void layCard(Card card)
{
  char rank = card.getRank();
  char suit = card.getSuit();
  int suitIndex =  Card.getSuitIndex(suit);
  int rankIndex =  Card.getRankIndex(rank);
  //setPanels[rankIndex].array[suitIndex].setText(card.toString());
  System.out.println("laying " + card);
  setPanels[rankIndex].array[suitIndex].setIcon(card.getCardImage());
}
