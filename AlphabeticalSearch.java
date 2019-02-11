public class AlphabeticalSearch {


  private static void printArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

  }
  public static void main (String[]args){
String save;
Boolean stop = false;
int compare;
int compareNumber = 0;
int stopCount = 0;

    //String[] word = new string[9]
    String[] word = {"The", "quick", "brown","fox", "jumps", "over", "the", "lazy", "dog."};
   printArray(word);
    for (int i = 0; i < word.length; i++ ) {
      word[i] = word[i].toLowerCase();
    }
    System.out.println("\nIn lower case");
     printArray(word);
     for (int i = 0; i < word.length; i++){

       // for periods and symbols
       if(word[i].endsWith(".")) {
         word[i] = word[i].substring(0,word[i].length()-1);
         System.out.println("\nRemoved period");
         printArray(word);

}
}

for (int i = 0; i < word.length; i++){

  // for periods and symbols
  if(word[i].endsWith("?")) {
    word[i] = word[i].substring(0,word[i].length()-1);
    printArray(word);
}
}

for (int i = 0; i < word.length; i++){

  // for periods and symbols
  if(word[i].endsWith("!")) {
    word[i] = word[i].substring(0,word[i].length()-1);
    printArray(word);
}
}
while (stop == false) {
for(int i = 0; i < word.length-1; i++){
  compare = word[i+1].compareTo(word[i]);
  compareNumber += 1;
  if (word[i+1].equals(word[i])) {} else {
    if ( compare < 0 ) {
      stopCount += 1;
      save = word[i+1];
      word[i+1] = word[i];
      word[i] = save;
    }
    if (stopCount == 0) {
      stop = true;
    } else {
      stopCount = 0;
    }
}
for (String element : word) {
}
}


}

}
}
