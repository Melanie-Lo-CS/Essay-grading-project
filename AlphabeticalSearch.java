public class AlphabeticalSearch {


  private static void printArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

  }
  public static void main (String[]args){


    //String[] word = new string[9]
    String[] word = {"The", "quick", "brown","fox", "jumps", "over", "the?", "lazy", "dog."};
   printArray(word);
    for (int i = 0; i < word.length; i++ ) {
      word[i] = word[i].toLowerCase();
    }
    System.out.println("\n In lower case");
     printArray(word);
     for (int i = 0; i < word.length; i++){

       // for periods and symbols
       if(word[i].endsWith(".")) {
         word[i] = word[i].substring(0,word[i].length()-1);
         System.out.println("\n removed period");
}
}

for (int i = 0; i < word.length; i++){

  // for periods and symbols
  if(word[i].endsWith("?")) {
    word[i] = word[i].substring(0,word[i].length()-1);
    System.out.println("\n removed ?");
}
}
printArray(word);
for (int i = 0; i < word.length; i++){

  // for periods and symbols
  if(word[i].endsWith("!")) {
    word[i] = word[i].substring(0,word[i].length()-1);
    System.out.println("\n removed !");
}


for (int i = 0; i <word.length; i++) {
  String temp = "";
  if(word[i].compareTo(word[i+1]) > word[i+1].compareTo(word[i])) {
    temp = word[i];
    word[i] = word[i+1];
    word[i+1] = temp;
  }
  printArray(word);
}
}
}



}
}
