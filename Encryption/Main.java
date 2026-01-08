class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    // Level 1 : Swap every pair of characters
    String file = Input.readFile("Original.txt");
    System.out.println("Original: " + file);
    System.out.println("Encoded: " + swapEncode(file));
    System.out.println("Decoded: " + swapDecode(swapEncode(file)));

    // Level 2: Round Robin shift characters by 1,3,5
    String file1 = Input.readFile("test.txt");
    System.out.println("Original: " + file1);
    System.out.println("Round Robin Encoded: " + roundRobinEncode(file1));
    System.out.println("Round Robin Decoded: " + roundRobinDecode(roundRobinEncode(file1)));

    // Level 3: Heart substitution
    String file2 = Input.readFile("New.txt");
    System.out.println("Original: " + file2);
    System.out.println("Substituted: " + heartEncode(file2));
    System.out.println("Restored: " + heartDecode(heartEncode(file2)));
  }

  // Level 1: Swap Cipher
  String swapEncode(String msg) {
    String bld = "";
    int start = 0;

    for (int i = 0; i <= msg.length(); i++) {
      if (i == msg.length() || msg.charAt(i) == ' ') {
        for (int x = start; x < i; x += 2) {
          if (x + 1 < i) {
            bld += msg.charAt(x + 1);
            bld += msg.charAt(x);
          } else {
            bld += msg.charAt(x);
          }
        }
        if (i < msg.length()) bld += ' ';
        start = i + 1;
      }
    }
    return bld;
  }

  String swapDecode(String msg) {
    return swapEncode(msg);
  }

  // Level 2: Round Robin Cipher
  String roundRobinEncode(String txt) {
    String bld = "";

    for (int i = 0; i < txt.length(); i++) {
      char ch = txt.charAt(i);

      if (i % 3 == 0) ch = (char)(ch + 1);
      else if (i % 3 == 1) ch = (char)(ch + 3);
      else ch = (char)(ch + 5);

      bld += ch;
    }
    return bld;
  }

  String roundRobinDecode(String txt) {
    String bld = "";

    for (int i = 0; i < txt.length(); i++) {
      char ch = txt.charAt(i);

      if (i % 3 == 0) ch = (char)(ch - 1);
      else if (i % 3 == 1) ch = (char)(ch - 3);
      else ch = (char)(ch - 5);

      bld += ch;
    }
    return bld;
  }

  // Level 3: Heart Substitution
 String heartEncode(String msg) {
  String bld = "";
  char[] symbols = {'\u2665', '\u2605', '\u2666', '\u2736', '\u2663', '\u2708', '\u2615', '\u263A', '\u262F', '\u2702'}; 

  for (int i = 0; i < msg.length(); i++) {
    bld += msg.charAt(i);

    if (i < msg.length() - 1) {
      bld += symbols[i % symbols.length];
    }
  }
  return bld;
}

String heartDecode(String msg) {
  String bld = "";

  for (int i = 0; i < msg.length(); i++) {
    char c = msg.charAt(i);

    if (c != '\u2665' && c != '\u2605' && c != '\u2666' && c != '\u2736' && c != '\u2663' && c != '\u2708' && c != '\u2615' && c != '\u263A' && c != '\u262F' && c != '\u2702') {
      bld += c;
    }
  }
  return bld;
}
}