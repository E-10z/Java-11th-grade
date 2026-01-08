
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}

  void init(){

    // This example we are substituting all lower case 
    // letters to another lower case letter.
	
    char[] sub = new char[26];
    sub[0] = 'a';
    sub[1] = 'b';
    sub[2] = 'c';
    sub[3] = 'd';
    sub[4] = 'e';
    sub[5] = 'f';
    sub[6] = 'g';
    sub[7] = 'h';
    sub[8] = 'i';
    sub[9] = 'j';
    sub[10] = 'k';
    sub[11] = 'l';
    sub[12] = 'm';
    sub[13] = 'n';
    sub[14] = 'o';
    sub[15] = 'p';
    sub[16] = 'q';
    sub[17] = 'r';
    sub[18] = 's';
    sub[19] = 't';
    sub[20] = 'u';
    sub[21] = 'v';
    sub[22] = 'w';
    sub[23] = 'x';
    sub[24] = 'y';
    sub[25] = 'z';
	
    char[] sub2 = new char[26];
    sub2[0] = '\u1000';  
    sub2[1] = '\u1001';  
    sub2[2] = '\u1002';  
    sub2[3] = '\u1003'; 
    sub2[4] = '\u1004'; 
    sub2[5] = '\u1005'; 
    sub2[6] = '\u1006'; 
    sub2[7] = '\u1007'; 
    sub2[8] = '\u1008';
    sub2[9] = '\u1009'; 
    sub2[10] = '\u100A';
    sub2[11] = '\u100B';
    sub2[12] = '\u100C';
    sub2[13] = '\u100D';
    sub2[14] = '\u100E';
    sub2[15] = '\u100F';
    sub2[16] = '\u1010';
    sub2[17] = '\u1011';
    sub2[18] = '\u1012';
    sub2[19] = '\u1013';
    sub2[20] = '\u1014';
    sub2[21] = '\u1015';
    sub2[22] = '\u1016';
    sub2[23] = '\u1017';
    sub2[24] = '\u1018';
    sub2[25] = '\u1019';
    
    // Encoding message
    String file = Input.readFile("test.txt");

    //substitution
    String encodedMsg1 = subEncryption(file,sub,sub2);
    Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    Input.writeFile("Encode2.txt",encodedMsg2);

    // cut and swap
    String encodedMsg3 = cutAndSwap(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    // Braille cipher
    String encodedMsg4 = encode2(encodedMsg3);
    Input.writeFile("Encode4.txt", encodedMsg4);
	
    // decoding message
    String file2 = Input.readFile("Encode4.txt");

    String decodedMsg1 = decode2(file2);
    Input.writeFile("Decode1.txt", decodedMsg1);
    
    String decodedMsg2 = cutAndSwap(decodedMsg1);
    Input.writeFile("Decode2.txt", decodedMsg2);
    
    String decodedMsg3 = decode(decodedMsg2);
    Input.writeFile("Decode3.txt", decodedMsg3);

    String decodedMsg4 = subEncryption(decodedMsg3, sub2, sub);
    Input.writeFile("Decode4.txt", decodedMsg4);
  }

  String cutAndSwap(String txt) {
    if(txt.length() < 4) return txt;

    String firstTwo = txt.substring(0,2);
    String middle = txt.substring(2, txt.length() - 2);
    String lastTwo = txt.substring(txt.length() - 2);

    return lastTwo + middle + firstTwo;
  }
  
  //Cipher encoding with no wrapping
  String encode(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      ascii+= 5;
      bld+= (char)ascii;
    }
    return bld;
  }

  String decode(String txt){
    String bld="";
    int ascii; 
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      ascii=(int)ch;
      ascii-= 5;
      bld+= (char)ascii;
    }
    return bld;
  }

  String encode2(String txt){
    String bld="";
    int ascii;
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      if (ch >= 32 && ch <= 127) {
        ascii = 0x2800 + (ch - 32);
        bld += (char)ascii;
      } else {
        bld += ch;
      }
    }
    return bld;
  }

  String decode2(String txt){
    String bld="";
    int ascii; 
    char ch='\0';
    for(int x=0; x<=txt.length()-1;x++){
      ch=txt.charAt(x);
      if (ch >= 0x2800 && ch <= 0x28FF) {
        ascii = (ch - 0x2800) + 32;
        bld += (char)ascii;
      } else {
        bld += ch;
      }
    }
    return bld;
  }
	
  // Substitution encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
    char ch ='\0';
    int index=0;
    for(int x=0; x<=s.length()-1; x++){
      ch=s.charAt(x);
      index=indexOf(ch,sub);
      if(index!=-1){
        bld+=sub2[index];
      }
      else{
        bld+=ch;
      }
    }
    return bld;
  }
  
  int indexOf(char ch, char[] arry){
    for(int x=0; x<=arry.length-1; x++){
      if(arry[x]==ch){
        return x;
      }
    }
    return -1;
  }
}

